package com.dianru.manager;

import com.dianru.User;

public interface UserService {
    User createUser(String userName, String firstName, String password);
    User createUser(String userName, String password);
    User findUserByUserName(String userName);
    int getUserCount();
    String helloName(String name, String param2);
    String hello();
}