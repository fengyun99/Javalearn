import java.util.*;

public class UseHashMap {
    public static void main(String[] args) {
        Map<Integer,String> id = new HashMap<>();
        id.put(1,"一只小飘飘");
        id.put(2,"饼王");
        //修改
        id.put(2,"周天帝");
        System.out.println(id);
        //Map->Set
        Set<Map.Entry<Integer,String>> entry= id.entrySet();
//for-each遍历
        for (Map.Entry<Integer,String>temp:entry) {
            System.out.println(temp.getKey()+"="+temp.getValue());
        }
        Map<Integer,ArrayList<String>> myinfo = new HashMap<>();

        myinfo.put(1,new ArrayList<>(Arrays.asList("弟弟","妹妹")));
        myinfo.put(2,new ArrayList<>(Arrays.asList("ass")));
        System.out.println(myinfo);
        System.out.println(myinfo.get(1));
        System.out.println("---------------------------");
        for (int i : myinfo.keySet()){
            System.out.println(i);
        }
        for (ArrayList<String> i : myinfo.values()){
            System.out.println(i);
        }
    }
}
