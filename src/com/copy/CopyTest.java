package com.copy;
class Mycopy{
    private String ad;
    private String ap;
    Mycopy(String ad,String ap){
        this.ad = ad;
        this.ap = ap;
    }
    Mycopy(Mycopy m){
        this.ad = m.ad;
        this.ap = m.ap;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }
}


public class CopyTest {
    public static void main(String[] args) {
        Mycopy m1 = new Mycopy("a","b");
        //浅拷贝
        Mycopy m2 = m1;
        //深拷贝
        Mycopy m3 = new Mycopy(m1);
        m1.setAd("test");
        m1.setAp("test2");
        System.out.println("m1:" + m1.getAd() + " " + m1.getAp());
        System.out.println("m2:" + m2.getAd() + " " + m2.getAp());
        System.out.println("m3:" + m3.getAd() + " " + m3.getAp());
    }
}
