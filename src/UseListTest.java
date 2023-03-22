import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseListTest {
    public static void main(String[] args) {
        int[] num = new int[]{1,5,2,5,45,86,51,23};
        List<Integer> list_num = new ArrayList<>();
        for (int i : num){
            list_num.add(i);
        }
//        for (int nu : list_num){
//            System.out.println(nu);
//        }
        //继续添加数字
        List<Integer> new_num = new ArrayList<>(Arrays.asList(5555,2333,8989));
        list_num.add(727);
        //将一个新的列表加入到原来的列表中
        list_num.addAll(new_num);
        //查找数字
        Integer lastaddnum = list_num.get(list_num.size()-1);
        System.out.println(lastaddnum);
        //删除数字,删数字的值要转为Object对象才行
//        list_num.remove((Object) 727);
        int index = list_num.indexOf(727);
        list_num.remove(index);
        for (int nu : list_num){
            System.out.println(nu);
        }
    }
}
