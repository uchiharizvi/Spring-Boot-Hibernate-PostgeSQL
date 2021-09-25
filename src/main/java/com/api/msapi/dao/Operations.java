package com.api.msapi.dao;

import com.api.msapi.model.Users;

import java.util.List;

public interface Operations {
    List<Users> getUsers() throws Exception;
    List<Users> getUserDetail(Integer userId) throws Exception;
}
