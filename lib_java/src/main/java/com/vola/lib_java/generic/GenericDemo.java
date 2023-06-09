package com.vola.lib_java.generic;

import java.util.List;

/**
 * author: 唐鹏聪
 * date: 2023/5/7
 * description:
 */
public class GenericDemo {

    public static void main(String[] args) {

        //  泛型类使用
        GenericObject<String> genericObject = new GenericObject<>("test");
        //  泛型接口
        GenericObjectImpl<String> genericObject1 = new GenericObjectImpl<>();
        GenericObjectImpl.GenericImpl generic = new GenericObjectImpl.GenericImpl();

        List<String> list1 = null;
        List<Integer> list2 = null;
        perform(list1);
        perform(list2);
    }

    /**
     *
     *  泛型方法    <T> 的位置可以随意
     * @param list
     * @param <T>  泛型类型
     */
    private static <T> void perform(List<T> list) {

    }

    /**
     *      多个泛型参数
     */
    private static <T, K> void show(List<T> list) {

    }

} 