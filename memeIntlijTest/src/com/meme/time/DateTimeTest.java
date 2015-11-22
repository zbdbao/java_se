package com.meme.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by zhangb on 22/9/2015.
 */
public class DateTimeTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args){
        DateTimeTest test = new DateTimeTest();

        test.localDateTimeTest();

        test.localDateTest();
    }
    public void localDateTimeTest(){
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println(currentTime);


        System.out.println(currentTime.format(formatter));
    }

    public void localDateTest(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
