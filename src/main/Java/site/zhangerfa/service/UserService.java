package site.zhangerfa.service;

import org.springframework.transaction.annotation.Transactional;
import site.zhangerfa.pojo.LoginTicket;
import site.zhangerfa.pojo.User;

import java.util.Date;
import java.util.Map;

@Transactional
public interface UserService {

    /**
     * 判断用户是否已经注册
     *
     * @param stuId
     * @return
     */
    boolean isExist(String stuId);

    /**
     * 检查给定学号的用户密码是否正确
     *
     * @param stuId
     * @param password
     * @return 用户存在且密码匹配返回true
     */
    boolean checkPassword(String stuId, String password);

    /**
     * 查询指定学号的用户的用户名、注册时间
     *
     * @param stuId 学号
     * @return 以字典形式返回用户名和注册时间
     */
    Map<String, String> getUsernameAndCreateTimeByStuId(String stuId);

    /**
     * 查询指定学号用户的用户名
     *
     * @param stuId
     * @return 返回用户名，如果传入学号未注册则返回null
     */
    String getUsernameByStuId(String stuId);

    /**
     * 查询指定学号用户的注册时间
     *
     * @param stuId
     * @return 返回注册时间，如果传入学号未注册则返回null
     */
    Date getCreateTimeByStuId(String stuId);

    /**
     * 添加用户
     *
     * @param user
     */
    boolean add(User user);

    /**
     * 删除指定学号的用户
     *
     * @param stuId 学号
     * @return 如果删除成功返回 true ，其他情况都返回false，如学号不正确
     */
    boolean deleteByStuId(String stuId);

    /**
     * 修改指定学号的用户信息
     *
     * @param stuId
     * @param username 修改后信息封装在user对象中
     * @return 如果传入学号不存在则返回 “用户不存在”，否则返回 “true”
     */
    boolean updateUsername(String stuId, String username);

    /**
     * 修改指定学号用户的密码
     *
     * @param stuId
     * @param password
     * @return 如果传入学号不存在则返回 “用户不存在”，否则返回 “true”
     */
    boolean updatePassword(String stuId, String password);

    /**
     * 给传入学号的教育邮箱发送验证码
     * @param stuId
     */
    boolean sendCode(String stuId);

    /**
     * 检查指定学号的用户的输入密码、图像验证码是否正确
     *      如果正确生成登录凭证返回
     * @param rememberMe 是否勾选记住密码
     * @return {"result": boolean, // 存储是否登录成功
     *          ”msg“: String      // 存储给用户反馈的信息
     *          "ticket": LoginTicket // 如果登录成功存储ticket对象
     *          }
     */
    Map<String, Object> login(User user, boolean rememberMe);

    /**
     * 检查用户注册时传入的验证码是否正确
     * @param stuId
     * @param code
     * @return
     */
    boolean checkCode(String stuId, String code);

    /**
     * 根据传入的登录凭证码查询登录凭证信息
     * @param ticket 登录凭证码
     * @return
     */
    LoginTicket getTicket(String ticket);

    /**
     * 根据传入的登录凭证码修改登录凭证状态
     *
     * @param ticket 登录凭证码
     * @param status
     * @return
     */
    boolean updateTicket(String ticket, int status);

    /**
     * 通过登陆凭证码获取用户学号
     * @param ticket 登录凭证码
     * @return
     */
    String getStuIdByTicket(String ticket);

    /**
     * 检查登陆凭证是否有效
     *   传入ticket为空返回false
     *      判断状态码是否有效
     *      有效还要判断是否过期
     *      有效且未过期返回true
     *      有效但已过期，将状态改为无效，返回false
     * @param ticket
     * @return
     */
    boolean checkTicket(String ticket);

    /**
     * 根据 ticket返回用户信息
     * @param ticket
     * @return
     */
    User getUserByTicket(String ticket) throws IllegalAccessException;
}
