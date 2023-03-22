package com.readfile;

import cn.hutool.core.io.file.FileReader;

import java.io.BufferedReader;
import java.io.IOException;

public class UseHutoolRead {
    public static void main(String[] args){
        String path = "D:\\outofdata\\1.txt";
        FileReader fileReader = new FileReader(path);
        BufferedReader buffr = fileReader.getReader();
        try {
            String line;
            while ((line = buffr.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileReader.readLines());//返回List
    }
}
