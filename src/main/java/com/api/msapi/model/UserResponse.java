package com.api.msapi.model;

import com.api.msapi.entity.Users;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserResponse {
    private List<Users> usersList = new ArrayList<>();
}
