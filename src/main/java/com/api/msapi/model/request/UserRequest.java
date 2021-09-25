package com.api.msapi.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private String lastName;
    private String firstName;
    private String address;
    private String city;
}
