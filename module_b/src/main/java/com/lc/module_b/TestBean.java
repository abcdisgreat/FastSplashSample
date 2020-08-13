package com.lc.module_b;

import java.io.Serializable;

/**
 * @author：lc
 * @date：2020/8/13 0013
 * @desc：// TODO
 */
public class TestBean implements Serializable {
    private String id;
    private String text;

    public TestBean(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
