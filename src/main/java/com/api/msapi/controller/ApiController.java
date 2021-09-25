package com.api.msapi.controller;

import com.api.msapi.dao.Operations;
import com.api.msapi.entity.Users;
import com.api.msapi.model.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private Operations crudOperation;

    @GetMapping("/v1/getusers")
    public List<Users> getUsers() throws Exception {
        return crudOperation.getUsers();
    }

    @GetMapping("/v1/user/{userId}")
    public List<Users> getUserDetail(@PathVariable Integer userId) throws Exception {
        return crudOperation.getUserDetail(userId);
    }

    @PostMapping("/v1/adduser")
    public String addUser(@RequestBody UserRequest userDetail) throws Exception {
        return crudOperation.addUser(userDetail);
    }

    @PutMapping("/v1/user/{userId}")
    public String updateUser() {
        return "Controller Created";
    }
}
