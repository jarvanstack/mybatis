package com.bmft.pojo;

import lombok.*;

import java.io.Serializable;

@Data //get set,toString,hashcode,equals
@AllArgsConstructor
@NoArgsConstructor
                            //序列h化，分布式
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
}
