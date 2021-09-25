package com.api.msapi.dao;

import com.api.msapi.entity.Users;
import com.api.msapi.model.request.UserRequest;

import java.util.List;

public interface Operations {
    List<Users> getUsers() throws Exception;

    List<Users> getUserDetail(Integer userId) throws Exception;

    String addUser(UserRequest userDetail) throws Exception;
}
