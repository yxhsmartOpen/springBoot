package cn.baron.weather.weatherdatacollect.weather.enums;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 南方五省全局天气枚举工具类
 * 
 * @author Baron
 * @date  2017-3-25
 */
public enum CsgProvince {

	/** 广东省 */
	GuangDong("GUANGDONG", "广东省", City.GuangDongCity),
	/** 海南省 */
	HaiNan("HAINAN", "海南省", City.HaiNanCity),
	/** 广西壮族自治区 */
	GuangXi("GUANGXI", "广西壮族自治区", City.GuangXiCity),
	/** 贵州省 */
	GuiZhou("GUIZHOU", "贵州省", City.GuiZhouCity),
	/** 云南省 */
	YunNan("YUNNAN", "云南省", City.YunNanCity),
	/** 广州 */
	GuangZhou("GUANGZHOU", "广州", City.GuangZhouCity),
	/** 深圳 */
	ShenZhen("SHENZHEN", "深圳", City.ShenZhenCity);

	/** 省拼音 */
	private String code;
	/** 中文名称 */
	private String name;
	/** 城市 */
	private List<String> city;

	/** 字段map */
	private static Map<String, CsgProvince> map;

	private CsgProvince(String code, String name, List<String> city) {
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

	public static CsgProvince getProvince(String name) {
		return map.get(name);
	}

	private void initMap(String name, CsgProvince province) {
		if (CsgProvince.map == null) {
			CsgProvince.map = new LinkedHashMap<String, CsgProvince>();
		}
		CsgProvince.map.put(name, province);
	}

	public static Map<String, CsgProvince> getProvinceMap() {
		return map;
	}

	public static class City {
		public static List<String> GuangZhouCity = Arrays.asList("广州");
		public static List<String> ShenZhenCity = Arrays.asList("深圳");
		public static List<String> GuangDongCity = Arrays.asList("", "东莞", "潮州", "佛山", "河源", "惠州", "江门", "揭阳", "梅州", "茂名", "清远", "韶关", "汕尾", "汕头", "云浮", "阳江", "珠海", "中山", "肇庆",
				"湛江");
		public static List<String> HaiNanCity = Arrays
				.asList("", "海口", "三亚", "儋州", "琼海", "文昌", "万宁", "澄迈", "定安", "屯昌", "陵水", "临高", "昌江", "东方", "五指山", "保亭", "乐东", "琼中", "白沙", "三沙");
		public static List<String> GuangXiCity = Arrays.asList("", "南宁", "柳州", "桂林", "玉林", "河池", "钦州", "防城港", "梧州", "北海", "贵港", "崇左", "来宾", "百色", "贺州");
		public static List<String> GuiZhouCity = Arrays.asList("", "安顺", "毕节", "都匀", "贵阳", "凯里", "六盘水", "铜仁", "兴义", "遵义");
		public static List<String> YunNanCity = Arrays.asList("", "昆明", "曲靖", "玉溪", "保山", "昭通", "丽江", "临沧", "楚雄", "红河", "文山", "西双版纳", "大理", "德宏", "怒江", "迪庆", "瑞丽");
	}
}
