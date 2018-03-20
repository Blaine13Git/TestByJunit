package com.windsing01;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.text.SimpleDateFormat;
import java.util.*;

public class CodeTEst {

    public static void ageIsMeet(String ageLimit) {
        String[] ageArray = ageLimit.split("-");
        int minAge = Integer.parseInt(ageArray[0]);
        int maxAge = Integer.parseInt(ageArray[1]);
//        String minAge = ageArray[0];
//        String maxAge = ageArray[1];
        System.out.println(minAge);
        System.out.println(maxAge);
    }


    public static void testSwitch(int a) {
        switch (a) {
            case 1:
            case 2:
                System.out.println("2:" + a);
                break;
            case 3:
                System.out.println("3:" + a);
        }

    }

    public static void testLongValue() {
        Integer a = -1;
        Long b = -1L;
        if (Objects.equals(a.longValue(), b)) {
            System.out.println(">>>:) OK");
        }
    }

    public static String testMoneyLimit() {
        List<String> list1 = new ArrayList<>();
        System.out.println(">>>:" + list1.size());
        String abc = "abc";
        if (list1 == null || list1.isEmpty()) {
            return abc;
        }
        abc = "123";
        return abc;

    }


    public static void test_three() {
        boolean isAdd = true;
        Long a = isAdd ? 1L : -1L;
        System.out.println(">>>" + a);
    }

    public static void test_calender_set() {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.setTime(new Date());
        int i = calendarInstance.get(5);

        calendarInstance.set(5, calendarInstance.get(5));
        System.out.println(">>>:" + i);
        Date time = calendarInstance.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = dateFormat.format(time);
        System.out.println(format);
        //设置每月的最大天数  5
        calendarInstance.set(Calendar.DAY_OF_MONTH, calendarInstance.getActualMaximum(Calendar.DAY_OF_MONTH));
        //设置每天的最大小时  11
//        calendarInstance.set(Calendar.HOUR_OF_DAY, calendarInstance.getActualMaximum(Calendar.HOUR_OF_DAY));
        //设置每小时最大分钟  12
//        calendarInstance.set(Calendar.MINUTE, calendarInstance.getActualMaximum(Calendar.MINUTE));
        //设置每分钟最大秒  13
//        calendarInstance.set(Calendar.SECOND, calendarInstance.getActualMaximum(Calendar.SECOND));

    }

    public static void test_endWith() {
        String destPath = "/";
        if (destPath.endsWith("/")) {
            destPath = destPath.substring(0, destPath.length() - 1);
        }
        System.out.println(">>> " + destPath);

    }

    public static void toJson(){
        List<HashMap<String,String>> data = new ArrayList<>();
        HashMap<String,String> mapData = new HashMap<>();
        mapData.put("orderNo","201802081425063562");
        mapData.put("bankCardNo","9555501001162527763");
        data.add(mapData);
        System.out.println(data);

        Gson gson = new Gson();
        String s = gson.toJson(data);
        System.out.println(s);

    }

    public static void main(String[] args) {
//        ageIsMeet("-100");
//        testSwitch(1);
//        testLongValue();
//        String s = testMoneyLimit();
//        System.out.println(s);
//        test_three();
//        test_calender_set();
//        test_endWith();
        toJson();
    }

}
