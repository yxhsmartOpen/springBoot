package cn.baron.weather.weatherdatacollect.weather.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 全国城市枚举
 *
 * @author Baron
 * @date 2020/9/13 8:47
 */
public enum City {

    /** 福建省-厦门 */
    FuJian_ShaMen("FuJian_ShaMen","","","厦门",Province.FuJian),
    /** 福建省-福州 */
    FuJian_FuZhou("FuJian_FuZhou","","","福州",Province.FuJian),
    /** 福建省-南平 */
    FuJian_NanPing("FuJian_NanPing","","","南平",Province.FuJian),
    /** 福建省-三明 */
    FuJian_SanMing("FuJian_SanMing","","","三明",Province.FuJian),
    /** 福建省-莆田 */
    FuJian_PuTian("FuJian_PuTian","","","莆田",Province.FuJian),
    /** 福建省-泉州 */
    FuJian_QuanZhou("FuJian_QuanZhou","","","泉州",Province.FuJian),
    /** 福建省-漳州 */
    FuJian_ZhangZhou("FuJian_ZhangZhou","","","漳州",Province.FuJian),
    /** 福建省-龙岩 */
    FuJian_LongYan("FuJian_LongYan","","","龙岩",Province.FuJian),
    /** 福建省-宁德 */
    FuJian_NingDe("FuJian_NingDe","","","宁德",Province.FuJian),
    /** 福建省-福清 */
    FuJian_FuQing("FuJian_FuQing","","","福清",Province.FuJian),
    /** 福建省-邵武 */
    FuJian_ShaoWu("FuJian_ShaoWu","","","邵武",Province.FuJian),
    /** 福建省-武夷山 */
    FuJian_WuYiShan("FuJian_WuYiShan","","","武夷山",Province.FuJian),
    /** 福建省-建瓯 */
    FuJian_JianOu("FuJian_JianOu","","","建瓯",Province.FuJian),
    /** 福建省-永安 */
    FuJian_YongAn("FuJian_YongAn","","","永安",Province.FuJian),
    /** 福建省-石狮 */
    FuJian_ShiShi("FuJian_ShiShi","","","石狮",Province.FuJian),
    /** 福建省-晋江 */
    FuJian_JinJiang("FuJian_JinJiang","","","晋江",Province.FuJian),
    /** 福建省-南安 */
    FuJian_NanAn("FuJian_NanAn","","","南安",Province.FuJian),
    /** 福建省-龙海 */
    FuJian_LongHai("FuJian_LongHai","","","龙海",Province.FuJian),
    /** 福建省-漳平 */
    FuJian_ZhangPing("FuJian_ZhangPing","","","漳平",Province.FuJian),
    /** 福建省-福安 */
    FuJian_FuAn("FuJian_FuAn","","","福安",Province.FuJian),
    /** 福建省-福鼎 */
    FuJian_FuDing("FuJian_FuDing","","","福鼎",Province.FuJian),
    /** 西藏自治区-拉萨 */
    XiZang_LaSa("XiZang_LaSa","","","拉萨",Province.XiZang),
    /** 西藏自治区-日喀则 */
    XiZang_RiKaZe("XiZang_RiKaZe","","","日喀则",Province.XiZang),
    /** 西藏自治区-昌都 */
    XiZang_ChangDou("XiZang_ChangDou","","","昌都",Province.XiZang),
    /** 西藏自治区-林芝 */
    XiZang_LinZhi("XiZang_LinZhi","","","林芝",Province.XiZang),
    /** 西藏自治区-山南 */
    XiZang_ShanNan("XiZang_ShanNan","","","山南",Province.XiZang),
    /** 西藏自治区-那曲 */
    XiZang_NeiQu("XiZang_NeiQu","","","那曲",Province.XiZang),
    /** 贵州省-贵阳 */
    GuiZhou_GuiYang("GuiZhou_GuiYang","","","贵阳",Province.GuiZhou),
    /** 贵州省-六盘水 */
    GuiZhou_LiuPanShui("GuiZhou_LiuPanShui","","","六盘水",Province.GuiZhou),
    /** 贵州省-遵义 */
    GuiZhou_ZunYi("GuiZhou_ZunYi","","","遵义",Province.GuiZhou),
    /** 贵州省-安顺 */
    GuiZhou_AnShun("GuiZhou_AnShun","","","安顺",Province.GuiZhou),
    /** 贵州省-毕节 */
    GuiZhou_BiJie("GuiZhou_BiJie","","","毕节",Province.GuiZhou),
    /** 贵州省-铜仁 */
    GuiZhou_TongRen("GuiZhou_TongRen","","","铜仁",Province.GuiZhou),
    /** 贵州省-清镇 */
    GuiZhou_QingZhen("GuiZhou_QingZhen","","","清镇",Province.GuiZhou),
    /** 贵州省-赤水 */
    GuiZhou_ChiShui("GuiZhou_ChiShui","","","赤水",Province.GuiZhou),
    /** 贵州省-仁怀 */
    GuiZhou_RenHuai("GuiZhou_RenHuai","","","仁怀",Province.GuiZhou),
    /** 贵州省-凯里 */
    GuiZhou_KaiLi("GuiZhou_KaiLi","","","凯里",Province.GuiZhou),
    /** 贵州省-都匀 */
    GuiZhou_DouYun("GuiZhou_DouYun","","","都匀",Province.GuiZhou),
    /** 贵州省-兴义 */
    GuiZhou_XingYi("GuiZhou_XingYi","","","兴义",Province.GuiZhou),
    /** 贵州省-福泉 */
    GuiZhou_FuQuan("GuiZhou_FuQuan","","","福泉",Province.GuiZhou),
    /** 贵州省-盘州 */
    GuiZhou_PanZhou("GuiZhou_PanZhou","","","盘州",Province.GuiZhou),
    /** 贵州省-兴仁 */
    GuiZhou_XingRen("GuiZhou_XingRen","","","兴仁",Province.GuiZhou),
    /** 湖北省-武汉 */
    HuBei_WuHan("HuBei_WuHan","","","武汉",Province.HuBei),
    /** 湖北省-十堰 */
    HuBei_ShiYan("HuBei_ShiYan","","","十堰",Province.HuBei),
    /** 湖北省-襄阳 */
    HuBei_XiangYang("HuBei_XiangYang","","","襄阳",Province.HuBei),
    /** 湖北省-荆门 */
    HuBei_JingMen("HuBei_JingMen","","","荆门",Province.HuBei),
    /** 湖北省-孝感 */
    HuBei_XiaoGan("HuBei_XiaoGan","","","孝感",Province.HuBei),
    /** 湖北省-黄冈 */
    HuBei_HuangGang("HuBei_HuangGang","","","黄冈",Province.HuBei),
    /** 湖北省-鄂州 */
    HuBei_EZhou("HuBei_EZhou","","","鄂州",Province.HuBei),
    /** 湖北省-黄石 */
    HuBei_HuangShi("HuBei_HuangShi","","","黄石",Province.HuBei),
    /** 湖北省-咸宁 */
    HuBei_XianNing("HuBei_XianNing","","","咸宁",Province.HuBei),
    /** 湖北省-荆州 */
    HuBei_JingZhou("HuBei_JingZhou","","","荆州",Province.HuBei),
    /** 湖北省-宜昌 */
    HuBei_YiChang("HuBei_YiChang","","","宜昌",Province.HuBei),
    /** 湖北省-随州。 */
    HuBei_SuiZhou("HuBei_SuiZhou","","","随州。",Province.HuBei),
    /** 湖北省-丹江口 */
    HuBei_DanJiangKou("HuBei_DanJiangKou","","","丹江口",Province.HuBei),
    /** 湖北省-老河口 */
    HuBei_LaoHeKou("HuBei_LaoHeKou","","","老河口",Province.HuBei),
    /** 湖北省-枣阳 */
    HuBei_ZaoYang("HuBei_ZaoYang","","","枣阳",Province.HuBei),
    /** 湖北省-宜城 */
    HuBei_YiCheng("HuBei_YiCheng","","","宜城",Province.HuBei),
    /** 湖北省-钟祥 */
    HuBei_ZhongXiang("HuBei_ZhongXiang","","","钟祥",Province.HuBei),
    /** 湖北省-京山 */
    HuBei_JingShan("HuBei_JingShan","","","京山",Province.HuBei),
    /** 湖北省-汉川 */
    HuBei_HanChuan("HuBei_HanChuan","","","汉川",Province.HuBei),
    /** 湖北省-应城 */
    HuBei_YingCheng("HuBei_YingCheng","","","应城",Province.HuBei),
    /** 湖北省-安陆 */
    HuBei_AnLu("HuBei_AnLu","","","安陆",Province.HuBei),
    /** 湖北省-广水 */
    HuBei_GuangShui("HuBei_GuangShui","","","广水",Province.HuBei),
    /** 湖北省-麻城 */
    HuBei_MaCheng("HuBei_MaCheng","","","麻城",Province.HuBei),
    /** 湖北省-武穴 */
    HuBei_WuXue("HuBei_WuXue","","","武穴",Province.HuBei),
    /** 湖北省-大冶 */
    HuBei_DaYe("HuBei_DaYe","","","大冶",Province.HuBei),
    /** 湖北省-赤壁 */
    HuBei_ChiBi("HuBei_ChiBi","","","赤壁",Province.HuBei),
    /** 湖北省-石首 */
    HuBei_ShiShou("HuBei_ShiShou","","","石首",Province.HuBei),
    /** 湖北省-洪湖 */
    HuBei_HongHu("HuBei_HongHu","","","洪湖",Province.HuBei),
    /** 湖北省-松滋 */
    HuBei_SongZi("HuBei_SongZi","","","松滋",Province.HuBei),
    /** 湖北省-宜都 */
    HuBei_YiDou("HuBei_YiDou","","","宜都",Province.HuBei),
    /** 湖北省-枝江 */
    HuBei_ZhiJiang("HuBei_ZhiJiang","","","枝江",Province.HuBei),
    /** 湖北省-当阳 */
    HuBei_DangYang("HuBei_DangYang","","","当阳",Province.HuBei),
    /** 湖北省-恩施 */
    HuBei_EnShi("HuBei_EnShi","","","恩施",Province.HuBei),
    /** 湖北省-利川 */
    HuBei_LiChuan("HuBei_LiChuan","","","利川",Province.HuBei),
    /** 湖北省-仙桃 */
    HuBei_XianTao("HuBei_XianTao","","","仙桃",Province.HuBei),
    /** 湖北省-天门 */
    HuBei_TianMen("HuBei_TianMen","","","天门",Province.HuBei),
    /** 湖北省-潜江 */
    HuBei_QianJiang("HuBei_QianJiang","","","潜江",Province.HuBei),
    /** 湖南省-长沙 */
    HuNan_ZhangSha("HuNan_ZhangSha","","","长沙",Province.HuNan),
    /** 湖南省-衡阳 */
    HuNan_HengYang("HuNan_HengYang","","","衡阳",Province.HuNan),
    /** 湖南省-张家界 */
    HuNan_ZhangJiaJie("HuNan_ZhangJiaJie","","","张家界",Province.HuNan),
    /** 湖南省-常德 */
    HuNan_ChangDe("HuNan_ChangDe","","","常德",Province.HuNan),
    /** 湖南省-益阳 */
    HuNan_YiYang("HuNan_YiYang","","","益阳",Province.HuNan),
    /** 湖南省-岳阳 */
    HuNan_YueYang("HuNan_YueYang","","","岳阳",Province.HuNan),
    /** 湖南省-株洲 */
    HuNan_ZhuZhou("HuNan_ZhuZhou","","","株洲",Province.HuNan),
    /** 湖南省-湘潭 */
    HuNan_XiangTan("HuNan_XiangTan","","","湘潭",Province.HuNan),
    /** 湖南省-郴州 */
    HuNan_ChenZhou("HuNan_ChenZhou","","","郴州",Province.HuNan),
    /** 湖南省-永州 */
    HuNan_YongZhou("HuNan_YongZhou","","","永州",Province.HuNan),
    /** 湖南省-邵阳 */
    HuNan_ShaoYang("HuNan_ShaoYang","","","邵阳",Province.HuNan),
    /** 湖南省-怀化 */
    HuNan_HuaiHua("HuNan_HuaiHua","","","怀化",Province.HuNan),
    /** 湖南省-娄底 */
    HuNan_LouDi("HuNan_LouDi","","","娄底",Province.HuNan),
    /** 湖南省-耒阳 */
    HuNan_LeiYang("HuNan_LeiYang","","","耒阳",Province.HuNan),
    /** 湖南省-常宁 */
    HuNan_ChangNing("HuNan_ChangNing","","","常宁",Province.HuNan),
    /** 湖南省-浏阳 */
    HuNan_LiuYang("HuNan_LiuYang","","","浏阳",Province.HuNan),
    /** 湖南省-津 */
    HuNan_Jin("HuNan_Jin","","","津",Province.HuNan),
    /** 湖南省-沅江 */
    HuNan_YuanJiang("HuNan_YuanJiang","","","沅江",Province.HuNan),
    /** 湖南省-汨罗 */
    HuNan_MiLuo("HuNan_MiLuo","","","汨罗",Province.HuNan),
    /** 湖南省-临湘 */
    HuNan_LinXiang("HuNan_LinXiang","","","临湘",Province.HuNan),
    /** 湖南省-醴陵 */
    HuNan_LiLing("HuNan_LiLing","","","醴陵",Province.HuNan),
    /** 湖南省-湘乡 */
    HuNan_XiangXiang("HuNan_XiangXiang","","","湘乡",Province.HuNan),
    /** 湖南省-韶山 */
    HuNan_ShaoShan("HuNan_ShaoShan","","","韶山",Province.HuNan),
    /** 湖南省-资兴 */
    HuNan_ZiXing("HuNan_ZiXing","","","资兴",Province.HuNan),
    /** 湖南省-武冈 */
    HuNan_WuGang("HuNan_WuGang","","","武冈",Province.HuNan),
    /** 湖南省-邵东 */
    HuNan_ShaoDong("HuNan_ShaoDong","","","邵东",Province.HuNan),
    /** 湖南省-洪江 */
    HuNan_HongJiang("HuNan_HongJiang","","","洪江",Province.HuNan),
    /** 湖南省-冷水江 */
    HuNan_LengShuiJiang("HuNan_LengShuiJiang","","","冷水江",Province.HuNan),
    /** 湖南省-涟源 */
    HuNan_LianYuan("HuNan_LianYuan","","","涟源",Province.HuNan),
    /** 湖南省-吉首 */
    HuNan_JiShou("HuNan_JiShou","","","吉首",Province.HuNan),
    /** 湖南省-宁乡 */
    HuNan_NingXiang("HuNan_NingXiang","","","宁乡",Province.HuNan),
    /** 广东省-广州 */
    GuangDong_GuangZhou("GuangDong_GuangZhou","","","广州",Province.GuangDong),
    /** 广东省-深圳 */
    GuangDong_ShenZhen("GuangDong_ShenZhen","","","深圳",Province.GuangDong),
    /** 广东省-清远 */
    GuangDong_QingYuan("GuangDong_QingYuan","","","清远",Province.GuangDong),
    /** 广东省-韶关 */
    GuangDong_ShaoGuan("GuangDong_ShaoGuan","","","韶关",Province.GuangDong),
    /** 广东省-河源 */
    GuangDong_HeYuan("GuangDong_HeYuan","","","河源",Province.GuangDong),
    /** 广东省-梅州 */
    GuangDong_MeiZhou("GuangDong_MeiZhou","","","梅州",Province.GuangDong),
    /** 广东省-潮州 */
    GuangDong_ChaoZhou("GuangDong_ChaoZhou","","","潮州",Province.GuangDong),
    /** 广东省-汕头 */
    GuangDong_ShanTou("GuangDong_ShanTou","","","汕头",Province.GuangDong),
    /** 广东省-揭阳 */
    GuangDong_JieYang("GuangDong_JieYang","","","揭阳",Province.GuangDong),
    /** 广东省-汕尾 */
    GuangDong_ShanWei("GuangDong_ShanWei","","","汕尾",Province.GuangDong),
    /** 广东省-惠州 */
    GuangDong_HuiZhou("GuangDong_HuiZhou","","","惠州",Province.GuangDong),
    /** 广东省-东莞 */
    GuangDong_DongGuan("GuangDong_DongGuan","","","东莞",Province.GuangDong),
    /** 广东省-珠海 */
    GuangDong_ZhuHai("GuangDong_ZhuHai","","","珠海",Province.GuangDong),
    /** 广东省-中山 */
    GuangDong_ZhongShan("GuangDong_ZhongShan","","","中山",Province.GuangDong),
    /** 广东省-江门 */
    GuangDong_JiangMen("GuangDong_JiangMen","","","江门",Province.GuangDong),
    /** 广东省-佛山 */
    GuangDong_FoShan("GuangDong_FoShan","","","佛山",Province.GuangDong),
    /** 广东省-肇庆 */
    GuangDong_ZhaoQing("GuangDong_ZhaoQing","","","肇庆",Province.GuangDong),
    /** 广东省-云浮 */
    GuangDong_YunFu("GuangDong_YunFu","","","云浮",Province.GuangDong),
    /** 广东省-阳江 */
    GuangDong_YangJiang("GuangDong_YangJiang","","","阳江",Province.GuangDong),
    /** 广东省-茂名 */
    GuangDong_MaoMing("GuangDong_MaoMing","","","茂名",Province.GuangDong),
    /** 广东省-湛江 */
    GuangDong_ZhanJiang("GuangDong_ZhanJiang","","","湛江",Province.GuangDong),
    /** 广东省-英德 */
    GuangDong_YingDe("GuangDong_YingDe","","","英德",Province.GuangDong),
    /** 广东省-连州 */
    GuangDong_LianZhou("GuangDong_LianZhou","","","连州",Province.GuangDong),
    /** 广东省-乐昌 */
    GuangDong_LeChang("GuangDong_LeChang","","","乐昌",Province.GuangDong),
    /** 广东省-南雄 */
    GuangDong_NanXiong("GuangDong_NanXiong","","","南雄",Province.GuangDong),
    /** 广东省-兴宁 */
    GuangDong_XingNing("GuangDong_XingNing","","","兴宁",Province.GuangDong),
    /** 广东省-普宁 */
    GuangDong_PuNing("GuangDong_PuNing","","","普宁",Province.GuangDong),
    /** 广东省-陆丰 */
    GuangDong_LuFeng("GuangDong_LuFeng","","","陆丰",Province.GuangDong),
    /** 广东省-恩平 */
    GuangDong_EnPing("GuangDong_EnPing","","","恩平",Province.GuangDong),
    /** 广东省-台山 */
    GuangDong_TaiShan("GuangDong_TaiShan","","","台山",Province.GuangDong),
    /** 广东省-开平 */
    GuangDong_KaiPing("GuangDong_KaiPing","","","开平",Province.GuangDong),
    /** 广东省-鹤山 */
    GuangDong_HeShan("GuangDong_HeShan","","","鹤山",Province.GuangDong),
    /** 广东省-四会 */
    GuangDong_SiHui("GuangDong_SiHui","","","四会",Province.GuangDong),
    /** 广东省-罗定 */
    GuangDong_LuoDing("GuangDong_LuoDing","","","罗定",Province.GuangDong),
    /** 广东省-阳春 */
    GuangDong_YangChun("GuangDong_YangChun","","","阳春",Province.GuangDong),
    /** 广东省-化州 */
    GuangDong_HuaZhou("GuangDong_HuaZhou","","","化州",Province.GuangDong),
    /** 广东省-信宜 */
    GuangDong_XinYi("GuangDong_XinYi","","","信宜",Province.GuangDong),
    /** 广东省-高州 */
    GuangDong_GaoZhou("GuangDong_GaoZhou","","","高州",Province.GuangDong),
    /** 广东省-吴川 */
    GuangDong_WuChuan("GuangDong_WuChuan","","","吴川",Province.GuangDong),
    /** 广东省-廉江 */
    GuangDong_LianJiang("GuangDong_LianJiang","","","廉江",Province.GuangDong),
    /** 广东省-雷州 */
    GuangDong_LeiZhou("GuangDong_LeiZhou","","","雷州",Province.GuangDong),
    /** 重庆-重庆 */
    ZhongQing_ZhongQing("ZhongQing_ZhongQing","","","重庆",Province.ZhongQing),
    /** 安徽省-合肥 */
    AnHui_HeFei("AnHui_HeFei","","","合肥",Province.AnHui),
    /** 安徽省-芜湖 */
    AnHui_WuHu("AnHui_WuHu","","","芜湖",Province.AnHui),
    /** 安徽省-蚌埠 */
    AnHui_BangBu("AnHui_BangBu","","","蚌埠",Province.AnHui),
    /** 安徽省-淮南 */
    AnHui_HuaiNan("AnHui_HuaiNan","","","淮南",Province.AnHui),
    /** 安徽省-马鞍山 */
    AnHui_MaAnShan("AnHui_MaAnShan","","","马鞍山",Province.AnHui),
    /** 安徽省-淮北 */
    AnHui_HuaiBei("AnHui_HuaiBei","","","淮北",Province.AnHui),
    /** 安徽省-铜陵 */
    AnHui_TongLing("AnHui_TongLing","","","铜陵",Province.AnHui),
    /** 安徽省-安庆 */
    AnHui_AnQing("AnHui_AnQing","","","安庆",Province.AnHui),
    /** 安徽省-黄山 */
    AnHui_HuangShan("AnHui_HuangShan","","","黄山",Province.AnHui),
    /** 安徽省-滁州 */
    AnHui_ChuZhou("AnHui_ChuZhou","","","滁州",Province.AnHui),
    /** 安徽省-阜阳 */
    AnHui_FuYang("AnHui_FuYang","","","阜阳",Province.AnHui),
    /** 安徽省-宿州 */
    AnHui_SuZhou("AnHui_SuZhou","","","宿州",Province.AnHui),
    /** 安徽省-六安 */
    AnHui_LiuAn("AnHui_LiuAn","","","六安",Province.AnHui),
    /** 安徽省-亳州 */
    AnHui_BoZhou("AnHui_BoZhou","","","亳州",Province.AnHui),
    /** 安徽省-池州 */
    AnHui_ChiZhou("AnHui_ChiZhou","","","池州",Province.AnHui),
    /** 安徽省-宣城 */
    AnHui_XuanCheng("AnHui_XuanCheng","","","宣城",Province.AnHui),
    /** 安徽省-巢湖 */
    AnHui_ChaoHu("AnHui_ChaoHu","","","巢湖",Province.AnHui),
    /** 安徽省-桐城 */
    AnHui_TongCheng("AnHui_TongCheng","","","桐城",Province.AnHui),
    /** 安徽省-天长 */
    AnHui_TianZhang("AnHui_TianZhang","","","天长",Province.AnHui),
    /** 安徽省-明光 */
    AnHui_MingGuang("AnHui_MingGuang","","","明光",Province.AnHui),
    /** 安徽省-界首 */
    AnHui_JieShou("AnHui_JieShou","","","界首",Province.AnHui),
    /** 安徽省-宁国 */
    AnHui_NingGuo("AnHui_NingGuo","","","宁国",Province.AnHui),
    /** 安徽省-广德 */
    AnHui_GuangDe("AnHui_GuangDe","","","广德",Province.AnHui),
    /** 安徽省-潜山 */
    AnHui_QianShan("AnHui_QianShan","","","潜山",Province.AnHui),
    /** 安徽省-无为 */
    AnHui_WuWei("AnHui_WuWei","","","无为",Province.AnHui),
    /** 四川省-成都 */
    SiChuan_ChengDou("SiChuan_ChengDou","","","成都",Province.SiChuan),
    /** 四川省-广元 */
    SiChuan_GuangYuan("SiChuan_GuangYuan","","","广元",Province.SiChuan),
    /** 四川省-绵阳 */
    SiChuan_MianYang("SiChuan_MianYang","","","绵阳",Province.SiChuan),
    /** 四川省-德阳 */
    SiChuan_DeYang("SiChuan_DeYang","","","德阳",Province.SiChuan),
    /** 四川省-南充 */
    SiChuan_NanChong("SiChuan_NanChong","","","南充",Province.SiChuan),
    /** 四川省-广安 */
    SiChuan_GuangAn("SiChuan_GuangAn","","","广安",Province.SiChuan),
    /** 四川省-遂宁 */
    SiChuan_SuiNing("SiChuan_SuiNing","","","遂宁",Province.SiChuan),
    /** 四川省-内江 */
    SiChuan_NeiJiang("SiChuan_NeiJiang","","","内江",Province.SiChuan),
    /** 四川省-乐山 */
    SiChuan_LeShan("SiChuan_LeShan","","","乐山",Province.SiChuan),
    /** 四川省-自贡 */
    SiChuan_ZiGong("SiChuan_ZiGong","","","自贡",Province.SiChuan),
    /** 四川省-泸州 */
    SiChuan_LuZhou("SiChuan_LuZhou","","","泸州",Province.SiChuan),
    /** 四川省-宜宾 */
    SiChuan_YiBin("SiChuan_YiBin","","","宜宾",Province.SiChuan),
    /** 四川省-攀枝花 */
    SiChuan_PanZhiHua("SiChuan_PanZhiHua","","","攀枝花",Province.SiChuan),
    /** 四川省-巴中 */
    SiChuan_BaZhong("SiChuan_BaZhong","","","巴中",Province.SiChuan),
    /** 四川省-达州 */
    SiChuan_DaZhou("SiChuan_DaZhou","","","达州",Province.SiChuan),
    /** 四川省-资阳 */
    SiChuan_ZiYang("SiChuan_ZiYang","","","资阳",Province.SiChuan),
    /** 四川省-眉山 */
    SiChuan_MeiShan("SiChuan_MeiShan","","","眉山",Province.SiChuan),
    /** 四川省-雅安 */
    SiChuan_YaAn("SiChuan_YaAn","","","雅安",Province.SiChuan),
    /** 四川省-崇州 */
    SiChuan_ChongZhou("SiChuan_ChongZhou","","","崇州",Province.SiChuan),
    /** 四川省-邛崃 */
    SiChuan_QiongLai("SiChuan_QiongLai","","","邛崃",Province.SiChuan),
    /** 四川省-都江堰 */
    SiChuan_DouJiangYan("SiChuan_DouJiangYan","","","都江堰",Province.SiChuan),
    /** 四川省-彭州 */
    SiChuan_PengZhou("SiChuan_PengZhou","","","彭州",Province.SiChuan),
    /** 四川省-江油 */
    SiChuan_JiangYou("SiChuan_JiangYou","","","江油",Province.SiChuan),
    /** 四川省-什邡 */
    SiChuan_ShenFang("SiChuan_ShenFang","","","什邡",Province.SiChuan),
    /** 四川省-广汉 */
    SiChuan_GuangHan("SiChuan_GuangHan","","","广汉",Province.SiChuan),
    /** 四川省-绵竹 */
    SiChuan_MianZhu("SiChuan_MianZhu","","","绵竹",Province.SiChuan),
    /** 四川省-阆中 */
    SiChuan_LangZhong("SiChuan_LangZhong","","","阆中",Province.SiChuan),
    /** 四川省-华蓥 */
    SiChuan_HuaYing("SiChuan_HuaYing","","","华蓥",Province.SiChuan),
    /** 四川省-峨眉山 */
    SiChuan_EMeiShan("SiChuan_EMeiShan","","","峨眉山",Province.SiChuan),
    /** 四川省-万源 */
    SiChuan_WanYuan("SiChuan_WanYuan","","","万源",Province.SiChuan),
    /** 四川省-简阳 */
    SiChuan_JianYang("SiChuan_JianYang","","","简阳",Province.SiChuan),
    /** 四川省-西昌 */
    SiChuan_XiChang("SiChuan_XiChang","","","西昌",Province.SiChuan),
    /** 四川省-康定 */
    SiChuan_KangDing("SiChuan_KangDing","","","康定",Province.SiChuan),
    /** 四川省-马尔康 */
    SiChuan_MaErKang("SiChuan_MaErKang","","","马尔康",Province.SiChuan),
    /** 四川省-隆昌 */
    SiChuan_LongChang("SiChuan_LongChang","","","隆昌",Province.SiChuan),
    /** 四川省-射洪 */
    SiChuan_SheHong("SiChuan_SheHong","","","射洪",Province.SiChuan),
    /** 新疆维吾尔自治区-乌鲁木齐 */
    XinJiang_WuLuMuQi("XinJiang_WuLuMuQi","","","乌鲁木齐",Province.XinJiang),
    /** 新疆维吾尔自治区-克拉玛依 */
    XinJiang_KeLaMaYi("XinJiang_KeLaMaYi","","","克拉玛依",Province.XinJiang),
    /** 新疆维吾尔自治区-吐鲁番 */
    XinJiang_TuLuFan("XinJiang_TuLuFan","","","吐鲁番",Province.XinJiang),
    /** 新疆维吾尔自治区-哈密 */
    XinJiang_HaMi("XinJiang_HaMi","","","哈密",Province.XinJiang),
    /** 新疆维吾尔自治区-喀什 */
    XinJiang_KaShen("XinJiang_KaShen","","","喀什",Province.XinJiang),
    /** 新疆维吾尔自治区-阿克苏 */
    XinJiang_AKeSu("XinJiang_AKeSu","","","阿克苏",Province.XinJiang),
    /** 新疆维吾尔自治区-库车 */
    XinJiang_KuChe("XinJiang_KuChe","","","库车",Province.XinJiang),
    /** 新疆维吾尔自治区-和田 */
    XinJiang_HeTian("XinJiang_HeTian","","","和田",Province.XinJiang),
    /** 新疆维吾尔自治区-阿图什 */
    XinJiang_ATuShen("XinJiang_ATuShen","","","阿图什",Province.XinJiang),
    /** 新疆维吾尔自治区-阿拉山口 */
    XinJiang_ALaShanKou("XinJiang_ALaShanKou","","","阿拉山口",Province.XinJiang),
    /** 新疆维吾尔自治区-博乐 */
    XinJiang_BoLe("XinJiang_BoLe","","","博乐",Province.XinJiang),
    /** 新疆维吾尔自治区-昌吉 */
    XinJiang_ChangJi("XinJiang_ChangJi","","","昌吉",Province.XinJiang),
    /** 新疆维吾尔自治区-阜康 */
    XinJiang_FuKang("XinJiang_FuKang","","","阜康",Province.XinJiang),
    /** 新疆维吾尔自治区-库尔勒 */
    XinJiang_KuErLe("XinJiang_KuErLe","","","库尔勒",Province.XinJiang),
    /** 新疆维吾尔自治区-伊宁 */
    XinJiang_YiNing("XinJiang_YiNing","","","伊宁",Province.XinJiang),
    /** 新疆维吾尔自治区-奎屯 */
    XinJiang_KuiTun("XinJiang_KuiTun","","","奎屯",Province.XinJiang),
    /** 新疆维吾尔自治区-塔城 */
    XinJiang_TaCheng("XinJiang_TaCheng","","","塔城",Province.XinJiang),
    /** 新疆维吾尔自治区-乌苏 */
    XinJiang_WuSu("XinJiang_WuSu","","","乌苏",Province.XinJiang),
    /** 新疆维吾尔自治区-阿勒泰 */
    XinJiang_ALeTai("XinJiang_ALeTai","","","阿勒泰",Province.XinJiang),
    /** 新疆维吾尔自治区-霍尔果斯 */
    XinJiang_HuoErGuoSi("XinJiang_HuoErGuoSi","","","霍尔果斯",Province.XinJiang),
    /** 新疆维吾尔自治区-石河子 */
    XinJiang_ZiZhiQuZhiXiaShiHeZi("XinJiang_ShiHeZi","","","石河子",Province.XinJiang),
    /** 新疆维吾尔自治区-阿拉尔 */
    XinJiang_ALaEr("XinJiang_ALaEr","","","阿拉尔",Province.XinJiang),
    /** 新疆维吾尔自治区-图木舒克 */
    XinJiang_TuMuShuKe("XinJiang_TuMuShuKe","","","图木舒克",Province.XinJiang),
    /** 新疆维吾尔自治区-五家渠 */
    XinJiang_WuJiaQu("XinJiang_WuJiaQu","","","五家渠",Province.XinJiang),
    /** 新疆维吾尔自治区-北屯 */
    XinJiang_BeiTun("XinJiang_BeiTun","","","北屯",Province.XinJiang),
    /** 新疆维吾尔自治区-铁门关 */
    XinJiang_TieMenGuan("XinJiang_TieMenGuan","","","铁门关",Province.XinJiang),
    /** 新疆维吾尔自治区-双河 */
    XinJiang_ShuangHe("XinJiang_ShuangHe","","","双河",Province.XinJiang),
    /** 新疆维吾尔自治区-可克达拉 */
    XinJiang_KeKeDaLa("XinJiang_KeKeDaLa","","","可克达拉",Province.XinJiang),
    /** 新疆维吾尔自治区-昆玉 */
    XinJiang_KunYu("XinJiang_KunYu","","","昆玉",Province.XinJiang),
    /** 新疆维吾尔自治区-胡杨河 */
    XinJiang_HuYangHe("XinJiang_HuYangHe","","","胡杨河",Province.XinJiang),
    /** 江苏省-南京 */
    JiangSu_NanJing("JiangSu_NanJing","","","南京",Province.JiangSu),
    /** 江苏省-徐州 */
    JiangSu_XuZhou("JiangSu_XuZhou","","","徐州",Province.JiangSu),
    /** 江苏省-连云港 */
    JiangSu_LianYunGang("JiangSu_LianYunGang","","","连云港",Province.JiangSu),
    /** 江苏省-宿迁 */
    JiangSu_SuQian("JiangSu_SuQian","","","宿迁",Province.JiangSu),
    /** 江苏省-淮安 */
    JiangSu_HuaiAn("JiangSu_HuaiAn","","","淮安",Province.JiangSu),
    /** 江苏省-盐城 */
    JiangSu_YanCheng("JiangSu_YanCheng","","","盐城",Province.JiangSu),
    /** 江苏省-扬州 */
    JiangSu_YangZhou("JiangSu_YangZhou","","","扬州",Province.JiangSu),
    /** 江苏省-泰州 */
    JiangSu_TaiZhou("JiangSu_TaiZhou","","","泰州",Province.JiangSu),
    /** 江苏省-南通 */
    JiangSu_NanTong("JiangSu_NanTong","","","南通",Province.JiangSu),
    /** 江苏省-镇江 */
    JiangSu_ZhenJiang("JiangSu_ZhenJiang","","","镇江",Province.JiangSu),
    /** 江苏省-常州 */
    JiangSu_ChangZhou("JiangSu_ChangZhou","","","常州",Province.JiangSu),
    /** 江苏省-无锡 */
    JiangSu_WuXi("JiangSu_WuXi","","","无锡",Province.JiangSu),
    /** 江苏省-苏州 */
    JiangSu_SuZhou("JiangSu_SuZhou","","","苏州",Province.JiangSu),
    /** 江苏省-常熟 */
    JiangSu_ChangShu("JiangSu_ChangShu","","","常熟",Province.JiangSu),
    /** 江苏省-张家港 */
    JiangSu_ZhangJiaGang("JiangSu_ZhangJiaGang","","","张家港",Province.JiangSu),
    /** 江苏省-太仓 */
    JiangSu_TaiCang("JiangSu_TaiCang","","","太仓",Province.JiangSu),
    /** 江苏省-昆山 */
    JiangSu_KunShan("JiangSu_KunShan","","","昆山",Province.JiangSu),
    /** 江苏省-江阴 */
    JiangSu_JiangYin("JiangSu_JiangYin","","","江阴",Province.JiangSu),
    /** 江苏省-宜兴 */
    JiangSu_YiXing("JiangSu_YiXing","","","宜兴",Province.JiangSu),
    /** 江苏省-溧阳 */
    JiangSu_LiYang("JiangSu_LiYang","","","溧阳",Province.JiangSu),
    /** 江苏省-扬中 */
    JiangSu_YangZhong("JiangSu_YangZhong","","","扬中",Province.JiangSu),
    /** 江苏省-句容 */
    JiangSu_JuRong("JiangSu_JuRong","","","句容",Province.JiangSu),
    /** 江苏省-丹阳 */
    JiangSu_DanYang("JiangSu_DanYang","","","丹阳",Province.JiangSu),
    /** 江苏省-如皋 */
    JiangSu_RuGao("JiangSu_RuGao","","","如皋",Province.JiangSu),
    /** 江苏省-启东 */
    JiangSu_QiDong("JiangSu_QiDong","","","启东",Province.JiangSu),
    /** 江苏省-海安 */
    JiangSu_HaiAn("JiangSu_HaiAn","","","海安",Province.JiangSu),
    /** 江苏省-高邮 */
    JiangSu_GaoYou("JiangSu_GaoYou","","","高邮",Province.JiangSu),
    /** 江苏省-仪征 */
    JiangSu_YiZheng("JiangSu_YiZheng","","","仪征",Province.JiangSu),
    /** 江苏省-兴化 */
    JiangSu_XingHua("JiangSu_XingHua","","","兴化",Province.JiangSu),
    /** 江苏省-泰兴 */
    JiangSu_TaiXing("JiangSu_TaiXing","","","泰兴",Province.JiangSu),
    /** 江苏省-靖江 */
    JiangSu_JingJiang("JiangSu_JingJiang","","","靖江",Province.JiangSu),
    /** 江苏省-东台 */
    JiangSu_DongTai("JiangSu_DongTai","","","东台",Province.JiangSu),
    /** 江苏省-邳州 */
    JiangSu_PiZhou("JiangSu_PiZhou","","","邳州",Province.JiangSu),
    /** 江苏省-新沂 */
    JiangSu_XinYi("JiangSu_XinYi","","","新沂",Province.JiangSu),
    /** 天津-天津 */
    TianJin_TianJin("TianJin_TianJin","","","天津",Province.TianJin),
    /** 吉林省-长春 */
    JiLin_ZhangChun("JiLin_ZhangChun","","","长春",Province.JiLin),
    /** 吉林省-吉林 */
    JiLin_JiLin("JiLin_JiLin","","","吉林",Province.JiLin),
    /** 吉林省-四平 */
    JiLin_SiPing("JiLin_SiPing","","","四平",Province.JiLin),
    /** 吉林省-辽源 */
    JiLin_LiaoYuan("JiLin_LiaoYuan","","","辽源",Province.JiLin),
    /** 吉林省-通化 */
    JiLin_TongHua("JiLin_TongHua","","","通化",Province.JiLin),
    /** 吉林省-白山 */
    JiLin_BaiShan("JiLin_BaiShan","","","白山",Province.JiLin),
    /** 吉林省-松原 */
    JiLin_SongYuan("JiLin_SongYuan","","","松原",Province.JiLin),
    /** 吉林省-白城 */
    JiLin_BaiCheng("JiLin_BaiCheng","","","白城",Province.JiLin),
    /** 吉林省-榆树 */
    JiLin_YuShu("JiLin_YuShu","","","榆树",Province.JiLin),
    /** 吉林省-德惠 */
    JiLin_DeHui("JiLin_DeHui","","","德惠",Province.JiLin),
    /** 吉林省-蛟河 */
    JiLin_JiaoHe("JiLin_JiaoHe","","","蛟河",Province.JiLin),
    /** 吉林省-桦甸 */
    JiLin_HuaDian("JiLin_HuaDian","","","桦甸",Province.JiLin),
    /** 吉林省-舒兰 */
    JiLin_ShuLan("JiLin_ShuLan","","","舒兰",Province.JiLin),
    /** 吉林省-磐石 */
    JiLin_PanShi("JiLin_PanShi","","","磐石",Province.JiLin),
    /** 吉林省-公主岭 */
    JiLin_GongZhuLing("JiLin_GongZhuLing","","","公主岭",Province.JiLin),
    /** 吉林省-双辽 */
    JiLin_ShuangLiao("JiLin_ShuangLiao","","","双辽",Province.JiLin),
    /** 吉林省-梅河口 */
    JiLin_MeiHeKou("JiLin_MeiHeKou","","","梅河口",Province.JiLin),
    /** 吉林省-集安 */
    JiLin_JiAn("JiLin_JiAn","","","集安",Province.JiLin),
    /** 吉林省-洮南 */
    JiLin_TaoNan("JiLin_TaoNan","","","洮南",Province.JiLin),
    /** 吉林省-大安 */
    JiLin_DaAn("JiLin_DaAn","","","大安",Province.JiLin),
    /** 吉林省-临江 */
    JiLin_LinJiang("JiLin_LinJiang","","","临江",Province.JiLin),
    /** 吉林省-延吉 */
    JiLin_YanJi("JiLin_YanJi","","","延吉",Province.JiLin),
    /** 吉林省-图们 */
    JiLin_TuMen("JiLin_TuMen","","","图们",Province.JiLin),
    /** 吉林省-敦化 */
    JiLin_DunHua("JiLin_DunHua","","","敦化",Province.JiLin),
    /** 吉林省-珲春 */
    JiLin_HunChun("JiLin_HunChun","","","珲春",Province.JiLin),
    /** 吉林省-龙井 */
    JiLin_LongJing("JiLin_LongJing","","","龙井",Province.JiLin),
    /** 吉林省-和龙 */
    JiLin_HeLong("JiLin_HeLong","","","和龙",Province.JiLin),
    /** 吉林省-扶余 */
    JiLin_FuYu("JiLin_FuYu","","","扶余",Province.JiLin),
    /** 澳门-澳门 */
    AoMen_AoMen("AoMen_AoMen","","","澳门",Province.AoMen),
    /** 宁夏回族自治区-银川 */
    NingXia_YinChuan("NingXia_YinChuan","","","银川",Province.NingXia),
    /** 宁夏回族自治区-石嘴山 */
    NingXia_ShiZuiShan("NingXia_ShiZuiShan","","","石嘴山",Province.NingXia),
    /** 宁夏回族自治区-吴忠 */
    NingXia_WuZhong("NingXia_WuZhong","","","吴忠",Province.NingXia),
    /** 宁夏回族自治区-中卫 */
    NingXia_ZhongWei("NingXia_ZhongWei","","","中卫",Province.NingXia),
    /** 宁夏回族自治区-固原 */
    NingXia_GuYuan("NingXia_GuYuan","","","固原",Province.NingXia),
    /** 宁夏回族自治区-灵武 */
    NingXia_LingWu("NingXia_LingWu","","","灵武",Province.NingXia),
    /** 宁夏回族自治区-青铜峡 */
    NingXia_QingTongXia("NingXia_QingTongXia","","","青铜峡",Province.NingXia),
    /** 河北省-石家庄 */
    HeBei_ShiJiaZhuang("HeBei_ShiJiaZhuang","","","石家庄",Province.HeBei),
    /** 河北省-唐山 */
    HeBei_TangShan("HeBei_TangShan","","","唐山",Province.HeBei),
    /** 河北省-秦皇岛 */
    HeBei_QinHuangDao("HeBei_QinHuangDao","","","秦皇岛",Province.HeBei),
    /** 河北省-邯郸 */
    HeBei_HanDan("HeBei_HanDan","","","邯郸",Province.HeBei),
    /** 河北省-邢台 */
    HeBei_XingTai("HeBei_XingTai","","","邢台",Province.HeBei),
    /** 河北省-保定 */
    HeBei_BaoDing("HeBei_BaoDing","","","保定",Province.HeBei),
    /** 河北省-张家口 */
    HeBei_ZhangJiaKou("HeBei_ZhangJiaKou","","","张家口",Province.HeBei),
    /** 河北省-承德 */
    HeBei_ChengDe("HeBei_ChengDe","","","承德",Province.HeBei),
    /** 河北省-沧州 */
    HeBei_CangZhou("HeBei_CangZhou","","","沧州",Province.HeBei),
    /** 河北省-廊坊 */
    HeBei_LangFang("HeBei_LangFang","","","廊坊",Province.HeBei),
    /** 河北省-衡水 */
    HeBei_HengShui("HeBei_HengShui","","","衡水",Province.HeBei),
    /** 河北省-辛集 */
    HeBei_XinJi("HeBei_XinJi","","","辛集",Province.HeBei),
    /** 河北省-晋州 */
    HeBei_JinZhou("HeBei_JinZhou","","","晋州",Province.HeBei),
    /** 河北省-新乐 */
    HeBei_XinLe("HeBei_XinLe","","","新乐",Province.HeBei),
    /** 河北省-遵化 */
    HeBei_ZunHua("HeBei_ZunHua","","","遵化",Province.HeBei),
    /** 河北省-迁安 */
    HeBei_QianAn("HeBei_QianAn","","","迁安",Province.HeBei),
    /** 河北省-武安 */
    HeBei_WuAn("HeBei_WuAn","","","武安",Province.HeBei),
    /** 河北省-南宫 */
    HeBei_NanGong("HeBei_NanGong","","","南宫",Province.HeBei),
    /** 河北省-沙河 */
    HeBei_ShaHe("HeBei_ShaHe","","","沙河",Province.HeBei),
    /** 河北省-涿州 */
    HeBei_ZhuoZhou("HeBei_ZhuoZhou","","","涿州",Province.HeBei),
    /** 河北省-定州 */
    HeBei_DingZhou("HeBei_DingZhou","","","定州",Province.HeBei),
    /** 河北省-安国 */
    HeBei_AnGuo("HeBei_AnGuo","","","安国",Province.HeBei),
    /** 河北省-高碑店 */
    HeBei_GaoBeiDian("HeBei_GaoBeiDian","","","高碑店",Province.HeBei),
    /** 河北省-平泉 */
    HeBei_PingQuan("HeBei_PingQuan","","","平泉",Province.HeBei),
    /** 河北省-泊头 */
    HeBei_BoTou("HeBei_BoTou","","","泊头",Province.HeBei),
    /** 河北省-任丘 */
    HeBei_RenQiu("HeBei_RenQiu","","","任丘",Province.HeBei),
    /** 河北省-黄骅 */
    HeBei_HuangHua("HeBei_HuangHua","","","黄骅",Province.HeBei),
    /** 河北省-河间 */
    HeBei_HeJian("HeBei_HeJian","","","河间",Province.HeBei),
    /** 河北省-霸州 */
    HeBei_BaZhou("HeBei_BaZhou","","","霸州",Province.HeBei),
    /** 河北省-三河 */
    HeBei_SanHe("HeBei_SanHe","","","三河",Province.HeBei),
    /** 河北省-深州 */
    HeBei_ShenZhou("HeBei_ShenZhou","","","深州",Province.HeBei),
    /** 河南省-郑州 */
    HeNan_ZhengZhou("HeNan_ZhengZhou","","","郑州",Province.HeNan),
    /** 河南省-开封 */
    HeNan_KaiFeng("HeNan_KaiFeng","","","开封",Province.HeNan),
    /** 河南省-洛阳 */
    HeNan_LuoYang("HeNan_LuoYang","","","洛阳",Province.HeNan),
    /** 河南省-平顶山 */
    HeNan_PingDingShan("HeNan_PingDingShan","","","平顶山",Province.HeNan),
    /** 河南省-安阳 */
    HeNan_AnYang("HeNan_AnYang","","","安阳",Province.HeNan),
    /** 河南省-鹤壁 */
    HeNan_HeBi("HeNan_HeBi","","","鹤壁",Province.HeNan),
    /** 河南省-新乡 */
    HeNan_XinXiang("HeNan_XinXiang","","","新乡",Province.HeNan),
    /** 河南省-焦作 */
    HeNan_JiaoZuo("HeNan_JiaoZuo","","","焦作",Province.HeNan),
    /** 河南省-濮阳 */
    HeNan_PuYang("HeNan_PuYang","","","濮阳",Province.HeNan),
    /** 河南省-许昌 */
    HeNan_XuChang("HeNan_XuChang","","","许昌",Province.HeNan),
    /** 河南省-漯河 */
    HeNan_LuoHe("HeNan_LuoHe","","","漯河",Province.HeNan),
    /** 河南省-三门峡 */
    HeNan_SanMenXia("HeNan_SanMenXia","","","三门峡",Province.HeNan),
    /** 河南省-南阳 */
    HeNan_NanYang("HeNan_NanYang","","","南阳",Province.HeNan),
    /** 河南省-商丘 */
    HeNan_ShangQiu("HeNan_ShangQiu","","","商丘",Province.HeNan),
    /** 河南省-周口 */
    HeNan_ZhouKou("HeNan_ZhouKou","","","周口",Province.HeNan),
    /** 河南省-驻马店 */
    HeNan_ZhuMaDian("HeNan_ZhuMaDian","","","驻马店",Province.HeNan),
    /** 河南省-信阳 */
    HeNan_XinYang("HeNan_XinYang","","","信阳",Province.HeNan),
    /** 河南省-荥阳 */
    HeNan_YingYang("HeNan_YingYang","","","荥阳",Province.HeNan),
    /** 河南省-新郑 */
    HeNan_XinZheng("HeNan_XinZheng","","","新郑",Province.HeNan),
    /** 河南省-登封 */
    HeNan_DengFeng("HeNan_DengFeng","","","登封",Province.HeNan),
    /** 河南省-新密 */
    HeNan_XinMi("HeNan_XinMi","","","新密",Province.HeNan),
    /** 河南省-偃师 */
    HeNan_YanShi("HeNan_YanShi","","","偃师",Province.HeNan),
    /** 河南省-孟州 */
    HeNan_MengZhou("HeNan_MengZhou","","","孟州",Province.HeNan),
    /** 河南省-沁阳 */
    HeNan_QinYang("HeNan_QinYang","","","沁阳",Province.HeNan),
    /** 河南省-卫辉 */
    HeNan_WeiHui("HeNan_WeiHui","","","卫辉",Province.HeNan),
    /** 河南省-辉县 */
    HeNan_HuiXian("HeNan_HuiXian","","","辉县",Province.HeNan),
    /** 河南省-长垣 */
    HeNan_ZhangYuan("HeNan_ZhangYuan","","","长垣",Province.HeNan),
    /** 河南省-林州 */
    HeNan_LinZhou("HeNan_LinZhou","","","林州",Province.HeNan),
    /** 河南省-禹州 */
    HeNan_YuZhou("HeNan_YuZhou","","","禹州",Province.HeNan),
    /** 河南省-长葛 */
    HeNan_ZhangGe("HeNan_ZhangGe","","","长葛",Province.HeNan),
    /** 河南省-舞钢 */
    HeNan_WuGang("HeNan_WuGang","","","舞钢",Province.HeNan),
    /** 河南省-义马 */
    HeNan_YiMa("HeNan_YiMa","","","义马",Province.HeNan),
    /** 河南省-灵宝 */
    HeNan_LingBao("HeNan_LingBao","","","灵宝",Province.HeNan),
    /** 河南省-项城 */
    HeNan_XiangCheng("HeNan_XiangCheng","","","项城",Province.HeNan),
    /** 河南省-巩义 */
    HeNan_GongYi("HeNan_GongYi","","","巩义",Province.HeNan),
    /** 河南省-邓州 */
    HeNan_DengZhou("HeNan_DengZhou","","","邓州",Province.HeNan),
    /** 河南省-永城 */
    HeNan_YongCheng("HeNan_YongCheng","","","永城",Province.HeNan),
    /** 河南省-汝州 */
    HeNan_RuZhou("HeNan_RuZhou","","","汝州",Province.HeNan),
    /** 河南省-济源 */
    HeNan_JiYuan("HeNan_JiYuan","","","济源",Province.HeNan),
    /** 广西壮族自治区-南宁 */
    GuangXi_NanNing("GuangXi_NanNing","","","南宁",Province.GuangXi),
    /** 广西壮族自治区-桂林 */
    GuangXi_GuiLin("GuangXi_GuiLin","","","桂林",Province.GuangXi),
    /** 广西壮族自治区-柳州 */
    GuangXi_LiuZhou("GuangXi_LiuZhou","","","柳州",Province.GuangXi),
    /** 广西壮族自治区-梧州 */
    GuangXi_WuZhou("GuangXi_WuZhou","","","梧州",Province.GuangXi),
    /** 广西壮族自治区-贵港 */
    GuangXi_GuiGang("GuangXi_GuiGang","","","贵港",Province.GuangXi),
    /** 广西壮族自治区-玉林 */
    GuangXi_YuLin("GuangXi_YuLin","","","玉林",Province.GuangXi),
    /** 广西壮族自治区-钦州 */
    GuangXi_QinZhou("GuangXi_QinZhou","","","钦州",Province.GuangXi),
    /** 广西壮族自治区-北海 */
    GuangXi_BeiHai("GuangXi_BeiHai","","","北海",Province.GuangXi),
    /** 广西壮族自治区-防城港 */
    GuangXi_FangChengGang("GuangXi_FangChengGang","","","防城港",Province.GuangXi),
    /** 广西壮族自治区-崇左 */
    GuangXi_ChongZuo("GuangXi_ChongZuo","","","崇左",Province.GuangXi),
    /** 广西壮族自治区-百色 */
    GuangXi_BaiSe("GuangXi_BaiSe","","","百色",Province.GuangXi),
    /** 广西壮族自治区-河池 */
    GuangXi_HeChi("GuangXi_HeChi","","","河池",Province.GuangXi),
    /** 广西壮族自治区-来宾 */
    GuangXi_LaiBin("GuangXi_LaiBin","","","来宾",Province.GuangXi),
    /** 广西壮族自治区-贺州 */
    GuangXi_HeZhou("GuangXi_HeZhou","","","贺州",Province.GuangXi),
    /** 广西壮族自治区-岑溪 */
    GuangXi_CenXi("GuangXi_CenXi","","","岑溪",Province.GuangXi),
    /** 广西壮族自治区-桂平 */
    GuangXi_GuiPing("GuangXi_GuiPing","","","桂平",Province.GuangXi),
    /** 广西壮族自治区-北流 */
    GuangXi_BeiLiu("GuangXi_BeiLiu","","","北流",Province.GuangXi),
    /** 广西壮族自治区-东兴 */
    GuangXi_DongXing("GuangXi_DongXing","","","东兴",Province.GuangXi),
    /** 广西壮族自治区-凭祥 */
    GuangXi_PingXiang("GuangXi_PingXiang","","","凭祥",Province.GuangXi),
    /** 广西壮族自治区-合山 */
    GuangXi_HeShan("GuangXi_HeShan","","","合山",Province.GuangXi),
    /** 广西壮族自治区-靖西 */
    GuangXi_JingXi("GuangXi_JingXi","","","靖西",Province.GuangXi),
    /** 广西壮族自治区-平果 */
    GuangXi_PingGuo("GuangXi_PingGuo","","","平果",Province.GuangXi),
    /** 广西壮族自治区-荔浦 */
    GuangXi_LiPu("GuangXi_LiPu","","","荔浦",Province.GuangXi),
    /** 海南省-海口 */
    HaiNan_HaiKou("HaiNan_HaiKou","","","海口",Province.HaiNan),
    /** 海南省-三亚 */
    HaiNan_SanYa("HaiNan_SanYa","","","三亚",Province.HaiNan),
    /** 海南省-三沙 */
    HaiNan_SanSha("HaiNan_SanSha","","","三沙",Province.HaiNan),
    /** 海南省-儋州 */
    HaiNan_DanZhou("HaiNan_DanZhou","","","儋州",Province.HaiNan),
    /** 海南省-文昌 */
    HaiNan_WenChang("HaiNan_WenChang","","","文昌",Province.HaiNan),
    /** 海南省-琼海 */
    HaiNan_QiongHai("HaiNan_QiongHai","","","琼海",Province.HaiNan),
    /** 海南省-万宁 */
    HaiNan_WanNing("HaiNan_WanNing","","","万宁",Province.HaiNan),
    /** 海南省-东方 */
    HaiNan_DongFang("HaiNan_DongFang","","","东方",Province.HaiNan),
    /** 海南省-五指山 */
    HaiNan_WuZhiShan("HaiNan_WuZhiShan","","","五指山",Province.HaiNan),
    /** 上海-上海 */
    ShangHai_ShangHai("ShangHai_ShangHai","","","上海",Province.ShangHai),
    /** 香港-香港 */
    XiangGang_XiangGang("XiangGang_XiangGang","","","香港",Province.XiangGang),
    /** 江西省-南昌 */
    JiangXi_NanChang("JiangXi_NanChang","","","南昌",Province.JiangXi),
    /** 江西省-九江 */
    JiangXi_JiuJiang("JiangXi_JiuJiang","","","九江",Province.JiangXi),
    /** 江西省-景德镇 */
    JiangXi_JingDeZhen("JiangXi_JingDeZhen","","","景德镇",Province.JiangXi),
    /** 江西省-鹰潭 */
    JiangXi_YingTan("JiangXi_YingTan","","","鹰潭",Province.JiangXi),
    /** 江西省-新余 */
    JiangXi_XinYu("JiangXi_XinYu","","","新余",Province.JiangXi),
    /** 江西省-萍乡 */
    JiangXi_PingXiang("JiangXi_PingXiang","","","萍乡",Province.JiangXi),
    /** 江西省-赣州 */
    JiangXi_GanZhou("JiangXi_GanZhou","","","赣州",Province.JiangXi),
    /** 江西省-上饶 */
    JiangXi_ShangRao("JiangXi_ShangRao","","","上饶",Province.JiangXi),
    /** 江西省-抚州 */
    JiangXi_FuZhou("JiangXi_FuZhou","","","抚州",Province.JiangXi),
    /** 江西省-宜春 */
    JiangXi_YiChun("JiangXi_YiChun","","","宜春",Province.JiangXi),
    /** 江西省-吉安 */
    JiangXi_JiAn("JiangXi_JiAn","","","吉安",Province.JiangXi),
    /** 江西省-瑞昌 */
    JiangXi_RuiChang("JiangXi_RuiChang","","","瑞昌",Province.JiangXi),
    /** 江西省-共青城 */
    JiangXi_GongQingCheng("JiangXi_GongQingCheng","","","共青城",Province.JiangXi),
    /** 江西省-庐山 */
    JiangXi_LuShan("JiangXi_LuShan","","","庐山",Province.JiangXi),
    /** 江西省-乐平 */
    JiangXi_LePing("JiangXi_LePing","","","乐平",Province.JiangXi),
    /** 江西省-瑞金 */
    JiangXi_RuiJin("JiangXi_RuiJin","","","瑞金",Province.JiangXi),
    /** 江西省-德兴 */
    JiangXi_DeXing("JiangXi_DeXing","","","德兴",Province.JiangXi),
    /** 江西省-丰城 */
    JiangXi_FengCheng("JiangXi_FengCheng","","","丰城",Province.JiangXi),
    /** 江西省-樟树 */
    JiangXi_ZhangShu("JiangXi_ZhangShu","","","樟树",Province.JiangXi),
    /** 江西省-高安 */
    JiangXi_GaoAn("JiangXi_GaoAn","","","高安",Province.JiangXi),
    /** 江西省-井冈山 */
    JiangXi_JingGangShan("JiangXi_JingGangShan","","","井冈山",Province.JiangXi),
    /** 江西省-贵溪 */
    JiangXi_GuiXi("JiangXi_GuiXi","","","贵溪",Province.JiangXi),
    /** 云南省-昆明 */
    YunNan_KunMing("YunNan_KunMing","","","昆明",Province.YunNan),
    /** 云南省-曲靖 */
    YunNan_QuJing("YunNan_QuJing","","","曲靖",Province.YunNan),
    /** 云南省-玉溪 */
    YunNan_YuXi("YunNan_YuXi","","","玉溪",Province.YunNan),
    /** 云南省-丽江 */
    YunNan_LiJiang("YunNan_LiJiang","","","丽江",Province.YunNan),
    /** 云南省-昭通 */
    YunNan_ZhaoTong("YunNan_ZhaoTong","","","昭通",Province.YunNan),
    /** 云南省-普洱 */
    YunNan_PuEr("YunNan_PuEr","","","普洱",Province.YunNan),
    /** 云南省-临沧 */
    YunNan_LinCang("YunNan_LinCang","","","临沧",Province.YunNan),
    /** 云南省-保山 */
    YunNan_BaoShan("YunNan_BaoShan","","","保山",Province.YunNan),
    /** 云南省-安宁 */
    YunNan_AnNing("YunNan_AnNing","","","安宁",Province.YunNan),
    /** 云南省-宣威 */
    YunNan_XuanWei("YunNan_XuanWei","","","宣威",Province.YunNan),
    /** 云南省-芒 */
    YunNan_Mang("YunNan_Mang","","","芒",Province.YunNan),
    /** 云南省-瑞丽 */
    YunNan_RuiLi("YunNan_RuiLi","","","瑞丽",Province.YunNan),
    /** 云南省-大理 */
    YunNan_DaLi("YunNan_DaLi","","","大理",Province.YunNan),
    /** 云南省-楚雄 */
    YunNan_ChuXiong("YunNan_ChuXiong","","","楚雄",Province.YunNan),
    /** 云南省-个旧 */
    YunNan_GeJiu("YunNan_GeJiu","","","个旧",Province.YunNan),
    /** 云南省-开远 */
    YunNan_KaiYuan("YunNan_KaiYuan","","","开远",Province.YunNan),
    /** 云南省-蒙自 */
    YunNan_MengZi("YunNan_MengZi","","","蒙自",Province.YunNan),
    /** 云南省-弥勒 */
    YunNan_MiLe("YunNan_MiLe","","","弥勒",Province.YunNan),
    /** 云南省-景洪 */
    YunNan_JingHong("YunNan_JingHong","","","景洪",Province.YunNan),
    /** 云南省-文山 */
    YunNan_WenShan("YunNan_WenShan","","","文山",Province.YunNan),
    /** 云南省-香格里拉 */
    YunNan_XiangGeLiLa("YunNan_XiangGeLiLa","","","香格里拉",Province.YunNan),
    /** 云南省-腾冲 */
    YunNan_TengChong("YunNan_TengChong","","","腾冲",Province.YunNan),
    /** 云南省-水富 */
    YunNan_ShuiFu("YunNan_ShuiFu","","","水富",Province.YunNan),
    /** 云南省-澄江 */
    YunNan_ChengJiang("YunNan_ChengJiang","","","澄江",Province.YunNan),
    /** 云南省-泸水 */
    YunNan_LuShui("YunNan_LuShui","","","泸水",Province.YunNan),
    /** 甘肃省-兰州 */
    GanSu_LanZhou("GanSu_LanZhou","","","兰州",Province.GanSu),
    /** 甘肃省-嘉峪关 */
    GanSu_JiaYuGuan("GanSu_JiaYuGuan","","","嘉峪关",Province.GanSu),
    /** 甘肃省-金昌 */
    GanSu_JinChang("GanSu_JinChang","","","金昌",Province.GanSu),
    /** 甘肃省-白银 */
    GanSu_BaiYin("GanSu_BaiYin","","","白银",Province.GanSu),
    /** 甘肃省-天水 */
    GanSu_TianShui("GanSu_TianShui","","","天水",Province.GanSu),
    /** 甘肃省-酒泉 */
    GanSu_JiuQuan("GanSu_JiuQuan","","","酒泉",Province.GanSu),
    /** 甘肃省-张掖 */
    GanSu_ZhangYe("GanSu_ZhangYe","","","张掖",Province.GanSu),
    /** 甘肃省-武威 */
    GanSu_WuWei("GanSu_WuWei","","","武威",Province.GanSu),
    /** 甘肃省-庆阳 */
    GanSu_QingYang("GanSu_QingYang","","","庆阳",Province.GanSu),
    /** 甘肃省-平凉 */
    GanSu_PingLiang("GanSu_PingLiang","","","平凉",Province.GanSu),
    /** 甘肃省-定西 */
    GanSu_DingXi("GanSu_DingXi","","","定西",Province.GanSu),
    /** 甘肃省-陇南 */
    GanSu_LongNan("GanSu_LongNan","","","陇南",Province.GanSu),
    /** 甘肃省-玉门 */
    GanSu_YuMen("GanSu_YuMen","","","玉门",Province.GanSu),
    /** 甘肃省-敦煌 */
    GanSu_DunHuang("GanSu_DunHuang","","","敦煌",Province.GanSu),
    /** 甘肃省-临夏 */
    GanSu_LinXia("GanSu_LinXia","","","临夏",Province.GanSu),
    /** 甘肃省-合作 */
    GanSu_HeZuo("GanSu_HeZuo","","","合作",Province.GanSu),
    /** 甘肃省-华亭 */
    GanSu_HuaTing("GanSu_HuaTing","","","华亭",Province.GanSu),
    /** 山东省-济南 */
    ShanDong_JiNan("ShanDong_JiNan","","","济南",Province.ShanDong),
    /** 山东省-青岛 */
    ShanDong_QingDao("ShanDong_QingDao","","","青岛",Province.ShanDong),
    /** 山东省-聊城 */
    ShanDong_LiaoCheng("ShanDong_LiaoCheng","","","聊城",Province.ShanDong),
    /** 山东省-德州 */
    ShanDong_DeZhou("ShanDong_DeZhou","","","德州",Province.ShanDong),
    /** 山东省-东营 */
    ShanDong_DongYing("ShanDong_DongYing","","","东营",Province.ShanDong),
    /** 山东省-淄博 */
    ShanDong_ZiBo("ShanDong_ZiBo","","","淄博",Province.ShanDong),
    /** 山东省-潍坊 */
    ShanDong_WeiFang("ShanDong_WeiFang","","","潍坊",Province.ShanDong),
    /** 山东省-烟台 */
    ShanDong_YanTai("ShanDong_YanTai","","","烟台",Province.ShanDong),
    /** 山东省-威海 */
    ShanDong_WeiHai("ShanDong_WeiHai","","","威海",Province.ShanDong),
    /** 山东省-日照 */
    ShanDong_RiZhao("ShanDong_RiZhao","","","日照",Province.ShanDong),
    /** 山东省-临沂 */
    ShanDong_LinYi("ShanDong_LinYi","","","临沂",Province.ShanDong),
    /** 山东省-枣庄 */
    ShanDong_ZaoZhuang("ShanDong_ZaoZhuang","","","枣庄",Province.ShanDong),
    /** 山东省-济宁 */
    ShanDong_JiNing("ShanDong_JiNing","","","济宁",Province.ShanDong),
    /** 山东省-泰安 */
    ShanDong_TaiAn("ShanDong_TaiAn","","","泰安",Province.ShanDong),
    /** 山东省-滨州 */
    ShanDong_BinZhou("ShanDong_BinZhou","","","滨州",Province.ShanDong),
    /** 山东省-菏泽 */
    ShanDong_HeZe("ShanDong_HeZe","","","菏泽",Province.ShanDong),
    /** 山东省-胶州 */
    ShanDong_JiaoZhou("ShanDong_JiaoZhou","","","胶州",Province.ShanDong),
    /** 山东省-平度 */
    ShanDong_PingDu("ShanDong_PingDu","","","平度",Province.ShanDong),
    /** 山东省-莱西 */
    ShanDong_LaiXi("ShanDong_LaiXi","","","莱西",Province.ShanDong),
    /** 山东省-临清 */
    ShanDong_LinQing("ShanDong_LinQing","","","临清",Province.ShanDong),
    /** 山东省-乐陵 */
    ShanDong_LeLing("ShanDong_LeLing","","","乐陵",Province.ShanDong),
    /** 山东省-禹城 */
    ShanDong_YuCheng("ShanDong_YuCheng","","","禹城",Province.ShanDong),
    /** 山东省-安丘 */
    ShanDong_AnQiu("ShanDong_AnQiu","","","安丘",Province.ShanDong),
    /** 山东省-昌邑 */
    ShanDong_ChangYi("ShanDong_ChangYi","","","昌邑",Province.ShanDong),
    /** 山东省-高密 */
    ShanDong_GaoMi("ShanDong_GaoMi","","","高密",Province.ShanDong),
    /** 山东省-青州 */
    ShanDong_QingZhou("ShanDong_QingZhou","","","青州",Province.ShanDong),
    /** 山东省-诸城 */
    ShanDong_ZhuCheng("ShanDong_ZhuCheng","","","诸城",Province.ShanDong),
    /** 山东省-寿光 */
    ShanDong_ShouGuang("ShanDong_ShouGuang","","","寿光",Province.ShanDong),
    /** 山东省-栖霞 */
    ShanDong_QiXia("ShanDong_QiXia","","","栖霞",Province.ShanDong),
    /** 山东省-海阳 */
    ShanDong_HaiYang("ShanDong_HaiYang","","","海阳",Province.ShanDong),
    /** 山东省-龙口 */
    ShanDong_LongKou("ShanDong_LongKou","","","龙口",Province.ShanDong),
    /** 山东省-莱阳 */
    ShanDong_LaiYang("ShanDong_LaiYang","","","莱阳",Province.ShanDong),
    /** 山东省-莱州 */
    ShanDong_LaiZhou("ShanDong_LaiZhou","","","莱州",Province.ShanDong),
    /** 山东省-蓬莱 */
    ShanDong_PengLai("ShanDong_PengLai","","","蓬莱",Province.ShanDong),
    /** 山东省-招远 */
    ShanDong_ZhaoYuan("ShanDong_ZhaoYuan","","","招远",Province.ShanDong),
    /** 山东省-荣成 */
    ShanDong_RongCheng("ShanDong_RongCheng","","","荣成",Province.ShanDong),
    /** 山东省-乳山 */
    ShanDong_RuShan("ShanDong_RuShan","","","乳山",Province.ShanDong),
    /** 山东省-滕州 */
    ShanDong_TengZhou("ShanDong_TengZhou","","","滕州",Province.ShanDong),
    /** 山东省-曲阜 */
    ShanDong_QuFu("ShanDong_QuFu","","","曲阜",Province.ShanDong),
    /** 山东省-邹城 */
    ShanDong_ZouCheng("ShanDong_ZouCheng","","","邹城",Province.ShanDong),
    /** 山东省-新泰 */
    ShanDong_XinTai("ShanDong_XinTai","","","新泰",Province.ShanDong),
    /** 山东省-肥城 */
    ShanDong_FeiCheng("ShanDong_FeiCheng","","","肥城",Province.ShanDong),
    /** 山东省-邹平 */
    ShanDong_ZouPing("ShanDong_ZouPing","","","邹平",Province.ShanDong),
    /** 陕西省-西安 */
    ShanXiS_XiAn("ShanXiS_XiAn","","","西安",Province.ShanXiS),
    /** 陕西省-延安 */
    ShanXiS_YanAn("ShanXiS_YanAn","","","延安",Province.ShanXiS),
    /** 陕西省-铜川 */
    ShanXiS_TongChuan("ShanXiS_TongChuan","","","铜川",Province.ShanXiS),
    /** 陕西省-渭南 */
    ShanXiS_WeiNan("ShanXiS_WeiNan","","","渭南",Province.ShanXiS),
    /** 陕西省-咸阳 */
    ShanXiS_XianYang("ShanXiS_XianYang","","","咸阳",Province.ShanXiS),
    /** 陕西省-宝鸡 */
    ShanXiS_BaoJi("ShanXiS_BaoJi","","","宝鸡",Province.ShanXiS),
    /** 陕西省-汉中 */
    ShanXiS_HanZhong("ShanXiS_HanZhong","","","汉中",Province.ShanXiS),
    /** 陕西省-榆林 */
    ShanXiS_YuLin("ShanXiS_YuLin","","","榆林",Province.ShanXiS),
    /** 陕西省-商洛 */
    ShanXiS_ShangLuo("ShanXiS_ShangLuo","","","商洛",Province.ShanXiS),
    /** 陕西省-安康 */
    ShanXiS_AnKang("ShanXiS_AnKang","","","安康",Province.ShanXiS),
    /** 陕西省-韩城 */
    ShanXiS_HanCheng("ShanXiS_HanCheng","","","韩城",Province.ShanXiS),
    /** 陕西省-华阴 */
    ShanXiS_HuaYin("ShanXiS_HuaYin","","","华阴",Province.ShanXiS),
    /** 陕西省-兴平 */
    ShanXiS_XingPing("ShanXiS_XingPing","","","兴平",Province.ShanXiS),
    /** 陕西省-彬州 */
    ShanXiS_BinZhou("ShanXiS_BinZhou","","","彬州",Province.ShanXiS),
    /** 陕西省-神木 */
    ShanXiS_ShenMu("ShanXiS_ShenMu","","","神木",Province.ShanXiS),
    /** 陕西省-子长 */
    ShanXiS_ZiZhang("ShanXiS_ZiZhang","","","子长",Province.ShanXiS),
    /** 浙江省-杭州 */
    ZheJiang_HangZhou("ZheJiang_HangZhou","","","杭州",Province.ZheJiang),
    /** 浙江省-宁波 */
    ZheJiang_NingBo("ZheJiang_NingBo","","","宁波",Province.ZheJiang),
    /** 浙江省-湖州 */
    ZheJiang_HuZhou("ZheJiang_HuZhou","","","湖州",Province.ZheJiang),
    /** 浙江省-嘉兴 */
    ZheJiang_JiaXing("ZheJiang_JiaXing","","","嘉兴",Province.ZheJiang),
    /** 浙江省-舟山 */
    ZheJiang_ZhouShan("ZheJiang_ZhouShan","","","舟山",Province.ZheJiang),
    /** 浙江省-绍兴 */
    ZheJiang_ShaoXing("ZheJiang_ShaoXing","","","绍兴",Province.ZheJiang),
    /** 浙江省-衢州 */
    ZheJiang_QuZhou("ZheJiang_QuZhou","","","衢州",Province.ZheJiang),
    /** 浙江省-金华 */
    ZheJiang_JinHua("ZheJiang_JinHua","","","金华",Province.ZheJiang),
    /** 浙江省-台州 */
    ZheJiang_TaiZhou("ZheJiang_TaiZhou","","","台州",Province.ZheJiang),
    /** 浙江省-温州 */
    ZheJiang_WenZhou("ZheJiang_WenZhou","","","温州",Province.ZheJiang),
    /** 浙江省-丽水 */
    ZheJiang_LiShui("ZheJiang_LiShui","","","丽水",Province.ZheJiang),
    /** 浙江省-建德 */
    ZheJiang_JianDe("ZheJiang_JianDe","","","建德",Province.ZheJiang),
    /** 浙江省-慈溪 */
    ZheJiang_CiXi("ZheJiang_CiXi","","","慈溪",Province.ZheJiang),
    /** 浙江省-余姚 */
    ZheJiang_YuYao("ZheJiang_YuYao","","","余姚",Province.ZheJiang),
    /** 浙江省-平湖 */
    ZheJiang_PingHu("ZheJiang_PingHu","","","平湖",Province.ZheJiang),
    /** 浙江省-海宁 */
    ZheJiang_HaiNing("ZheJiang_HaiNing","","","海宁",Province.ZheJiang),
    /** 浙江省-桐乡 */
    ZheJiang_TongXiang("ZheJiang_TongXiang","","","桐乡",Province.ZheJiang),
    /** 浙江省-诸暨 */
    ZheJiang_ZhuJi("ZheJiang_ZhuJi","","","诸暨",Province.ZheJiang),
    /** 浙江省-嵊州 */
    ZheJiang_ShengZhou("ZheJiang_ShengZhou","","","嵊州",Province.ZheJiang),
    /** 浙江省-江山 */
    ZheJiang_JiangShan("ZheJiang_JiangShan","","","江山",Province.ZheJiang),
    /** 浙江省-兰溪 */
    ZheJiang_LanXi("ZheJiang_LanXi","","","兰溪",Province.ZheJiang),
    /** 浙江省-永康 */
    ZheJiang_YongKang("ZheJiang_YongKang","","","永康",Province.ZheJiang),
    /** 浙江省-义乌 */
    ZheJiang_YiWu("ZheJiang_YiWu","","","义乌",Province.ZheJiang),
    /** 浙江省-东阳 */
    ZheJiang_DongYang("ZheJiang_DongYang","","","东阳",Province.ZheJiang),
    /** 浙江省-临海 */
    ZheJiang_LinHai("ZheJiang_LinHai","","","临海",Province.ZheJiang),
    /** 浙江省-温岭 */
    ZheJiang_WenLing("ZheJiang_WenLing","","","温岭",Province.ZheJiang),
    /** 浙江省-瑞安 */
    ZheJiang_RuiAn("ZheJiang_RuiAn","","","瑞安",Province.ZheJiang),
    /** 浙江省-乐清 */
    ZheJiang_LeQing("ZheJiang_LeQing","","","乐清",Province.ZheJiang),
    /** 浙江省-龙港 */
    ZheJiang_LongGang("ZheJiang_LongGang","","","龙港",Province.ZheJiang),
    /** 浙江省-龙泉 */
    ZheJiang_LongQuan("ZheJiang_LongQuan","","","龙泉",Province.ZheJiang),
    /** 浙江省-玉环 */
    ZheJiang_YuHuan("ZheJiang_YuHuan","","","玉环",Province.ZheJiang),
    /** 内蒙古自治区-呼和浩特 */
    NeiMengGu_HuHeHaoTe("NeiMengGu_HuHeHaoTe","","","呼和浩特",Province.NeiMengGu),
    /** 内蒙古自治区-包头 */
    NeiMengGu_BaoTou("NeiMengGu_BaoTou","","","包头",Province.NeiMengGu),
    /** 内蒙古自治区-乌海 */
    NeiMengGu_WuHai("NeiMengGu_WuHai","","","乌海",Province.NeiMengGu),
    /** 内蒙古自治区-赤峰 */
    NeiMengGu_ChiFeng("NeiMengGu_ChiFeng","","","赤峰",Province.NeiMengGu),
    /** 内蒙古自治区-通辽 */
    NeiMengGu_TongLiao("NeiMengGu_TongLiao","","","通辽",Province.NeiMengGu),
    /** 内蒙古自治区-鄂尔多斯 */
    NeiMengGu_EErDuoSi("NeiMengGu_EErDuoSi","","","鄂尔多斯",Province.NeiMengGu),
    /** 内蒙古自治区-呼伦贝尔 */
    NeiMengGu_HuLunBeiEr("NeiMengGu_HuLunBeiEr","","","呼伦贝尔",Province.NeiMengGu),
    /** 内蒙古自治区-巴彦淖尔 */
    NeiMengGu_BaYanNaoEr("NeiMengGu_BaYanNaoEr","","","巴彦淖尔",Province.NeiMengGu),
    /** 内蒙古自治区-乌兰察布 */
    NeiMengGu_WuLanChaBu("NeiMengGu_WuLanChaBu","","","乌兰察布",Province.NeiMengGu),
    /** 内蒙古自治区-霍林郭勒 */
    NeiMengGu_HuoLinGuoLe("NeiMengGu_HuoLinGuoLe","","","霍林郭勒",Province.NeiMengGu),
    /** 内蒙古自治区-满洲里 */
    NeiMengGu_ManZhouLi("NeiMengGu_ManZhouLi","","","满洲里",Province.NeiMengGu),
    /** 内蒙古自治区-牙克石 */
    NeiMengGu_YaKeShi("NeiMengGu_YaKeShi","","","牙克石",Province.NeiMengGu),
    /** 内蒙古自治区-扎兰屯 */
    NeiMengGu_ZhaLanTun("NeiMengGu_ZhaLanTun","","","扎兰屯",Province.NeiMengGu),
    /** 内蒙古自治区-额尔古纳 */
    NeiMengGu_EErGuNa("NeiMengGu_EErGuNa","","","额尔古纳",Province.NeiMengGu),
    /** 内蒙古自治区-根河 */
    NeiMengGu_GenHe("NeiMengGu_GenHe","","","根河",Province.NeiMengGu),
    /** 内蒙古自治区-丰镇 */
    NeiMengGu_FengZhen("NeiMengGu_FengZhen","","","丰镇",Province.NeiMengGu),
    /** 内蒙古自治区-乌兰浩特 */
    NeiMengGu_WuLanHaoTe("NeiMengGu_WuLanHaoTe","","","乌兰浩特",Province.NeiMengGu),
    /** 内蒙古自治区-阿尔山 */
    NeiMengGu_AErShan("NeiMengGu_AErShan","","","阿尔山",Province.NeiMengGu),
    /** 内蒙古自治区-二连浩特 */
    NeiMengGu_ErLianHaoTe("NeiMengGu_ErLianHaoTe","","","二连浩特",Province.NeiMengGu),
    /** 内蒙古自治区-锡林浩特 */
    NeiMengGu_XiLinHaoTe("NeiMengGu_XiLinHaoTe","","","锡林浩特",Province.NeiMengGu),
    /** 青海省-西宁 */
    QingHai_XiNing("QingHai_XiNing","","","西宁",Province.QingHai),
    /** 青海省-海东 */
    QingHai_HaiDong("QingHai_HaiDong","","","海东",Province.QingHai),
    /** 青海省-格尔木 */
    QingHai_GeErMu("QingHai_GeErMu","","","格尔木",Province.QingHai),
    /** 青海省-德令哈 */
    QingHai_DeLingHa("QingHai_DeLingHa","","","德令哈",Province.QingHai),
    /** 青海省-玉树 */
    QingHai_YuShu("QingHai_YuShu","","","玉树",Province.QingHai),
    /** 青海省-茫崖 */
    QingHai_MangYa("QingHai_MangYa","","","茫崖",Province.QingHai),
    /** 辽宁省-沈阳 */
    LiaoNing_ShenYang("LiaoNing_ShenYang","","","沈阳",Province.LiaoNing),
    /** 辽宁省-大连 */
    LiaoNing_DaLian("LiaoNing_DaLian","","","大连",Province.LiaoNing),
    /** 辽宁省-鞍山 */
    LiaoNing_AnShan("LiaoNing_AnShan","","","鞍山",Province.LiaoNing),
    /** 辽宁省-抚顺 */
    LiaoNing_FuShun("LiaoNing_FuShun","","","抚顺",Province.LiaoNing),
    /** 辽宁省-本溪 */
    LiaoNing_BenXi("LiaoNing_BenXi","","","本溪",Province.LiaoNing),
    /** 辽宁省-丹东 */
    LiaoNing_DanDong("LiaoNing_DanDong","","","丹东",Province.LiaoNing),
    /** 辽宁省-锦州 */
    LiaoNing_JinZhou("LiaoNing_JinZhou","","","锦州",Province.LiaoNing),
    /** 辽宁省-营口 */
    LiaoNing_YingKou("LiaoNing_YingKou","","","营口",Province.LiaoNing),
    /** 辽宁省-阜新 */
    LiaoNing_FuXin("LiaoNing_FuXin","","","阜新",Province.LiaoNing),
    /** 辽宁省-辽阳 */
    LiaoNing_LiaoYang("LiaoNing_LiaoYang","","","辽阳",Province.LiaoNing),
    /** 辽宁省-盘锦 */
    LiaoNing_PanJin("LiaoNing_PanJin","","","盘锦",Province.LiaoNing),
    /** 辽宁省-铁岭 */
    LiaoNing_TieLing("LiaoNing_TieLing","","","铁岭",Province.LiaoNing),
    /** 辽宁省-朝阳 */
    LiaoNing_ChaoYang("LiaoNing_ChaoYang","","","朝阳",Province.LiaoNing),
    /** 辽宁省-葫芦岛 */
    LiaoNing_HuLuDao("LiaoNing_HuLuDao","","","葫芦岛",Province.LiaoNing),
    /** 辽宁省-新民 */
    LiaoNing_XinMin("LiaoNing_XinMin","","","新民",Province.LiaoNing),
    /** 辽宁省-瓦房店 */
    LiaoNing_WaFangDian("LiaoNing_WaFangDian","","","瓦房店",Province.LiaoNing),
    /** 辽宁省-庄河 */
    LiaoNing_ZhuangHe("LiaoNing_ZhuangHe","","","庄河",Province.LiaoNing),
    /** 辽宁省-海城 */
    LiaoNing_HaiCheng("LiaoNing_HaiCheng","","","海城",Province.LiaoNing),
    /** 辽宁省-东港 */
    LiaoNing_DongGang("LiaoNing_DongGang","","","东港",Province.LiaoNing),
    /** 辽宁省-凤城 */
    LiaoNing_FengCheng("LiaoNing_FengCheng","","","凤城",Province.LiaoNing),
    /** 辽宁省-凌海 */
    LiaoNing_LingHai("LiaoNing_LingHai","","","凌海",Province.LiaoNing),
    /** 辽宁省-北镇 */
    LiaoNing_BeiZhen("LiaoNing_BeiZhen","","","北镇",Province.LiaoNing),
    /** 辽宁省-盖州 */
    LiaoNing_GaiZhou("LiaoNing_GaiZhou","","","盖州",Province.LiaoNing),
    /** 辽宁省-大石桥 */
    LiaoNing_DaShiQiao("LiaoNing_DaShiQiao","","","大石桥",Province.LiaoNing),
    /** 辽宁省-灯塔 */
    LiaoNing_DengTa("LiaoNing_DengTa","","","灯塔",Province.LiaoNing),
    /** 辽宁省-调兵山 */
    LiaoNing_DiaoBingShan("LiaoNing_DiaoBingShan","","","调兵山",Province.LiaoNing),
    /** 辽宁省-开原 */
    LiaoNing_KaiYuan("LiaoNing_KaiYuan","","","开原",Province.LiaoNing),
    /** 辽宁省-北票 */
    LiaoNing_BeiPiao("LiaoNing_BeiPiao","","","北票",Province.LiaoNing),
    /** 辽宁省-凌源 */
    LiaoNing_LingYuan("LiaoNing_LingYuan","","","凌源",Province.LiaoNing),
    /** 辽宁省-兴城 */
    LiaoNing_XingCheng("LiaoNing_XingCheng","","","兴城",Province.LiaoNing),
    /** 台湾省-台北 */
    TaiWan_TaiBei("TaiWan_TaiBei","","","台北",Province.TaiWan),
    /** 台湾省-新北 */
    TaiWan_XinBei("TaiWan_XinBei","","","新北",Province.TaiWan),
    /** 台湾省-桃园 */
    TaiWan_TaoYuan("TaiWan_TaoYuan","","","桃园",Province.TaiWan),
    /** 台湾省-台中 */
    TaiWan_TaiZhong("TaiWan_TaiZhong","","","台中",Province.TaiWan),
    /** 台湾省-台南 */
    TaiWan_TaiNan("TaiWan_TaiNan","","","台南",Province.TaiWan),
    /** 台湾省-高雄 */
    TaiWan_GaoXiong("TaiWan_GaoXiong","","","高雄",Province.TaiWan),
    /** 台湾省-基隆 */
    TaiWan_JiLong("TaiWan_JiLong","","","基隆",Province.TaiWan),
    /** 台湾省-新竹 */
    TaiWan_XinZhu("TaiWan_XinZhu","","","新竹",Province.TaiWan),
    /** 台湾省-嘉义 */
    TaiWan_JiaYi("TaiWan_JiaYi","","","嘉义",Province.TaiWan),
    /** 台湾省-苗栗 */
    TaiWan_MiaoLi("TaiWan_MiaoLi","","","苗栗",Province.TaiWan),
    /** 台湾省-彰化 */
    TaiWan_ZhangHua("TaiWan_ZhangHua","","","彰化",Province.TaiWan),
    /** 台湾省-南投 */
    TaiWan_NanTou("TaiWan_NanTou","","","南投",Province.TaiWan),
    /** 台湾省-云林 */
    TaiWan_YunLin("TaiWan_YunLin","","","云林",Province.TaiWan),
    /** 台湾省-屏东 */
    TaiWan_PingDong("TaiWan_PingDong","","","屏东",Province.TaiWan),
    /** 台湾省-宜兰 */
    TaiWan_YiLan("TaiWan_YiLan","","","宜兰",Province.TaiWan),
    /** 台湾省-花莲 */
    TaiWan_HuaLian("TaiWan_HuaLian","","","花莲",Province.TaiWan),
    /** 台湾省-台东 */
    TaiWan_TaiDong("TaiWan_TaiDong","","","台东",Province.TaiWan),
    /** 台湾省-澎湖 */
    TaiWan_PengHu("TaiWan_PengHu","","","澎湖",Province.TaiWan),
    /** 黑龙江省-哈尔滨 */
    HeiLongJiang_HaErBin("HeiLongJiang_HaErBin","","","哈尔滨",Province.HeiLongJiang),
    /** 黑龙江省-齐齐哈尔 */
    HeiLongJiang_QiQiHaEr("HeiLongJiang_QiQiHaEr","","","齐齐哈尔",Province.HeiLongJiang),
    /** 黑龙江省-黑河 */
    HeiLongJiang_HeiHe("HeiLongJiang_HeiHe","","","黑河",Province.HeiLongJiang),
    /** 黑龙江省-大庆 */
    HeiLongJiang_DaQing("HeiLongJiang_DaQing","","","大庆",Province.HeiLongJiang),
    /** 黑龙江省-伊春 */
    HeiLongJiang_YiChun("HeiLongJiang_YiChun","","","伊春",Province.HeiLongJiang),
    /** 黑龙江省-鹤岗 */
    HeiLongJiang_HeGang("HeiLongJiang_HeGang","","","鹤岗",Province.HeiLongJiang),
    /** 黑龙江省-佳木斯 */
    HeiLongJiang_JiaMuSi("HeiLongJiang_JiaMuSi","","","佳木斯",Province.HeiLongJiang),
    /** 黑龙江省-双鸭山 */
    HeiLongJiang_ShuangYaShan("HeiLongJiang_ShuangYaShan","","","双鸭山",Province.HeiLongJiang),
    /** 黑龙江省-七台河 */
    HeiLongJiang_QiTaiHe("HeiLongJiang_QiTaiHe","","","七台河",Province.HeiLongJiang),
    /** 黑龙江省-鸡西 */
    HeiLongJiang_JiXi("HeiLongJiang_JiXi","","","鸡西",Province.HeiLongJiang),
    /** 黑龙江省-牡丹江 */
    HeiLongJiang_MuDanJiang("HeiLongJiang_MuDanJiang","","","牡丹江",Province.HeiLongJiang),
    /** 黑龙江省-绥化 */
    HeiLongJiang_SuiHua("HeiLongJiang_SuiHua","","","绥化",Province.HeiLongJiang),
    /** 黑龙江省-尚志 */
    HeiLongJiang_ShangZhi("HeiLongJiang_ShangZhi","","","尚志",Province.HeiLongJiang),
    /** 黑龙江省-五常 */
    HeiLongJiang_WuChang("HeiLongJiang_WuChang","","","五常",Province.HeiLongJiang),
    /** 黑龙江省-讷河 */
    HeiLongJiang_NeHe("HeiLongJiang_NeHe","","","讷河",Province.HeiLongJiang),
    /** 黑龙江省-北安 */
    HeiLongJiang_BeiAn("HeiLongJiang_BeiAn","","","北安",Province.HeiLongJiang),
    /** 黑龙江省-五大连池 */
    HeiLongJiang_WuDaLianChi("HeiLongJiang_WuDaLianChi","","","五大连池",Province.HeiLongJiang),
    /** 黑龙江省-嫩江 */
    HeiLongJiang_NenJiang("HeiLongJiang_NenJiang","","","嫩江",Province.HeiLongJiang),
    /** 黑龙江省-铁力 */
    HeiLongJiang_TieLi("HeiLongJiang_TieLi","","","铁力",Province.HeiLongJiang),
    /** 黑龙江省-同江 */
    HeiLongJiang_TongJiang("HeiLongJiang_TongJiang","","","同江",Province.HeiLongJiang),
    /** 黑龙江省-富锦 */
    HeiLongJiang_FuJin("HeiLongJiang_FuJin","","","富锦",Province.HeiLongJiang),
    /** 黑龙江省-虎林 */
    HeiLongJiang_HuLin("HeiLongJiang_HuLin","","","虎林",Province.HeiLongJiang),
    /** 黑龙江省-密山 */
    HeiLongJiang_MiShan("HeiLongJiang_MiShan","","","密山",Province.HeiLongJiang),
    /** 黑龙江省-绥芬河 */
    HeiLongJiang_SuiFenHe("HeiLongJiang_SuiFenHe","","","绥芬河",Province.HeiLongJiang),
    /** 黑龙江省-海林 */
    HeiLongJiang_HaiLin("HeiLongJiang_HaiLin","","","海林",Province.HeiLongJiang),
    /** 黑龙江省-宁安 */
    HeiLongJiang_NingAn("HeiLongJiang_NingAn","","","宁安",Province.HeiLongJiang),
    /** 黑龙江省-安达 */
    HeiLongJiang_AnDa("HeiLongJiang_AnDa","","","安达",Province.HeiLongJiang),
    /** 黑龙江省-肇东 */
    HeiLongJiang_ZhaoDong("HeiLongJiang_ZhaoDong","","","肇东",Province.HeiLongJiang),
    /** 黑龙江省-海伦 */
    HeiLongJiang_HaiLun("HeiLongJiang_HaiLun","","","海伦",Province.HeiLongJiang),
    /** 黑龙江省-穆棱 */
    HeiLongJiang_MuLeng("HeiLongJiang_MuLeng","","","穆棱",Province.HeiLongJiang),
    /** 黑龙江省-东宁 */
    HeiLongJiang_DongNing("HeiLongJiang_DongNing","","","东宁",Province.HeiLongJiang),
    /** 黑龙江省-抚远 */
    HeiLongJiang_FuYuan("HeiLongJiang_FuYuan","","","抚远",Province.HeiLongJiang),
    /** 黑龙江省-漠河 */
    HeiLongJiang_MoHe("HeiLongJiang_MoHe","","","漠河",Province.HeiLongJiang),
    /** 山西省-太原 */
    ShanXi_TaiYuan("ShanXi_TaiYuan","","","太原",Province.ShanXi),
    /** 山西省-大同 */
    ShanXi_DaTong("ShanXi_DaTong","","","大同",Province.ShanXi),
    /** 山西省-阳泉 */
    ShanXi_YangQuan("ShanXi_YangQuan","","","阳泉",Province.ShanXi),
    /** 山西省-长治 */
    ShanXi_ZhangZhi("ShanXi_ZhangZhi","","","长治",Province.ShanXi),
    /** 山西省-晋城 */
    ShanXi_JinCheng("ShanXi_JinCheng","","","晋城",Province.ShanXi),
    /** 山西省-朔州 */
    ShanXi_ShuoZhou("ShanXi_ShuoZhou","","","朔州",Province.ShanXi),
    /** 山西省-晋中 */
    ShanXi_JinZhong("ShanXi_JinZhong","","","晋中",Province.ShanXi),
    /** 山西省-运城 */
    ShanXi_YunCheng("ShanXi_YunCheng","","","运城",Province.ShanXi),
    /** 山西省-忻州 */
    ShanXi_XinZhou("ShanXi_XinZhou","","","忻州",Province.ShanXi),
    /** 山西省-临汾 */
    ShanXi_LinFen("ShanXi_LinFen","","","临汾",Province.ShanXi),
    /** 山西省-吕梁 */
    ShanXi_LvLiang("ShanXi_LvLiang","","","吕梁",Province.ShanXi),
    /** 山西省-古交 */
    ShanXi_GuJiao("ShanXi_GuJiao","","","古交",Province.ShanXi),
    /** 山西省-高平 */
    ShanXi_GaoPing("ShanXi_GaoPing","","","高平",Province.ShanXi),
    /** 山西省-介休 */
    ShanXi_JieXiu("ShanXi_JieXiu","","","介休",Province.ShanXi),
    /** 山西省-永济 */
    ShanXi_YongJi("ShanXi_YongJi","","","永济",Province.ShanXi),
    /** 山西省-河津 */
    ShanXi_HeJin("ShanXi_HeJin","","","河津",Province.ShanXi),
    /** 山西省-原平 */
    ShanXi_YuanPing("ShanXi_YuanPing","","","原平",Province.ShanXi),
    /** 山西省-侯马 */
    ShanXi_HouMa("ShanXi_HouMa","","","侯马",Province.ShanXi),
    /** 山西省-霍州 */
    ShanXi_HuoZhou("ShanXi_HuoZhou","","","霍州",Province.ShanXi),
    /** 山西省-孝义 */
    ShanXi_XiaoYi("ShanXi_XiaoYi","","","孝义",Province.ShanXi),
    /** 山西省-汾阳 */
    ShanXi_FenYang("ShanXi_FenYang","","","汾阳",Province.ShanXi),
    /** 山西省-怀仁 */
    ShanXi_HuaiRen("ShanXi_HuaiRen","","","怀仁",Province.ShanXi),
    /** 北京-北京 */
    BeiJing_BeiJing("BeiJing_BeiJing","","","北京",Province.BeiJing);



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
    private Province province;

    /**
     * 字段map
     */
    private static Map<String, City> map;

    City(String code, String weth2345Code, String wethCode, String name, Province province) {
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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public static City getCity(String name) {
        return map.get(name);
    }

    public static City getCityByName(String name) {
        for (City city : City.values()) {
            if (name.equals(city.getName())) {
                return city;
            }
        }
        return null;
    }

    private void initMap(String name, City city) {
        if (City.map == null) {
            City.map = new LinkedHashMap<String, City>();
        }
        City.map.put(name, city);
    }

    public static Map<String, City> getCityMap() {
        return map;
    }
}
