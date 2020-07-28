package com.bmft.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
}
