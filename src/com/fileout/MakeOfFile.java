package com.fileout;

import java.io.File;
import java.io.IOException;

class MakeFileAndText {
    public MakeFileAndText(){}
    public MakeFileAndText(String filepath, String newfilename, String newtextname){

        filePathExist(filepath);

        File newDir = new File(filepath, newfilename); // 创建新目录File对象

        if(!newDir.exists()){ // 判断新目录是否存在，若不存在则创建
            newDir.mkdir();
        }

        File newFile = new File(newDir, newtextname); // 创建新文件File对象

        try{
            if(!newFile.exists()){ // 判断新文件是否存在，若不存在则创建
                newFile.createNewFile();
                System.out.println("创建文件成功！");
            }
        }catch(IOException e){
            System.out.println("创建文件失败！");
            e.printStackTrace();
        }
    }

    public void filePathExist(String filepath){
        File file = new File(filepath);
        //判断目录是否存在
        if(!file.exists()){ // 判断父目录是否存在，若不存在则创建
            System.out.println("父目录不存在");
            try {
                System.out.println("创建父目录...");
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void allFilename(String path){
        File dir = new File(path);
        if(dir.exists() && dir.isDirectory()){ // 判断目录是否存在且是目录
            String[] files = dir.list(); // 获取目录下所有文件名称
            for(String file : files){
                System.out.println(file); // 打印文件名称
            }
        }else{
            System.out.println("目录不存在或不是目录！");
        }
    }
}


public class MakeOfFile {
    public static void main(String[] args) {
        String parent_path = "D:\\outofdata";
        String mk_dir = "test";
        String mk_txt = "test.txt";
        MakeFileAndText makefileandtxt = new MakeFileAndText(parent_path,mk_dir,mk_txt);
        makefileandtxt.allFilename(parent_path);

    }
}
