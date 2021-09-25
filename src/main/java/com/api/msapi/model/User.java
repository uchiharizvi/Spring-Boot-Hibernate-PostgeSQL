package com.api.msapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
/**This class will represent a row in the database table.
 * The primary key is specified by the @Id annotation
 * In this case, userId is the primary key and the table will have userId,LastName,FirstName,Address and
 * City as columns.**/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer userId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;


}
