package com.writefile;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String path = "D:\\outofdata\\1.txt";
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }
        FileWriter fw = null;
        BufferedWriter buffw = null;
        try {
            fw = new FileWriter(file,true);//true表示追加
            buffw = new BufferedWriter(fw);
            String newline = "123";
            buffw.write(newline);
            buffw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (buffw!=null){
                try {
                    buffw.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
