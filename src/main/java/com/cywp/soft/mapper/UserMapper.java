package com.cywp.soft.mapper;

import com.cywp.soft.bean.Menu;
import com.cywp.soft.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    //增删改查方法
    int addUser(User user);
    int deleteUserById(int userId);
    int updateUser(User user);
    List<User> findAll();

    User login(String account, String pwd);//用户登入
    List<User> getUserList(HashMap<String, Object> condition);//查询所有用户集合
    int findCount(HashMap<String, Object> condition);//查找数量
    boolean regCheck(String userName);//注册用户名检测
    boolean reg(User user);//注册插入数据库
    Integer changeStateNo(@Param("a") String a, @Param("userId") int userId);//禁用用户
    int changeStateYes(int userId);//启用用户

//    HashMap<String, List<Menu>> findMenuMap(int roleId, int pId);
    List<Menu> findMenusByPid(int roleId, int i);//动态菜单
}
