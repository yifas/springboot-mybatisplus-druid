package com.bin.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbUser implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * email
     */
    private String email;

}
