import java.util.*;

public class ArrayListSet {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,3,4,2,2));

        Set<Integer> set1 = new HashSet<>(list1);
        set1.add(11);
        //重复
        set1.add(1);
        //有没有元素
        boolean outs = set1.contains(1);
        System.out.println(set1);

        System.out.println(outs);
    }
}
