package cn.baron.weather.weatherdatacollect.weather.enums;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 南方五省城市全局天气枚举类
 *
 * @author Baron
 * @date  2017年3月25日 下午2:35:16
 */
public enum CsgCity {

    /**
     * 海口
     */
    HaiKou("HaiKou", "59758", "101310101", "海口", CsgProvince.HaiNan),
    /**
     * 三亚
     */
    SanYa("SanYa", "59948", "101310201", "三亚", CsgProvince.HaiNan),
    /**
     * 儋州
     */
    DanZhou("DanZhou", "59845", "101310205", "儋州", CsgProvince.HaiNan),
    /**
     * 琼海
     */
    QiongHai("QiongHai", "59855", "101310211", "琼海", CsgProvince.HaiNan),
    /**
     * 文昌
     */
    WenChang("WenChang", "59856", "101310212", "文昌", CsgProvince.HaiNan),
    /**
     * 万宁
     */
    WanNing("WanNing", "59951", "101310215", "万宁", CsgProvince.HaiNan),
    /**
     * 澄迈
     */
    ChengMai("ChengMai", "59843", "101310204", "澄迈", CsgProvince.HaiNan),
    /**
     * 定安
     */
    DingAn("DingAn", "59851", "101310209", "定安", CsgProvince.HaiNan),
    /**
     * 屯昌
     */
    TunChang("TunChang", "59854", "101310210", "屯昌", CsgProvince.HaiNan),
    /**
     * 陵水
     */
    LingShui("LingShui", "59954", "101310216", "陵水", CsgProvince.HaiNan),
    /**
     * 临高
     */
    LinGao("LinGao", "59842", "101310203", "临高", CsgProvince.HaiNan),
    /**
     * 昌江
     */
    ChangJiang("ChangJiang", "59847", "101310206", "昌江", CsgProvince.HaiNan),
    /**
     * 东方
     */
    DongFang("DongFang", "59838", "101310202", "东方", CsgProvince.HaiNan),
    /**
     * 五指山
     */
    WuZhiShan("WuZhiShan", "60651", "101310222", "五指山", CsgProvince.HaiNan),
    /**
     * 保亭
     */
    BaoTing("BaoTing", "59945", "101310214", "保亭", CsgProvince.HaiNan),
    /**
     * 乐东
     */
    LeDong("LeDong", "59940", "101310221", "乐东", CsgProvince.HaiNan),
    /**
     * 琼中
     */
    QiongZhong("QiongZhong", "59849", "101310208", "琼中", CsgProvince.HaiNan),
    /**
     * 白沙
     */
    BaiSha("BaiSha", "59848", "101310207", "白沙", CsgProvince.HaiNan),
    /**
     * 三沙
     */
    SanSha("SanSha", "71444", "101310301", "三沙", CsgProvince.HaiNan),
    /**
     * 南宁
     */
    NanNing("NanNing", "59431", "101300101", "南宁", CsgProvince.GuangXi),
    /**
     * 柳州
     */
    LiuZhou("LiuZhou", "59046", "101300301", "柳州", CsgProvince.GuangXi),
    /**
     * 桂林
     */
    GuiLin("GuiLin", "57957", "101300501", "桂林", CsgProvince.GuangXi),
    /**
     * 玉林
     */
    YuLin("YuLin", "59453", "101300901", "玉林", CsgProvince.GuangXi),
    /**
     * 河池
     */
    HeChi("HeChi", "59023", "101301201", "河池", CsgProvince.GuangXi),
    /**
     * 钦州
     */
    QinZhou("QinZhou", "59632", "101301101", "钦州", CsgProvince.GuangXi),
    /**
     * 防城港
     */
    FangChengGang("FangChengGang", "59635", "101301401", "防城港", CsgProvince.GuangXi),
    /**
     * 梧州
     */
    WuZhou("WuZhou", "59265", "101300601", "梧州", CsgProvince.GuangXi),
    /**
     * 北海
     */
    BeiHai("BeiHai", "59644", "101301301", "北海", CsgProvince.GuangXi),
    /**
     * 贵港
     */
    GuiGang("GuiGang", "59249", "101300801", "贵港", CsgProvince.GuangXi),
    /**
     * 崇左
     */
    ChongZuo("ChongZuo", "59425", "101300201", "崇左", CsgProvince.GuangXi),
    /**
     * 来宾
     */
    LaiBin("LaiBin", "59242", "101300401", "来宾", CsgProvince.GuangXi),
    /**
     * 百色
     */
    BaiSe("BaiSe", "59211", "101301001", "百色", CsgProvince.GuangXi),
    /**
     * 贺州
     */
    HeZhou("HeZhou", "59065", "101300701", "贺州", CsgProvince.GuangXi),
    /**
     * 北流
     */
    BeiLiu("BeiLiu", "60760", "101300903", "北流", CsgProvince.GuangXi),
    /**
     * 岑溪
     */
    CenXi("CenXi", "61082", "101300606", "岑溪", CsgProvince.GuangXi),
    /**
     * 东兴
     */
    DongXing("DongXing", "60031", "101301403", "东兴", CsgProvince.GuangXi),
    /**
     * 桂平
     */
    GuiPing("GuiPing", "60663", "101300802", "桂平", CsgProvince.GuangXi),
    /**
     * 合山
     */
    HeShan("HeShan", "71289", "101300406", "合山", CsgProvince.GuangXi),
    /**
     * 凭祥
     */
    PingXiang("PingXiang", "60996", "101300204", "凭祥", CsgProvince.GuangXi),
    /**
     * 宜州
     */
    YiZhou("YiZhou", "60032", "101301207", "宜州", CsgProvince.GuangXi),

