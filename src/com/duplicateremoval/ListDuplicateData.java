package com.duplicateremoval;

import java.util.*;


public class ListDuplicateData {

    /**
     * 删除List中重复元素，并保持顺序
     * @param list 待去重的list
     * @return 去重后的list
     */
    public static <T> List<T> removeDuplicateKeepOrder(List<T> list){
        Set set = new HashSet();
        List<T> newList = new ArrayList<>();
        for (T element : list) {
            //set能添加进去就代表不是重复的元素
            if (set.add(element)) newList.add(element);
        }
        list.clear();
        list.addAll(newList);
        return list;
    }



    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<>(Arrays.asList(1,2,3,7,1,6,7,2,3,1));
        System.out.println(removeDuplicateKeepOrder(int_list));
    }
}
