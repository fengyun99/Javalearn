import cn.hutool.core.util.NumberUtil;

public class UseHutool {
    public static void main(String[] args) {
        //加
        System.out.println(NumberUtil.add(1.1,1.24,1.4));
        //减
        System.out.println(NumberUtil.sub(3,1.45,1));
        //乘,保留小数位相加同理
        System.out.println(NumberUtil.mul(5,1.2,1.11));
        //除,最后一位写入保留小数位
        System.out.println(NumberUtil.div(2,3,2));
        //空和0
        System.out.println(NumberUtil.add(null,1,null,1.1));
        System.out.println(NumberUtil.mul(5,null,1.11));//null自动转为0
        System.out.println(NumberUtil.div(1.2,0));//为0抛出异常
    }
}