    /**
     * 昆明
     */
    KunMing("KunMing", "56778", "101290101", "昆明", CsgProvince.YunNan),
    /**
     * 曲靖
     */
    QuJing("QuJing", "56783", "101290401", "曲靖", CsgProvince.YunNan),
    /**
     * 玉溪
     */
    YuXi("YuXi", "56875", "101290701", "玉溪", CsgProvince.YunNan),
    /**
     * 保山
     */
    BaoShan("BaoShan", "56748", "101290501", "保山", CsgProvince.YunNan),
    /**
     * 昭通
     */
    ZhaoTong("ZhaoTong", "56586", "101291001", "昭通", CsgProvince.YunNan),
    /**
     * 丽江
     */
    LiJiang("LiJiang", "56651", "101291401", "丽江", CsgProvince.YunNan),
    /**
     * 临沧
     */
    LinCang("LinCang", "56951", "101291101", "临沧", CsgProvince.YunNan),
    /**
     * 楚雄
     */
    ChuXiong("ChuXiong", "56768", "101290801", "楚雄", CsgProvince.YunNan),
    /**
     * 红河
     */
    HongHe("HongHe", "56975", "101290301", "红河", CsgProvince.YunNan),
    /**
     * 文山
     */
    WenShan("WenShan", "56994", "101290601", "文山", CsgProvince.YunNan),
    /**
     * 西双版纳
     */
    XiShuangBanNa("XiShuangBanNa", "60839", "101291602", "西双版纳", CsgProvince.YunNan),
    /**
     * 大理
     */
    DaLi("DaLi", "56751", "101290201", "大理", CsgProvince.YunNan),
    /**
     * 德宏
     */
    DeHong("DeHong", "71126", "101291501", "德宏", CsgProvince.YunNan),
    /**
     * 怒江
     */
    NuJiang("NuJiang", "71127", "101291201", "怒江", CsgProvince.YunNan),
    /**
     * 迪庆
     */
    DiQing("DiQing", "70908", "101291305", "迪庆", CsgProvince.YunNan),
    /**
     * 瑞丽
     */
    RuiLi("RuiLi", "60852", "101291506", "瑞丽", CsgProvince.YunNan),

    /**
     * 个旧
     */
    GeJiu("GeJiu", "60454", "101290308", "个旧", CsgProvince.YunNan),
    /**
     * 景洪
     */
    JingHong("JingHong", "71433", "101291601", "景洪", CsgProvince.YunNan),
    /**
     * 开远
     */
    KaiYuan("KaiYuan", "60456", "101290307", "开远", CsgProvince.YunNan),
    /**
     * 宣威
     */
    XuanWei("XuanWei", "60847", "101290409", "宣威", CsgProvince.YunNan),
    /**
     * 安宁
     */
    AnNing("AnNing", "60848", "101290112", "安宁", CsgProvince.YunNan),

    /**** 安顺 ***/
    AnShun("AnShun", "57806", "101260301", "安顺", CsgProvince.GuiZhou),
    /**
     * 毕节
     */
    BiJie("BiJie", "57707", "101260701", "毕节", CsgProvince.GuiZhou),
    /**
     * 都匀
     */
    DuYun("DuYun", "57827", "101260401", "都匀", CsgProvince.GuiZhou),
    /**
     * 贵阳
     */
    GuiYang("GuiYang", "57816", "101260101", "贵阳", CsgProvince.GuiZhou),
    /**
     * 凯里
     */
    KaiLi("KaiLi", "57825", "101260501", "凯里", CsgProvince.GuiZhou),
    /**
     * 六盘水
     */
    LiuPanShui("LiuPanShui", "56693", "101260801", "六盘水", CsgProvince.GuiZhou),
    /**
     * 铜仁
     */
    TongRen("TongRen", "57741", "101260601", "铜仁", CsgProvince.GuiZhou),
    /**
     * 兴义
     */
    XingYi("XingYi", "71130", "101260906", "兴义", CsgProvince.GuiZhou),
    /**
     * 遵义
     */
    ZunYi("ZunYi", "57713", "101260201", "遵义", CsgProvince.GuiZhou),

