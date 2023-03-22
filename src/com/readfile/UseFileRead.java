package com.readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UseFileRead {
    public static void main(String[] args) {
        //路径
        String path = "D:\\outofdata\\1.txt";
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }
        FileReader fr = null;
        BufferedReader buffr = null;
        try{
            fr = new FileReader(file);
            buffr = new BufferedReader(fr);
            String readline;
            //按行读取
            while ((readline = buffr.readLine()) != null){
                System.out.println(readline);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //防止空指针问题
            if (buffr!=null){
                try {
                    buffr.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }

            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
