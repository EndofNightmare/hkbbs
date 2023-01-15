package site.zhangerfa.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HoleNicknameMapper {
    /**
     * 为一条树洞中的一个用户存储其随机昵称
     * @param holeId 树洞id
     * @param stuId 用户学号
     * @return
     */
    int insertHoleNickname(int holeId, String stuId, String nickname);

    /**
     * 获取传入树洞用户的随机昵称
     * @param holeId 树洞id
     * @param stuId 用户学号
     * @return
     */
    String selectHoleNickname(int holeId, String stuId);

    /**
     * 获取所有该树洞的昵称
     * @param holeId 树洞id
     * @return
     */
    String[] selectAllHoleNickname4Hole(int holeId);
}
