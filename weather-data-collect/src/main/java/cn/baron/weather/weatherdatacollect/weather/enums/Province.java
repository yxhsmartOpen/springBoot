package cn.baron.weather.weatherdatacollect.weather.enums;

import java.util.*;

/**
 * @author Baron
 * @date 2020/9/13 8:47
 */
public enum Province {
    /** 福建省 */
    FuJian("FuJian","福建", City.FuJianCity),
    /** 西藏自治区 */
    XiZang("XiZang","西藏", City.XiZangCity),
    /** 贵州省 */
    GuiZhou("GuiZhou","贵州", City.GuiZhouCity),
    /** 湖北省 */
    HuBei("HuBei","湖北", City.HuBeiCity),
    /** 湖南省 */
    HuNan("HuNan","湖南", City.HuNanCity),
    /** 广东省 */
    GuangDong("GuangDong","广东", City.GuangDongCity),
    /** 重庆 */
    ZhongQing("ZhongQing","重庆", City.ZhongQingCity),
    /** 安徽省 */
    AnHui("AnHui","安徽", City.AnHuiCity),
    /** 四川省 */
    SiChuan("SiChuan","四川", City.SiChuanCity),
    /** 新疆维吾尔自治区 */
    XinJiang("XinJiang","新疆", City.XinJiangCity),
    /** 江苏省 */
    JiangSu("JiangSu","江苏", City.JiangSuCity),
    /** 天津 */
    TianJin("TianJin","天津", City.TianJinCity),
    /** 吉林省 */
    JiLin("JiLin","吉林", City.JiLinCity),
    /** 澳门 */
    AoMen("AoMen","澳门", City.AoMenCity),
    /** 宁夏回族自治区 */
    NingXia("NingXia","宁夏", City.NingXiaCity),
    /** 河北省 */
    HeBei("HeBei","河北", City.HeBeiCity),
    /** 河南省 */
    HeNan("HeNan","河南", City.HeNanCity),
    /** 广西壮族自治区 */
    GuangXi("GuangXi","广西", City.GuangXiCity),
    /** 海南省 */
    HaiNan("HaiNan","海南", City.HaiNanCity),
    /** 上海 */
    ShangHai("ShangHai","上海", City.ShangHaiCity),
    /** 香港 */
    XiangGang("XiangGang","香港", City.XiangGangCity),
    /** 江西省 */
    JiangXi("JiangXi","江西", City.JiangXiCity),
    /** 云南省 */
    YunNan("YunNan","云南", City.YunNanCity),
    /** 甘肃省 */
    GanSu("GanSu","甘肃", City.GanSuCity),
    /** 山东省 */
    ShanDong("ShanDong","山东", City.ShanDongCity),
    /** 陕西省 */
    ShanXiS("ShanXiS","陕西", City.ShanXiSCity),
    /** 浙江省 */
    ZheJiang("ZheJiang","浙江", City.ZheJiangCity),
    /** 内蒙古自治区 */
    NeiMengGu("NeiMengGu","内蒙古", City.NeiMengGuCity),
    /** 青海省 */
    QingHai("QingHai","青海", City.QingHaiCity),
    /** 辽宁省 */
    LiaoNing("LiaoNing","辽宁", City.LiaoNingCity),
    /** 台湾省 */
    TaiWan("TaiWan","台湾", City.TaiWanCity),
    /** 黑龙江省 */
    HeiLongJiang("HeiLongJiang","黑龙江", City.HeiLongJiangCity),
    /** 山西省 */
    ShanXi("ShanXi","山西", City.ShanXiCity),
    /** 北京 */
    BeiJing("BeiJing","北京", City.BeiJingCity);

    /** 省拼音 */
    private final String code;
    /** 中文名称 */
    private final String name;
    /** 城市 */
    private final List<String> city;

    /** 字段map */
    private static Map<String, Province> map;

