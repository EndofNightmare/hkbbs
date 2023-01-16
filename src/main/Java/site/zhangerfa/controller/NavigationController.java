package site.zhangerfa.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.zhangerfa.pojo.Card;
import site.zhangerfa.pojo.Hole;
import site.zhangerfa.pojo.Page;
import site.zhangerfa.pojo.User;
import site.zhangerfa.service.CardService;
import site.zhangerfa.service.HoleService;
import site.zhangerfa.service.UserService;
import site.zhangerfa.util.CardUtil;
import site.zhangerfa.util.HostHolder;

import java.util.List;
import java.util.Map;

/**
 * 导航栏跳转控制器
 */
@Controller
public class NavigationController {
    @Resource
    private CardService cardService;

    @Resource
    private HoleService holeService;

    @Resource
    private CardUtil cardUtil;

    // 同一次会话中共享的用户数据存放在这里
    @Resource
    private HostHolder hostHolder;

    /**
     * 跳转到我的主页
     */
    @RequestMapping("/my/{cardCurrentPage}/{holeCurrentPage}")
    public String my(Model model, @PathVariable int cardCurrentPage, @PathVariable int holeCurrentPage){
        // 分页信息
        Page cardPage = new Page();
        cardPage.setRows(cardService.getNumOfCards());
        cardPage.setCurrent(cardCurrentPage);
        cardPage.setPath("/my");
        model.addAttribute("cardPage", cardPage);
        Page holePage = new Page();
        holePage.setRows(holeService.getNumOfRows());
        holePage.setCurrent(holeCurrentPage);
        holePage.setPath("/my");
        model.addAttribute("holePage", holePage);

        String stuId = hostHolder.getUser().getStuId();
        List<Card> cards = cardService.getOnePageCards(stuId,
                cardPage.getOffset(), cardPage.getLimit());// 获取一页卡片

        model.addAttribute("user", hostHolder.getUser());
        model.addAttribute("cards", cards);

        // 树洞信息
        List<Hole> holes = holeService.getOnePageHoles("0", holePage.getOffset(), holePage.getLimit());
        holes = cardUtil.completeHoles(holes);
        model.addAttribute("holes", holes);

        return "site/my-wall";
    }

    /**
     * 访问卡片墙
     * @param page 分页对象
     * @param model
     * @return
     */
    @GetMapping("/wall")
    public String wall(Page page, Model model){
        page.setRows(cardService.getNumOfCards());
        page.setPath("/wall");

        // 帖子信息
        List<Card> cards = cardService.getOnePageCards("0",
                page.getOffset(), page.getLimit());// 获取一页卡片
        List<Map> maps = cardUtil.completeCard(cards);
        model.addAttribute("maps", maps);
        model.addAttribute("user", hostHolder.getUser());
        return "site/wall";
    }

    /**
     * 访问树洞
     */
    @RequestMapping("/hole")
    public String hole(Page page, Model model){
        page.setRows(holeService.getNumOfRows());
        page.setPath("/hole");

        // 树洞信息
        List<Hole> holes = holeService.getOnePageHoles("0", page.getOffset(), page.getLimit());
        holes = cardUtil.completeHoles(holes);
        model.addAttribute("holes", holes);
        model.addAttribute("user", hostHolder.getUser());
        return "site/hole";
    }

    /**
     * 访问域名时资源跳转
     * @return
     */
    @RequestMapping("/")
    public String homeRedirect(){
        return "forward:/wall";
    }

    /**
     * 跳转到卡片墙页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "site/login";
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/register")
    public String register(){
        return "site/register";
    }

    @RequestMapping("/setting")
    public String setting(Model model){
        User user = hostHolder.getUser();
        model.addAttribute("user", user);
        return "site/setting";
    }

}
