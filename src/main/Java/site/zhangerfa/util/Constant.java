package site.zhangerfa.util;

public class Constant {
    /**
     * 回帖对象的类型
     */
    public static final int ENTITY_TYPE_CARD = 1; // 卡片
    public static final int ENTITY_TYPE_COMMENT = 2; // 回帖
    public static final int ENTITY_TYPE_HOLE = 3; // 树洞
    public static final int ENTITY_TYPE_HOLE_COMMENT = 4; // 树洞的回帖

    /**
     * 树洞随机昵称生成用的字符集
     */
    public static String[] FIRSTNAME = {"西一", "西二", "百惠园", "美食屋", "西华园", "百景园",
            "喻园", "集锦园", "集贤楼", "紫荆园", "东一", "东三", "东四", "韵苑",
            "学一", "学二", "东园", "东篱", "东教工"};
    public static String[] SECONDNAME = {"蒸羊羔", "蒸熊掌", "蒸鹿尾", "烧花鸭", "烧雏鸡",
            "烧子鹅", "炉猪", "炉鸭", "酱鸡", "腊肉", "松花", "小肚", "晾肉",
            "香肠", "什锦苏盘", "熏鸡白肚", "清蒸八宝猪", "江米酿鸭子",
            "罐野鸡", "罐鹌鹑", "卤什件", "卤子鹅", "山鸡", "兔脯", "菜蟒",
            "银鱼", "清蒸哈什蚂", "烩鸭腰", "烤鸭条", "清拌腰丝", "黄心管",
            "焖白鳝", "焖黄鳝", "豆鼓鲇鱼", "锅烧鲤鱼", "烀烂甲鱼", "抓炒鲤鱼",
            "抓炒对虾", "软炸里脊", "软炸鸡", "什锦套肠", "卤煮寒鸦",
            "麻酥油卷", "熘鲜蘑", "熘鱼脯", "熘鱼肚", "熘鱼片", "醋烟肉片",
            "烟三鲜", "烟鸽子蛋", "熘白蘑", "熘什件", "炒银丝", "烟刀鱼",
            "清蒸火腿", "炒白虾", "炝青蛤", "炒面鱼", "炝竹笋", "芙蓉燕菜", "炒虾仁",
            "熘腰花", "烩海参", "炒蹄筋", "锅烧海参", "锅烧白菜", "炸木耳", "炒肝尖",
            "桂花翅子", "清蒸翅子", "炸飞禽炸汁", "炸排骨", "清蒸江瑶柱", "糖熘芡仁米",
            "拌鸡丝", "拌肚丝", "什锦豆腐", "什锦丁", "糟鸭", "糟熘鱼片", "熘蟹肉",
            "炒蟹肉", "烩蟹肉", "清拌蟹肉", "蒸南瓜", "酿倭瓜", "炒丝瓜", "酿冬瓜烟鸭掌",
            "焖鸭掌", "焖笋", "炝茭白", "茄子晒炉肉", "鸭羹", "蟹肉羹", "鸡血汤",
            "三鲜木樨汤", "红丸子", "白丸子", "南煎丸子", "四喜丸子", "三鲜丸子", "氽丸子",
            "鲜虾丸子", "鱼脯丸子", "饹炸丸子", "豆腐丸子", "樱桃肉", "马牙肉", "米粉肉",
            "一品肉", "栗子肉", "坛子肉", "红焖肉", "黄焖肉", "酱豆腐肉", "晒炉肉", "炖肉",
            "黏糊肉", "烀肉", "扣肉", "松肉", "罐肉", "烧肉", "大肉", "烤肉", "白肉",
            "红肘子", "白肘子", "熏肘子", "水晶肘子", "蜜蜡肘子", "锅烧肘子", "扒肘条",
            "炖羊肉", "酱羊肉", "烧羊肉", "烤羊肉", "清羔羊肉", "五香羊肉", "氽三样",
            "爆三样", "炸卷果", "烩散丹", "烩酸燕", "烩银丝", "烩白杂碎", "氽节子",
            "烩节子", "炸绣球", "三鲜鱼翅", "栗子鸡", "氽鲤鱼", "酱汁鲫鱼", "活钻鲤鱼",
            "板鸭", "筒子鸡", "烩脐肚", "烩南荠", "爆肚仁", "盐水肘花", "锅烧猪蹄",
            "拌稂子", "炖吊子", "烧肝尖", "烧肥肠", "烧心", "烧肺", "烧紫盖", "烧连帖",
            "烧宝盖", "油炸肺", "酱瓜丝", "山鸡丁", "拌海蜇", "龙须菜", "炝冬笋",
            "玉兰片", "烧鸳鸯", "烧鱼头", "烧槟子", "烧百合", "炸豆腐", "炸面筋", "炸软巾",
            "糖熘饹", "拔丝山药", "糖焖莲子", "酿山药", "杏仁酪", "小炒螃蟹", "氽大甲",
            "炒荤素", "什锦葛仙米", "鳎目鱼", "八代鱼", "海鲫鱼", "黄花鱼", "鲥鱼",
            "带鱼", "扒海参", "扒燕窝", "扒鸡腿", "扒鸡块", "扒肉", "扒面筋", "扒三样",
            "油泼肉", "酱泼肉", "炒虾黄", "熘蟹黄", "炒子蟹", "炸子蟹", "佛手海参", "炸烹",
            "炒芡子米", "奶汤", "翅子汤", "三丝汤", "熏斑鸠", "卤斑鸠", "海白米", "烩腰丁",
            "火烧茨菰", "炸鹿尾", "焖鱼头", "拌皮渣", "氽肥肠", "炸紫盖", "鸡丝豆苗",
            "十二台菜", "汤羊", "鹿肉", "驼峰", "鹿大哈", "插根", "炸花件，清拌粉皮",
            "炝莴笋", "烹芽韭", "木樨菜", "烹丁香", "烹大肉", "烹白肉", "麻辣野鸡", "烩酸蕾",
            "熘脊髓", "咸肉丝", "白肉丝", "荸荠一品锅", "素炝春不老", "清焖莲子", "酸黄菜",
            "烧萝卜", "脂油雪花菜", "烩银耳", "炒银枝", "八宝榛子酱", "黄鱼锅子", "白菜锅子",
            "什锦锅子", "汤圆锅子", "菊花锅子", "杂烩锅子", "煮饽饽锅子", "肉丁辣酱", "炒肉丝",
            "炒肉片", "烩酸菜", "烩白菜", "烩豌豆", "焖扁豆", "氽毛豆", "炒豇豆，外加腌苤蓝丝"};
}
