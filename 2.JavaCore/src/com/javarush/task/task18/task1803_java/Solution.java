package com.javarush.task.task18.task1803_java;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        // [0, 0, 0 ... 0] -> [0, 2, 0, ... 3, 0]
        int[] byteCountArray = new int[255];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()] += 1;
            }
        }

        int maxCount = 0;

        for (int byteCount : byteCountArray) {
            if (byteCount > maxCount) maxCount = byteCount;
        }


        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == maxCount) resultList.add(i);
        }

        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}
