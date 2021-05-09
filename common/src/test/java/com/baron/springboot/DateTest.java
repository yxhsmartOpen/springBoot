package com.baron.springboot;

import com.baron.springboot.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * @author yangxuanhua
 * @since v1.0
 */
@Slf4j
public class DateTest {

    @Test
    public void testDateFormat(){
        log.info(DateUtils.format(new Date(),"yyyy年"));
        DateUtils.format(new Date(),"yyyy年MM月");
        DateUtils.format(new Date(),"yyyy年MM月dd日");
        DateUtils.format(new Date(),"yyyy年MM月dd日 HH时");
        DateUtils.format(new Date(),"yyyy年MM月dd日 HH时mm分");
        DateUtils.format(new Date(),"yyyy年MM月dd日 HH时mm分ss秒");
        DateUtils.format(new Date(),"yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        log.info(DateUtils.format(new Date(),"yyyyMMdd"));
        DateUtils.format(new Date(),"yyyy");
        DateUtils.format(new Date(),"yyyy-MM");
        DateUtils.format(new Date(),"yyyy-MM-dd");
        DateUtils.format(new Date(),"yyyy-MM-dd HH");
        DateUtils.format(new Date(),"yyyy-MM-dd HH:mm");
        DateUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        DateUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss SSS");

        DateUtils.getSkipDate(new Date(),new Date());
        DateUtils.dateStrAdd("SECOND",1);
        DateUtils.parse("yyyyMMdd","20200405");
        DateUtils.skipHourTime(new Date(),1);
        DateUtils.skipDateTime(new Date(),1);
        DateUtils.getMonthDates(new Date());
    }

    @Test
    public void testJava8Date(){
        log.info(DateUtils.patternLocalDateTime("yyyy年"));
        DateUtils.patternLocalDateTime("yyyy年MM月");
        DateUtils.patternLocalDateTime("yyyy年MM月dd日");
        DateUtils.patternLocalDateTime("yyyy年MM月dd日 HH时");
        DateUtils.patternLocalDateTime("yyyy年MM月dd日 HH时mm分");
        DateUtils.patternLocalDateTime("yyyy年MM月dd日 HH时mm分ss秒");
        DateUtils.patternLocalDateTime("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        DateUtils.patternLocalDateTime("yyyyMMdd");
        DateUtils.patternLocalDateTime("yyyy");
        DateUtils.patternLocalDateTime("yyyy-MM");
        DateUtils.patternLocalDateTime("yyyy-MM-dd");
        DateUtils.patternLocalDateTime("yyyy-MM-dd HH");
        DateUtils.patternLocalDateTime("yyyy-MM-dd HH:mm");
        DateUtils.patternLocalDateTime("yyyy-MM-dd HH:mm:ss");
        log.info(DateUtils.patternLocalDateTime("yyyy-MM-dd HH:mm:ss SSS"));

        log.info(LocalDateTime.now().plusYears(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒")));
        LocalDateTime.now().plusMonths(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusWeeks(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusHours(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusMinutes(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusNanos(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusSeconds(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().plusNanos(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));

        log.info(LocalDateTime.now().minusYears(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒")));
        LocalDateTime.now().minusMonths(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusWeeks(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusHours(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusMinutes(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusNanos(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusSeconds(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        LocalDateTime.now().minusNanos(1).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));

        log.info(DateUtils.getMonthFirstDay());
        DateUtils.getMonthLastDay("yyyy年MM月dd日");
        DateUtils.getPlusMonthFirstDate();
        DateUtils.getPlusMonthLastDate("yyyy年MM月dd日");
        DateUtils.getMinusMonthFirstDate("yyyy年MM月dd日");
        DateUtils.getMinusMonthLastDate("yyyy年MM月dd日");

        log.info(LocalDateTime.of(2021,5,1,0,15,55).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒")));
        log.info(LocalDateTime.of(2021,5,1,0,15).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分")));


        LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"));
        LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        log.info(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        log.info(LocalTime.now().format(DateTimeFormatter.ofPattern("HH时")));
        LocalTime.now().format(DateTimeFormatter.ofPattern("HH时mm分"));
        LocalTime.now().format(DateTimeFormatter.ofPattern("HH时mm分ss秒"));
        LocalTime.now().format(DateTimeFormatter.ofPattern("HH时mm分ss秒 SSS毫秒"));

        DateUtils.localDateTimeToDate(LocalDateTime.now());
        DateUtils.localDateToDate(LocalDate.now());
        DateUtils.dateToLocalDate(new Date());

    }
}
