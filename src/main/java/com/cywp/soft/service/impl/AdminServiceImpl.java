package com.cywp.soft.service.impl;


import com.cywp.soft.bean.User;
import com.cywp.soft.mapper.UserMapper;
import com.cywp.soft.service.AdminService;
import com.cywp.soft.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class AdminServiceImpl implements AdminService {
    @Override
    public User login(String account, String pwd) {
        SqlSession session = MyBatisUtils.getInstance().getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = null;
        user = userMapper.login(account,pwd);
        session.commit();
        return user;
    }


}
