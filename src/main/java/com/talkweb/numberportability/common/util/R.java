package com.talkweb.numberportability.common.util;

import javafx.beans.binding.ObjectExpression;

import java.util.HashMap;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/1
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        put("code", "0");
        put("msg", "success");
        put("data", "");
    }

    public static R error() {
        return error("500", "未知异常，请联系管理员");
    }

    public static R error(String msg) {

        return error("500", msg);
    }

    public static R error(String code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public R data(Object map) {
        put("data", map);
        return this;
    }

    public static R ok() {
        return new R();
    }

    public String getCode() {
        Object obj = this.get("code");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public int getIntCode() {
        Object obj = this.get("code");
        if (obj != null) {
            return Integer.parseInt(obj.toString());
        }
        return -999;
    }

    public String getMsg() {
        Object obj = this.get("msg");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
