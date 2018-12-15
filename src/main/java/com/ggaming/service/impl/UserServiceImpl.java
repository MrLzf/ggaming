package com.ggaming.service.impl;

import com.ggaming.domain.User;
import com.ggaming.mapper.UserMapper;
import com.ggaming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User find(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> all() {
        return userMapper.selectAll();
    }
}
