package com.baron.springboot.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 日期工具类型
 * @author yangxuanhua
 * @since v1.0
 */
public class DateUtils {
    /** 年*/
    public static final String YEAR = "yy";
    /** 月*/
    public static final String MONTH = "MM";
    /** 日*/
    public static final String DAY_OF_MONTH = "dd";
    /** 时*/
    public static final String HOUR = "hh";
    /** 分*/
    public static final String MINUTE = "mm";
    /** 秒*/
    public static final String SECOND = "ss";

    /**
     * 格式化指定日期，返回字符串
     * @param date 指定日期
     * @param pattern  格式
     * @return 返回格式化后的字符串
     */
    public static String format(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    /**
     * Date转换成LocalDate
     * @param date Date
     * @return LocalDate
     */
    public static LocalDate dateToLocalDate(Date date) {
        if(null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * LocalDate转换成Date
     * @param localDate LocalDate
     * @return Date
     */
    public static Date localDateToDate(LocalDate localDate) {
        if(null == localDate) {
            return null;
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * LocalDateTime转换成Date
     * @param localDateTime LocalDateTime
     * @return Date
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * @Title: getMonthDates
     * @Description: 获取整个月的日期（天）
     * @return: List<String>
     */
    public static List<String> getMonthDates(Date date) {
        List<String> dateList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        // int month = aCalendar.get(Calendar.MONTH) + 1;// 月份
        int days = calendar.getActualMaximum(Calendar.DATE);
        // String monthS = "";
        String dateS;
        for (int i = 1; i <= days; i++) {
            // monthS = month < 10 ? "0" + String.valueOf(month) : String.valueOf(month);
            dateS = i < 10 ? "0" + i : String.valueOf(i);
            // String aDate = monthS + "-" + dateS;
            String aDate = dateS;
            dateList.add(aDate);
        }
        return dateList;
    }

    /**
     * @Title: getMonthFirstDate
     * @Description 获取当前月份的第一天
     * @return: String
     */
    public static String getMonthFirstDay() {
        String y = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMM"));
        String dateStr = y + "01";
        return dateStr;
    }

    /**
     * @Title: getMonthLastDay
     * @Description 获取当前月份的最后一天
     * @return: String
     */
    public static String getMonthLastDay(String pattern) {
        String y = LocalDateTime.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyyMM"));
        String lastMonth = y + "01";
        LocalDate localDate = LocalDate.parse(lastMonth, DateTimeFormatter.BASIC_ISO_DATE);
        return localDate.minusDays(1).format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * @Title: getMinusMonthFirstDate
     * @Description 获取上个月份的第一天
     * @return: String
     */
    public static String getMinusMonthFirstDate(String pattern) {
        LocalDate time = LocalDate.now().minusMonths(1);
        return LocalDate.of(time.getYear(),time.getDayOfMonth(),01).format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * @Title: getMinusMonthLastDate
     * @Description 获取上个月份的最后一天
     * @return: String
     */
    public static String getMinusMonthLastDate(String pattern) {
        String y = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMM"));
        String lastMonth = y + "01";
        LocalDate localDate = LocalDate.parse(lastMonth, DateTimeFormatter.BASIC_ISO_DATE);
        return localDate.minusDays(1).format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * @Title: getPlusMonthFirstDate
     * @Description 获取下个月份的第一天
     * @return: String
     */
    public static String getPlusMonthFirstDate() {
        String y = LocalDateTime.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyyMM"));
        String dateStr = y + "01";
        return dateStr;
    }
    /**
     * @Title: getPlusMonthLastDate
     * @Description 获取下个月份的最后一天
     * @return: String
     */
    public static String getPlusMonthLastDate(String pattern) {
        String y = LocalDateTime.now().plusMonths(2).format(DateTimeFormatter.ofPattern("yyyyMM"));
        String lastMonth = y + "01";
        LocalDate localDate = LocalDate.parse(lastMonth, DateTimeFormatter.BASIC_ISO_DATE);
        return localDate.minusDays(1).format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 格式化当前时间
     *
     * @param pattern - ""
     * @return the formatted date-time string
     * @see java.text.SimpleDateFormat
     */
    public static String formatDateTime(String pattern) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }

    /**
     * 跳动日期
     *
     * @param d  Date
     * @param skipDay 可为负数
     * @return 返回日期
     */
    public static Date skipDateTime(Date d, int skipDay) {
        if (d == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.DATE, skipDay);
        return calendar.getTime();
    }

    /**
     * 跳动小时
     *
     * @param d  Date
     * @param skipHour 可为负数
     * @return 返回日期
     */
    public static Date skipHourTime(Date d, int skipHour) {
        if (d == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR_OF_DAY, skipHour);
        return calendar.getTime();
    }

    public static java.util.Date parse(String pattern, String strDateTime) {
        java.util.Date date = null;
        if (strDateTime == null || pattern == null) {
            return null;
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            formatter.setLenient(false);
            date = formatter.parse(strDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 根据类型来跳动当前时间
     *
     * @param type  yy MM dd hh mm ss
     * @param i 类型
     * @return String
     */
    public static String dateStrAdd(String type, int i) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = formatDateTime("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        switch (type) {
            case SECOND:
                int s = c.get(Calendar.SECOND);
                s = s + i;
                c.set(Calendar.SECOND, s);
                str = df.format(c.getTime());
                break;
            case MINUTE: {
                int d = c.get(Calendar.MINUTE);
                d = d + i;
                c.set(Calendar.MINUTE, d);
                str = df.format(c.getTime());
                break;
            }
            case HOUR: {
                int d = c.get(Calendar.HOUR);
                d = d + i;
                c.set(Calendar.HOUR, d);
                str = df.format(c.getTime());
                break;
            }
            case DAY_OF_MONTH: {
                int d = c.get(Calendar.DAY_OF_MONTH);
                d = d + i;
                c.set(Calendar.DAY_OF_MONTH, d);
                str = df.format(c.getTime());
                break;
            }
            case MONTH: {
                int d = c.get(Calendar.MONTH);
                d = d + i;
                c.set(Calendar.MONTH, d);
                str = df.format(c.getTime());
                break;
            }
            case YEAR: {
                int d = c.get(Calendar.YEAR);
                d = d + i;
                c.set(Calendar.YEAR, d);
                str = df.format(c.getTime());
                break;
            }
        }
        return str;
    }

    /**
     *
     * 计算两个时间间隔的天数
     * @param oneDate 第一个日期
     * @param twoDate 第二个日期
     * @author wwei
     */
    public static int getSkipDate(Date oneDate,Date twoDate) {
        int skipDate = 0;
        long oneTime = oneDate.getTime();
        long twoTime = twoDate.getTime();
        long  skipTime = twoTime - oneTime;
        if(skipTime< (24*3600*1000) &&  skipTime>0 ) {
            //表明间隔的时间不足1天
            return  1;
        }else if(skipTime<0){
            return  skipDate;
        }else {
            if (skipTime % (24*3600*1000) == 0) {
                skipDate = (int)(skipTime / (24*3600*1000));
            } else {
                skipDate = (int)(skipTime / (24*3600*1000)) + 1;
            }
        }
        return  skipDate;
    }

}
