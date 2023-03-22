public class TestEqualSign {
    public static void main(String[] args){
        //基本数据类型，基本数据类型雷友equals
        int a1 = 1;
        //声明相同的值会在栈中申请另外一块内存空间使用
        int a2 = 1;
        int a3 = 2;
        //值传递，栈中
        int a4 = a1;
        int a5 = a3;
        System.out.println(a1==a2);
        System.out.println(a1==a4);
        System.out.println(a1==a3);
        System.out.println(a1==a5);
        a4 = 2;
        //a1没有改变
        System.out.println(a1);
        System.out.println(a4);

        //对象使用
        Integer b1 = new Integer(1);
        Integer b2 = new Integer(1);
        Integer b3 = 1;
        //只是指向的地址相同，即是==判断为true，但是进行的是深拷贝，改变值会改变b4的指向，不会改变b1
        Integer b4 = b1;
        Integer b5 = 100;
        Integer b6 = 100;
        Integer b7 = 300;
        Integer b8 = 300;

        //判断引用对象
        System.out.print("b1==b2: ");
        System.out.println(b1==b2);
        //判断值是否一样，这里的equals重写了
        System.out.print("b1.equals(b2): ");
        System.out.println(b1.equals(b2));
        System.out.print("b1==b4: ");
        System.out.println(b1==b4);
        //直接赋值进行比较
        System.out.print("b1==b3: ");
        System.out.println(b1==b3);
        //自动解封装为int比较值的大小是否相等
        System.out.print("b1==a1: ");
        System.out.println(b1==a1);
        //b4指向了新的对象2.
        b4 = 2;
        System.out.println(b1);
        System.out.println(b4);
        //使用常量初始化结构比较,Integer范围内是true,范围外是false,-128~127
        System.out.print("b5==b6: ");
        System.out.println(b5==b6);
        System.out.print("b7==b8: ");
        System.out.println(b7==b8);
        System.out.print("b7.equals(b8): ");
        System.out.println(b7.equals(b8));

        //String类型判断
        String c1 = "123";
        String c2 = "123";
        String c3 = "456";
        String c4 = "1234";
        String c5 = "56";
        String c6 = c1;

        String c7 = c1 + c3;
        String c8 = c5 + c4;
        String t1 = c1.trim() + c3.trim();
        String t2 = c4.trim() + c5.trim();
        System.out.println(t1==t2);//false
        System.out.println("t1.equals(t2) " + t1.equals(t2));


        String c9 = new String("123");
        String c10 = new String("123");
        String c11 = "123" + "456";
        String c12 = "1234" + "56";
        //比较的是地址
        System.out.println("c1==c2 " + (c1==c2));
        System.out.println("c1.equals(c2) " + c1.equals(c2));
        System.out.println("c1==c6 " + (c1==c6));
        //拼接后比较,使用+会创建新的对象虽然值相同但是对象不同。
        System.out.println("c7==c8 " + (c7==c8));
        //拼接的值相同但是报false
        System.out.println("c7.equals(c8) " + c7.equals(c8));
        //new对象和直接赋值引用不同
        System.out.println("c1==c9 " + (c1==c9));
        //比较值
        System.out.println("c1.equals(c9) " + c1.equals(c9));
        //new两个对象引用不同
        System.out.println("c9==c10 " + (c9==c10));
        //比较值
        System.out.println("c9.equals(c10) " + c9.equals(c10));
        //间接拼接的对象和直接拼接的对象，不是同一块地址
        System.out.println("c7==c11 " + (c7==c11));
        //比较值
        System.out.println("c7.equals(c11) " + c7.equals(c11));
        //直接拼接两种方式同一块地址
        System.out.println("c11==c12 " + (c11==c12));
        //比较值
        System.out.println("c11.equals(c12) " + c11.equals(c12));

    }
}