    /**
     * 赤水
     */
    ChiShui("ChiShui", "60576", "101260208", "赤水", CsgProvince.GuiZhou),
    /**
     * 福泉
     */
    FuQuan("FuQuan", "60902", "101260405", "福泉", CsgProvince.GuiZhou),
    /**
     * 清镇
     */
    QingZhen("QingZhen", "60573", "101260108", "清镇", CsgProvince.GuiZhou),
    /**
     * 仁怀
     */
    RenHuai("RenHuai", "60575", "101260203", "仁怀", CsgProvince.GuiZhou),

    /**
     * 东莞
     */
    DongGuan("DongGuan", "59289", "101281601", "东莞", CsgProvince.GuangDong),
    /**
     * 潮州
     */
    ChaoZhou("ChaoZhou", "59312", "101281501", "潮州", CsgProvince.GuangDong),
    /**
     * 佛山
     */
    FoShan("FoShan", "59288", "101280800", "佛山", CsgProvince.GuangDong),
    /**
     * 河源
     */
    HeYuan("HeYuan", "59293", "101281201", "河源", CsgProvince.GuangDong),
    /**
     * 惠州
     */
    HuiZhou("HuiZhou", "59297", "101280301", "惠州", CsgProvince.GuangDong),
    /**
     * 江门
     */
    JiangMen("JiangMen", "59473", "101281101", "江门", CsgProvince.GuangDong),
    /**
     * 揭阳
     */
    JieYang("JieYang", "59315", "101281901", "揭阳", CsgProvince.GuangDong),
    /**
     * 梅州
     */
    MeiZhou("MeiZhou", "59109", "101280401", "梅州", CsgProvince.GuangDong),
    /**
     * 茂名
     */
    MaoMing("MaoMing", "59659", "101282001", "茂名", CsgProvince.GuangDong),
    /**
     * 清远
     */
    QingYuan("QingYuan", "59280", "101281301", "清远", CsgProvince.GuangDong),
    /**
     * 韶关
     */
    ShaoGuan("ShaoGuan", "59082", "101280201", "韶关", CsgProvince.GuangDong),
    /**
     * 汕头
     */
    ShanTou("ShanTou", "59316", "101280501", "汕头", CsgProvince.GuangDong),
    /**
     * 汕尾
     */
    ShanWei("ShanWei", "59501", "101282101", "汕尾", CsgProvince.GuangDong),
    /**
     * 云浮
     */
    YunFu("YunFu", "59471", "101281401", "云浮", CsgProvince.GuangDong),
    /**
     * 阳江
     */
    YangJiang("YangJiang", "59663", "101281801", "阳江", CsgProvince.GuangDong),
    /**
     * 珠海
     */
    ZhuHai("ZhuHai", "59488", "101280701", "珠海", CsgProvince.GuangDong),
    /**
     * 中山
     */
    ZhongShan("ZhongShan", "59485", "101281701", "中山", CsgProvince.GuangDong),
    /**
     * 肇庆
     */
    ZhaoQing("ZhaoQing", "59278", "101280901", "肇庆", CsgProvince.GuangDong),
    /**
     * 湛江
     */
    ZhanJiang("ZhanJiang", "59658", "101281001", "湛江", CsgProvince.GuangDong),

    /**
     * 广州
     */
    GuangZhou("GuangZhou", "59287", "101280101", "广州", CsgProvince.GuangZhou),

    /**
     * 深圳
     */
    ShenZhen("ShenZhen", "59493", "101280601", "深圳", CsgProvince.ShenZhen);
    /**
     * 城拼音
     */
    private String code;
    /**
     * 2345网城编码
     */
    private String weth2345Code;
    /**
     * 中国天气网城编码
     */
    private String wethCode;
    /**
     * 中文名称
     */
    private String name;
    /**
     * 省份枚举
     */
    private CsgProvince province;

    /**
     * 字段map
     */
    private static Map<String, CsgCity> map;

    CsgCity(String code, String weth2345Code, String wethCode, String name, CsgProvince province) {
        this.code = code;
        this.weth2345Code = weth2345Code;
        this.wethCode = wethCode;
        this.name = name;
        this.province = province;
        initMap(name, this);
    }

    @Override
    public String toString() {
        return code;
    }

    public String getCode() {
        return code;
    }

    public String getWeth2345Code() {
        return weth2345Code;
    }

    public String getWethCode() {
        return wethCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CsgProvince getProvince() {
        return province;
    }

    public void setProvince(CsgProvince province) {
        this.province = province;
    }

    public static CsgCity getCity(String name) {
        return map.get(name);
    }

    public static CsgCity getCityByName(String name) {
        for (CsgCity city : CsgCity.values()) {
            if (name.equals(city.getName())) {
                return city;
            }
        }
        return null;
    }

    private void initMap(String name, CsgCity city) {
        if (CsgCity.map == null) {
            CsgCity.map = new LinkedHashMap<String, CsgCity>();
        }
        CsgCity.map.put(name, city);
    }

    public static Map<String, CsgCity> getCityMap() {
        return map;
    }
}
