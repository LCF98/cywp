package com.cywp.soft.bean;

import java.math.BigDecimal;

public class Menu {
    private int menuId;
    private int nameId;
    private int pId;
    private String url;
    private String name;

    public Menu() {
    }

    public Menu(int menuId, int nameId, int pId, String url, String name) {
        this.menuId = menuId;
        this.nameId = nameId;
        this.pId = pId;
        this.url = url;
        this.name = name;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