    Province(String code, String name, List<String> city) {
        this.code = code;
        this.name = name;
        this.city = city;
        initMap(name, this);
    }

    @Override
    public String toString() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<String> getCity() {
        return city;
    }

    public static Province getProvince(String name) {
        return map.get(name);
    }

    private void initMap(String name, Province province) {
        if (Province.map == null) {
            Province.map = new LinkedHashMap<String, Province>();
        }
        Province.map.put(name, province);
    }

    public static Map<String, Province> getProvinceMap() {
        return map;
    }

    public static class City {
        public static List<String> FuJianCity = Arrays.asList("厦门", "福州", "南平", "三明", "莆田", "泉州", "漳州", "龙岩", "宁德", "福清", "邵武", "武夷山", "建瓯", "永安", "石狮", "晋江", "南安", "龙海", "漳平", "福安", "福鼎");
        public static List<String> XiZangCity = Arrays.asList("拉萨", "日喀则", "昌都", "林芝", "山南", "那曲");
        public static List<String> GuiZhouCity = Arrays.asList("贵阳", "六盘水", "遵义", "安顺", "毕节", "铜仁", "清镇", "赤水", "仁怀", "凯里", "都匀", "兴义", "福泉", "盘州", "兴仁");
        public static List<String> HuBeiCity = Arrays.asList("武汉", "十堰", "襄阳", "荆门", "孝感", "黄冈", "鄂州", "黄石", "咸宁", "荆州", "宜昌", "随州。", "丹江口", "老河口", "枣阳", "宜城", "钟祥", "京山", "汉川", "应城", "安陆", "广水", "麻城", "武穴", "大冶", "赤壁", "石首", "洪湖", "松滋", "宜都", "枝江", "当阳", "恩施", "利川", "仙桃", "天门", "潜江");
        public static List<String> HuNanCity = Arrays.asList("长沙", "衡阳", "张家界", "常德", "益阳", "岳阳", "株洲", "湘潭", "郴州", "永州", "邵阳", "怀化", "娄底", "耒阳", "常宁", "浏阳", "津", "沅江", "汨罗", "临湘", "醴陵", "湘乡", "韶山", "资兴", "武冈", "邵东", "洪江", "冷水江", "涟源", "吉首", "宁乡");
        public static List<String> GuangDongCity = Arrays.asList("广州", "深圳", "清远", "韶关", "河源", "梅州", "潮州", "汕头", "揭阳", "汕尾", "惠州", "东莞", "珠海", "中山", "江门", "佛山", "肇庆", "云浮", "阳江", "茂名", "湛江", "英德", "连州", "乐昌", "南雄", "兴宁", "普宁", "陆丰", "恩平", "台山", "开平", "鹤山", "四会", "罗定", "阳春", "化州", "信宜", "高州", "吴川", "廉江", "雷州");
        public static List<String> ZhongQingCity = Collections.singletonList("重庆");
        public static List<String> AnHuiCity = Arrays.asList("合肥", "芜湖", "蚌埠", "淮南", "马鞍山", "淮北", "铜陵", "安庆", "黄山", "滁州", "阜阳", "宿州", "六安", "亳州", "池州", "宣城", "巢湖", "桐城", "天长", "明光", "界首", "宁国", "广德", "潜山", "无为");
        public static List<String> SiChuanCity = Arrays.asList("成都", "广元", "绵阳", "德阳", "南充", "广安", "遂宁", "内江", "乐山", "自贡", "泸州", "宜宾", "攀枝花", "巴中", "达州", "资阳", "眉山", "雅安", "崇州", "邛崃", "都江堰", "彭州", "江油", "什邡", "广汉", "绵竹", "阆中", "华蓥", "峨眉山", "万源", "简阳", "西昌", "康定", "马尔康", "隆昌", "射洪");
        public static List<String> XinJiangCity = Arrays.asList("乌鲁木齐", "克拉玛依", "吐鲁番", "哈密", "喀什", "阿克苏", "库车", "和田", "阿图什", "阿拉山口", "博乐", "昌吉", "阜康", "库尔勒", "伊宁", "奎屯", "塔城", "乌苏", "阿勒泰", "霍尔果斯", "自治区直辖 石河子", "阿拉尔", "图木舒克", "五家渠", "北屯", "铁门关", "双河", "可克达拉", "昆玉", "胡杨河");
        public static List<String> JiangSuCity = Arrays.asList("南京", "徐州", "连云港", "宿迁", "淮安", "盐城", "扬州", "泰州", "南通", "镇江", "常州", "无锡", "苏州", "常熟", "张家港", "太仓", "昆山", "江阴", "宜兴", "溧阳", "扬中", "句容", "丹阳", "如皋", "启东", "海安", "高邮", "仪征", "兴化", "泰兴", "靖江", "东台", "邳州", "新沂");
        public static List<String> TianJinCity = Collections.singletonList("天津");
        public static List<String> JiLinCity = Arrays.asList("长春", "吉林", "四平", "辽源", "通化", "白山", "松原", "白城", "榆树", "德惠", "蛟河", "桦甸", "舒兰", "磐石", "公主岭", "双辽", "梅河口", "集安", "洮南", "大安", "临江", "延吉", "图们", "敦化", "珲春", "龙井", "和龙", "扶余");
        public static List<String> AoMenCity = Collections.singletonList("澳门");
        public static List<String> NingXiaCity = Arrays.asList("银川", "石嘴山", "吴忠", "中卫", "固原", "灵武", "青铜峡");
        public static List<String> HeBeiCity = Arrays.asList("石家庄", "唐山", "秦皇岛", "邯郸", "邢台", "保定", "张家口", "承德", "沧州", "廊坊", "衡水", "辛集", "晋州", "新乐", "遵化", "迁安", "武安", "南宫", "沙河", "涿州", "定州", "安国", "高碑店", "平泉", "泊头", "任丘", "黄骅", "河间", "霸州", "三河", "深州");
        public static List<String> HeNanCity = Arrays.asList("郑州", "开封", "洛阳", "平顶山", "安阳", "鹤壁", "新乡", "焦作", "濮阳", "许昌", "漯河", "三门峡", "南阳", "商丘", "周口", "驻马店", "信阳", "荥阳", "新郑", "登封", "新密", "偃师", "孟州", "沁阳", "卫辉", "辉县", "长垣", "林州", "禹州", "长葛", "舞钢", "义马", "灵宝", "项城", "巩义", "邓州", "永城", "汝州", "济源");
        public static List<String> GuangXiCity = Arrays.asList("南宁", "桂林", "柳州", "梧州", "贵港", "玉林", "钦州", "北海", "防城港", "崇左", "百色", "河池", "来宾", "贺州", "岑溪", "桂平", "北流", "东兴", "凭祥", "合山", "靖西", "平果", "荔浦");
        public static List<String> HaiNanCity = Arrays.asList("海口", "三亚", "三沙", "儋州", "文昌", "琼海", "万宁", "东方", "五指山");
        public static List<String> ShangHaiCity = Collections.singletonList("上海");
        public static List<String> XiangGangCity = Collections.singletonList("香港");
        public static List<String> JiangXiCity = Arrays.asList("南昌", "九江", "景德镇", "鹰潭", "新余", "萍乡", "赣州", "上饶", "抚州", "宜春", "吉安", "瑞昌", "共青城", "庐山", "乐平", "瑞金", "德兴", "丰城", "樟树", "高安", "井冈山", "贵溪");
        public static List<String> YunNanCity = Arrays.asList("昆明", "曲靖", "玉溪", "丽江", "昭通", "普洱", "临沧", "保山", "安宁", "宣威", "芒", "瑞丽", "大理", "楚雄", "个旧", "开远", "蒙自", "弥勒", "景洪", "文山", "香格里拉", "腾冲", "水富", "澄江", "泸水");
        public static List<String> GanSuCity = Arrays.asList("兰州", "嘉峪关", "金昌", "白银", "天水", "酒泉", "张掖", "武威", "庆阳", "平凉", "定西", "陇南", "玉门", "敦煌", "临夏", "合作", "华亭");
        public static List<String> ShanDongCity = Arrays.asList("济南", "青岛", "聊城", "德州", "东营", "淄博", "潍坊", "烟台", "威海", "日照", "临沂", "枣庄", "济宁", "泰安", "滨州", "菏泽", "胶州", "平度", "莱西", "临清", "乐陵", "禹城", "安丘", "昌邑", "高密", "青州", "诸城", "寿光", "栖霞", "海阳", "龙口", "莱阳", "莱州", "蓬莱", "招远", "荣成", "乳山", "滕州", "曲阜", "邹城", "新泰", "肥城", "邹平");
        public static List<String> ShanXiSCity = Arrays.asList("西安", "延安", "铜川", "渭南", "咸阳", "宝鸡", "汉中", "榆林", "商洛", "安康", "韩城", "华阴", "兴平", "彬州", "神木", "子长");
        public static List<String> ZheJiangCity = Arrays.asList("杭州", "宁波", "湖州", "嘉兴", "舟山", "绍兴", "衢州", "金华", "台州", "温州", "丽水", "建德", "慈溪", "余姚", "平湖", "海宁", "桐乡", "诸暨", "嵊州", "江山", "兰溪", "永康", "义乌", "东阳", "临海", "温岭", "瑞安", "乐清", "龙港", "龙泉", "玉环");
        public static List<String> NeiMengGuCity = Arrays.asList("呼和浩特", "包头", "乌海", "赤峰", "通辽", "鄂尔多斯", "呼伦贝尔", "巴彦淖尔", "乌兰察布", "霍林郭勒", "满洲里", "牙克石", "扎兰屯", "额尔古纳", "根河", "丰镇", "乌兰浩特", "阿尔山", "二连浩特", "锡林浩特");
        public static List<String> QingHaiCity = Arrays.asList("西宁", "海东", "格尔木", "德令哈", "玉树", "茫崖");
        public static List<String> LiaoNingCity = Arrays.asList("沈阳", "大连", "鞍山", "抚顺", "本溪", "丹东", "锦州", "营口", "阜新", "辽阳", "盘锦", "铁岭", "朝阳", "葫芦岛", "新民", "瓦房店", "庄河", "海城", "东港", "凤城", "凌海", "北镇", "盖州", "大石桥", "灯塔", "调兵山", "开原", "北票", "凌源", "兴城");
        public static List<String> TaiWanCity = Arrays.asList("台北", "新北", "桃园", "台中", "台南", "高雄", "基隆", "新竹", "嘉义", "新竹", "苗栗", "彰化", "南投", "云林", "嘉义", "屏东", "宜兰", "花莲", "台东", "澎湖");
        public static List<String> HeiLongJiangCity = Arrays.asList("哈尔滨", "齐齐哈尔", "黑河", "大庆", "伊春", "鹤岗", "佳木斯", "双鸭山", "七台河", "鸡西", "牡丹江", "绥化", "尚志", "五常", "讷河", "北安", "五大连池", "嫩江", "铁力", "同江", "富锦", "虎林", "密山", "绥芬河", "海林", "宁安", "安达", "肇东", "海伦", "穆棱", "东宁", "抚远", "漠河");
        public static List<String> ShanXiCity = Arrays.asList("太原", "大同", "阳泉", "长治", "晋城", "朔州", "晋中", "运城", "忻州", "临汾", "吕梁", "古交", "高平", "介休", "永济", "河津", "原平", "侯马", "霍州", "孝义", "汾阳", "怀仁");
        public static List<String> BeiJingCity = Collections.singletonList("北京");
    }
}
