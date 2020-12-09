package com.cywp.soft.service.impl;

import com.cywp.soft.bean.Menu;
import com.cywp.soft.filter.ObjectFactory;
import com.cywp.soft.mapper.UserMapper;
import com.cywp.soft.service.MenuService;
import com.cywp.soft.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class MenuServiceImpl implements MenuService {
//    MenuDao menuDao= (MenuDao) ObjectFactory.newInstance("com.cywp.soft.dao.impl.MenuDaoImpl");

    @Override
    public HashMap<String, List<Menu>> findMenuMap(int roleId, int pId) {
        SqlSession session = MyBatisUtils.getInstance().getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);

        List<Menu> fatherMenus= userMapper.findMenusByPid(roleId,0);
        HashMap menuMap=new HashMap();
        for (Menu menu: fatherMenus){
            List<Menu> sonMenus=userMapper.findMenusByPid(roleId,menu.getMenuId());
            menuMap.put(menu.getName(),sonMenus);
        }
        return menuMap;
    }
}
