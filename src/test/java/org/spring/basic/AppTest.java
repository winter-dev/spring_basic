package org.spring.basic;

import java.util.Calendar;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */


    public static void main(String[] args) {
        // 创建一个Calendar对象
        Calendar calendar = Calendar.getInstance();

        // 设置时间为需要判断的时间
        calendar.setTime(new Date());

        // 判断是否为周日
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.println("today is sunday");
        } else {
            System.out.println("today is not sunday");
        }
    }
}