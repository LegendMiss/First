package com.vola.lib_java.generic;

/**
 * author: 唐鹏聪
 * date: 2023/5/7
 * description:
 *      泛型类
 */
public class GenericObject<T> {

    private T data;

    public GenericObject(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

} 