package com.api.msapi.dao;

import com.api.msapi.model.request.UserRequest;

import java.util.List;

public interface Operations {
    List<UserInformation> getUsers() throws Exception;

    List<UserInformation> getUserDetail(Integer userId) throws Exception;

    String addUser(UserRequest userDetail) throws Exception;
}
