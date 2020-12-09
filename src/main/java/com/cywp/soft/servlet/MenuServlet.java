package com.cywp.soft.servlet;

import com.cywp.soft.bean.Menu;
import com.cywp.soft.bean.User;
import com.cywp.soft.filter.ObjectFactory;
import com.cywp.soft.service.MenuService;
import com.cywp.soft.service.impl.MenuServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet("/menuServlet")
public class MenuServlet extends BaseServlet {
//    MenuService menuService= (MenuService) ObjectFactory.newInstance("com.cywp.soft.service.impl.MenuServiceImpl");

    MenuServiceImpl menuService=new MenuServiceImpl();
    public String findMenus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user= (User) request.getSession().getAttribute("User");
        //菜单栏
        HashMap<String, List<Menu>> menuMap = menuService.findMenuMap(user.getRoleId(),0);
        //数据存入request
        request.setAttribute("menuMap",menuMap);
        //携参跳转
        System.out.println("MenuServlet携参跳转");
        return "jsp/Main.jsp";
    }
}
