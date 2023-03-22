import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num118_Yanghui {
    public List<List<Integer>> generate(int numRows){//返回值是List嵌套List，实际上就是一个二维数组
        //最后的二维数组
        List<List<Integer>> ret=new ArrayList<>();
        //先写特殊的前两行--都是1
        List<Integer> fir=Arrays.asList(1);
        /**Arrays.asList是一个可变参数列表
         * （）中放可变参数，里面有几个元素就放几个元素
         * 就不用new ArrayList了
         */
        ret.add(fir);//第一行加进去
        if(numRows==1){//判断是否只有一行
            return ret;//返回这个二维数组
        }
        /**
         * 第二行
         */
        List<Integer> sec =Arrays.asList(1,1);
        ret.add(sec);
        if(numRows==2){
            return ret;
        }
        /**
         * 此时numRows至少为三行
         * i为行数，遍历行数，<=numRows，要取到numRows行
         * j列
         * [i,j]=[i-1,j-1]+[i-1,j]
         */
        for (int i = 3; i <= numRows; i++) {
            //先取得前一行（i-1行）所有元素
            List<Integer> prev= ret.get(i-1-1);//i-1是前一行行号，再-1是取得了前一行索引
            List<Integer> cur=new ArrayList<>();//当前行
            //每一行第一列都是1
            cur.add(1);//先添加上1
            //从第二列开始到i-1列，即到倒数第二个元素
            for (int j = 2; j < i; j++) {//j从第二列开始（注意，这里的i,j不是索引，是行列数），why不取等于->因为最后一列也是1，直接在最后添加就行，不在遍历范围
                int tmpValue=prev.get(j-1-1)+prev.get(j-1);//i-1行的j-1列+i行j列（get括号中再减一是取得索引）
                cur.add(tmpValue);//循环依次添加tmpValue到第i行
            }
            //每一行最后一个元素也是1
            cur.add(1);
            ret.add(cur);//cur是行,每行循环完，把这行加到二维数组ret中
        }
        return ret;
    }

    public static void main(String[] args) {
        Num118_Yanghui n = new Num118_Yanghui();
        String out = n.generate(10).toString();
        System.out.println(out);
    }
}
