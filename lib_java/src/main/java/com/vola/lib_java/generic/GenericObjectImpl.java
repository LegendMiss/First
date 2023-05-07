package com.vola.lib_java.generic;

/**
 * author: 唐鹏聪
 * date: 2023/5/7
 * description:
 *      泛型类实现泛型接口，无确定类型
 */
public class GenericObjectImpl<T> implements InterGeneric<T>  {

    @Override
    public T perform() {
        return null;
    }

    /**
     *      有确定类型
     */
    static class GenericImpl implements InterGeneric<String>{

        @Override
        public String perform() {
            return null;
        }
    }
}