import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class UseBigDecimal {
    public static void main(String[] args) {
        //两种创建方式
//        BigDecimal a = new BigDecimal("1.1");
//        BigDecimal b = BigDecimal.valueOf(10);
//        BigDecimal c = BigDecimal.valueOf(1.245);
        //设置精度为4，也就是4位有效数字
//        MathContext mathContext = new MathContext(4);
//        BigDecimal d = new BigDecimal(12345, mathContext);//1.235乘于10的四次方
//        System.out.println(d);
        //直接向对象传值会有严重的精度问题，传入时就不是0.1精度的值
//        System.out.println(new BigDecimal(0.1));
//        System.out.println(new BigDecimal("0.1"));
//        System.out.println(new BigDecimal(1.245));
//        System.out.println(c);
        //加
//        BigDecimal a1 = BigDecimal.valueOf(1.236);
//        BigDecimal a2 = BigDecimal.valueOf(2.117);
//        MathContext mathContext = new MathContext(3);
//        BigDecimal out1 = a1.add(a2);
//        BigDecimal out2 = a1.add(a2,mathContext);
//        System.out.println(out1);
//        System.out.println(out2);
//        //减
//        BigDecimal b1 = BigDecimal.valueOf(5.6);
//        BigDecimal b2 = BigDecimal.valueOf(3.12414);
//        BigDecimal out3 = a1.subtract(a2);
//        System.out.println(out3);
//        BigDecimal outb = b1.subtract(b2);
//        //保留小数最对的位
//        System.out.println(outb);
//        //乘
//        BigDecimal c1 = BigDecimal.valueOf(1.5);
//        BigDecimal c2 = BigDecimal.valueOf(3.143);
//        BigDecimal outc = c1.multiply(c2);
//        //保留各自小数位相加即1+3保留4位
//        System.out.println(outc);
//        //除法最难
//
//        BigDecimal numA = new BigDecimal("1");
//        BigDecimal numB = new BigDecimal("-1");
//        BigDecimal numC = new BigDecimal("3");
//        // 保留两位小数，舍入模式为UP
//        System.out.println("1/3保留两位小数（UP） = " + numA.divide(numC, 2, RoundingMode.UP));
//        System.out.println("-1/3保留两位小数（UP） = " + numB.divide(numC, 2, RoundingMode.UP));
//        // 保留两位小数，舍入模式为DOWN
//        System.out.println("1/3保留两位小数（DOWN） = " + numA.divide(numC, 2, RoundingMode.DOWN));
//        System.out.println("-1/3保留两位小数（DOWN） = " + numB.divide(numC, 2, RoundingMode.DOWN));
//        // 保留两位小数，舍入模式为CEILING
//        System.out.println("1/3保留两位小数（CEILING） = " + numA.divide(numC, 2, RoundingMode.CEILING));
//        System.out.println("-1/3保留两位小数（CEILING） = " + numB.divide(numC, 2, RoundingMode.CEILING));
//        // 保留两位小数，舍入模式为FLOOR
//        System.out.println("1/3保留两位小数（FLOOR） = " + numA.divide(numC, 2, RoundingMode.FLOOR));
//        System.out.println("-1/3保留两位小数（FLOOR） = " + numB.divide(numC, 2, RoundingMode.FLOOR));
//
//        BigDecimal numD = new BigDecimal("1");
//        BigDecimal numE = new BigDecimal("-1");
//        BigDecimal numF = new BigDecimal("8");
//        // 保留两位小数，舍入模式为HALF_UP
//        System.out.println("1/8(=0.125)保留两位小数（HALF_UP） = " + numD.divide(numF, 2, RoundingMode.HALF_UP));
//        System.out.println("-1/8(=0.125)保留两位小数（HALF_UP） = " + numE.divide(numF, 2, RoundingMode.HALF_UP));
//        // 保留两位小数，舍入模式为HALF_DOWN
//        System.out.println("1/8(=0.125)保留两位小数（HALF_DOWN） = " + numD.divide(numF, 2, RoundingMode.HALF_DOWN));
//        System.out.println("-1/8(=0.125)保留两位小数（HALF_DOWN） = " + numE.divide(numF, 2, RoundingMode.HALF_DOWN));
//
//        // 保留两位小数，舍入模式为HALF_EVEN
//        System.out.println("0.54/4(=0.135)保留两位小数（HALF_EVEN） = " + new BigDecimal("0.54").divide(new BigDecimal("4"), 2, RoundingMode.HALF_EVEN));
//        System.out.println("1/8(=0.125)保留两位小数（HALF_EVEN） = " + numE.divide(numF, 2, RoundingMode.HALF_EVEN));
//
//        //UNNECESSARY,会报异常
//        //System.out.println("1/8(=0.125) = " + numE.divide(numF,  RoundingMode.UNNECESSARY));
//        BigDecimal d1 = BigDecimal.valueOf(-3.14);
//        System.out.println(d1.abs());

        //空和0
        BigDecimal t_n = null;
        BigDecimal t_1 = BigDecimal.valueOf(1.1);
        if (t_1==null || t_n==null){
            System.out.println("值不能为空");
        }else{
            System.out.println(t_1.add(t_n));
        }

        BigDecimal t_div = BigDecimal.valueOf(0);
        if (t_div.intValue()==0){
            System.out.println("除数不能为0");
        }else{
            System.out.println(t_1.divide(t_div,2,RoundingMode.HALF_UP));
        }
    }
}
