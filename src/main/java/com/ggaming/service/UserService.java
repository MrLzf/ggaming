package com.ggaming.service;


import com.ggaming.domain.User;

import java.util.List;

public interface UserService {
     int add(User user);
     int delete(Long id);
     int update(User user);
     User find(Long id);
     List<User> all();

}
