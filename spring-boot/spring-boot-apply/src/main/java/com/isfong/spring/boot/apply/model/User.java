package com.isfong.spring.boot.apply.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Accessors( chain = true )
public class User implements Serializable {

    private static final long serialVersionUID = -1707381832056039987L;

    private Long id;
    private String name;
    private Integer gender;
    private Date birthday;
    private String username;
    private String password;
    private Integer state;
}
