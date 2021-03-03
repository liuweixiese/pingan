package com.atpingan.collection;

import java.util.HashMap;

/**
 * @author shkstart
 * @create 2021-02-25 10:57
 */
public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        Sites.put(5,"liuwei");
//        System.out.println(Sites);
        for (Integer i :Sites.keySet()){
            System.out.println("key :" + i + "value" + Sites.get(i));
        }
    }
}
