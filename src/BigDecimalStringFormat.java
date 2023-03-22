import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

class NullTest{

}

public class BigDecimalStringFormat {
    public static void main(String[] args) {

        MathContext mathContext = new MathContext(2);
        java.lang.String m1 = "13.59831";
        ArrayList<String> fg = new ArrayList<>(Arrays.asList(m1.split("\\.")));
        String xiaoshu = "0." + fg.get(1);
        BigDecimal xiaoshum = new BigDecimal(xiaoshu,mathContext);
        BigDecimal m_money1 = BigDecimal.valueOf(Long.parseLong(fg.get(0))).add(xiaoshum);
        System.out.println(m_money1);
        BigDecimal money1 = new BigDecimal(m1,mathContext);
        System.out.println(money1);
        double num = 111231.5585;
        BigDecimal b = new BigDecimal(num);
        System.out.println(b);
        //保留2位小数
        double result = b.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(result);  //111231.56

        BigDecimal c = BigDecimal.valueOf(num);
        BigDecimal out = c.setScale(2,RoundingMode.HALF_UP);
        System.out.println(out);
        double num_m = 1232141241514.4563;
        BigDecimal money = BigDecimal.valueOf(num_m);
        //格式化输出
        NumberFormat curreny = NumberFormat.getCurrencyInstance();
        System.out.println(curreny.format(money));

        //和字符串相互转换
        //String转BigDecimal
        String str = "1000.567";
        BigDecimal b1;
        try{
             b1 = new BigDecimal(str);
            System.out.println(b1.getClass().getName());
        } catch (NullPointerException ne){
            System.out.println("字符串不能为空");
        }
        //BigDecimal装String
        BigDecimal b2 = null;
        String str_s = String.valueOf(b2);
        //null不能用toString
        //String str_s1 = b2.toString();

        System.out.println(str_s);
        //System.out.println(str_s1.getClass().getName());

        //数字格式化
        double num_k = 14151321.146;
        //用#和0占位，0表示位数不足用0填充,1位，#表示把数字放这个位置上，多位
        String format = NumberUtil.decimalFormat("￥,###.##",num_k);
        System.out.println(format);
        //数字转换为字符串
        String s_num = NumberUtil.toStr(num);
        System.out.println(s_num.getClass().getName());
        Integer testi = null;
        if (null==testi){
            //System.out.println("testi为空");
            throw new NullPointerException("testi为空");
        }
    }
}
