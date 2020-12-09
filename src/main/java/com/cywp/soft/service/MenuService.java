package com.cywp.soft.service;

import com.cywp.soft.bean.Menu;

import java.util.HashMap;
import java.util.List;

public interface MenuService {
    HashMap<String, List<Menu>> findMenuMap(int roleId, int pId);
}
