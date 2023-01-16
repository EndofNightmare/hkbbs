package site.zhangerfa.service;

import site.zhangerfa.pojo.Hole;

import java.util.List;

public interface HoleService {
    boolean addHole(Hole hole);

    boolean deleteHoleById(int id);

    Hole getHoleById(int id);

    /**
     * 将指定id卡片的评论数量加一，并为评论生成随机昵称
     * @param holeId 树洞id
     * @param posterId 发帖人id
     * @return
     */
    boolean addComment(int holeId, String posterId);

    boolean deleteComment(int id);

    int getNumOfRows();

    /**
     * 学号为 0时获取一页卡片
     * 学号不为 0时获取所有该学号用户发的卡片中的某一页
     * 一页卡片是指 从第 offset 张到第 limit 张
     *
     * @param posterId
     * @param offset 起始卡片
     * @param limit 终止卡片
     * @return
     */
    List<Hole> getOnePageHoles(String posterId, int offset, int limit);
}
