package com.cywp.soft.servlet;

import com.alibaba.fastjson.JSON;
import com.cywp.soft.bean.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cywp.soft.service.impl.AdminServiceImpl;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends BaseServlet {
//    AdminService adminService= (AdminService) ObjectFactory.newInstance("com.cywp.soft.service.impl.AdminServiceImpl");
AdminServiceImpl AdminServiceImpl= new AdminServiceImpl();
    public void login(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String loginUsername = request.getParameter("loginUsername");
        String loginPassword = request.getParameter("loginPassword");

//        Map loginUser= JSON.parseObject(request.getParameter("param"),Map.class);
//        String loginUsername = (String) loginUser.get("loginUsername");
//        String loginPassword= (String) loginUser.get("loginPassword");

        User user=AdminServiceImpl.login(loginUsername,loginPassword);

            if (user!=null){
                request.getSession().setAttribute("User",user);
                response.getWriter().write("登入成功");
            }else{
                response.getWriter().write("账号或密码不正确");
                System.out.println("账号或密码不正确");
            }

    }

}
