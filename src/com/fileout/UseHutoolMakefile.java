package com.fileout;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;

public class UseHutoolMakefile {
    public static void main(String[] args) {
        String path = "D:\\outofdata";
        String mk_dir = "\\test";
        String mk_txt = "\\test.txt";
        String dir = path + mk_dir;
        String txt = dir + mk_txt;
        FileUtil.mkParentDirs(path);
        FileUtil.mkdir(dir);
        FileUtil.touch(txt);
        for (File file : FileUtil.ls(path) ){
            System.out.println(file);
        }

    }
}
