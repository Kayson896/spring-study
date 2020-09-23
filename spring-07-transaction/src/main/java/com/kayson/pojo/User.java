package com.kayson.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author
 * @date 2020/9/22 - 16:12
 */
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
