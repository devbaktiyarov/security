package com.devbaktiyarov.security.springsecurityclient.service;

import com.devbaktiyarov.security.springsecurityclient.entity.User;
import com.devbaktiyarov.security.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
