package com.cywp.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet(name = "baseServlet")
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取节点
        String methodName = req.getParameter("methodName");
        //获取节点的类型 比如loginServlet
        Class clazz = this.getClass();

        try {
            System.out.println("进来了");
            if (methodName != null && !methodName.trim().equals("")) {
                //获取方法和路径
                Method method = clazz.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
                String path = (String) method.invoke(this, req, resp);
//                System.out.println(path);
                if (path != null && !path.trim().equals("")) {
                    //转发
                    req.getRequestDispatcher(path).forward(req, resp);
                    System.out.println(path);
                }
            }
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
