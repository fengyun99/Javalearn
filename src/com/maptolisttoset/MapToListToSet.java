package com.maptolisttoset;

import java.util.*;

public class MapToListToSet {

    public static <T> List<T> mapToList(Map<T,T> map){
        if(map == null){
            return Collections.emptyList();
        }
        Collection<T> valueCollection = map.values();
        List<T> valueList = new ArrayList<>(valueCollection);
        return valueList;
    }

    public static <T> Set<T> mapToSet(Map<T,T> map){
        if(map == null){
            return  Collections.emptySet();
        }
        Collection<T> valueCollection = map.values();
        Set<T> valueSet = new HashSet<>(valueCollection);
        return valueSet;
    }

    public static <T> Map<Integer,T> listToMap(List<T> list){
        Map<Integer,T> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            map.put(i + 1,list.get(i));
        }
        return map;
    }

    public static <T> Map<Integer,T> setToMap(Set<T> set){
        Map<Integer,T> map = new HashMap<>();
        int i = 0;
        for (T s : set){
            map.put(i+1,s);
            i++;
        }
        return map;
    }

    public static <T> List<T> setToList(Set<T> set){
        return new ArrayList<>(set);
    }

    public static <T> Set<T> listToSet(List<T> list){
        return new HashSet<>(list);
    }




    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","a");
        map1.put("2","b");
        map1.put("3","c");
        map1.put("4","d");
        System.out.println(mapToList(map1));

        List<String> list1 = new ArrayList<>(Arrays.asList("x","y","z"));
        System.out.println(listToMap(list1));

        Set<String> set1 = new HashSet<>(list1);
        System.out.println(setToMap(set1));
//        //数字转为Object
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,7,5));
//        System.out.println(list2.indexOf(5));
//        System.out.println(list2.contains(5));
//        System.out.println(map1.containsKey("1"));
//        int h = map1.hashCode();
//        System.out.println(h);
//        System.out.println(Integer.toBinaryString(h));
//        System.out.println(h>>>16);
//        System.out.println(Integer.parseInt("101000000",2));
//        //<<（左移）、>>（带符号右移）和>>>（无符号右移）
//        System.out.println(h^(h>>>16));//^异或运算两边二进制，异为1，同为0----
//        System.out.println(map1.containsValue());


    }
}
