package com.javarush.task.task29.task2906;

/* 
Особенности автобоксинга - 2
https://habr.com/ru/post/201334/
*/

public class Solution {
    public static void main(String[] args) {
        Integer a = getValue(Boolean.TRUE, Boolean.TRUE);   //100 expected
        Integer b = getValue(Boolean.FALSE, Boolean.TRUE);  //200 expected
        Integer c = getValue(Boolean.FALSE, Boolean.FALSE); //null expected

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static Integer getValue(boolean first, boolean second) {
//        return first ? 100 : second ? 200 : null;

//        if (first) return 100;
//        if (second) return 200;
//        return null;

        return first ? Integer.valueOf(100) : second ? 200 : null;
    }
}
