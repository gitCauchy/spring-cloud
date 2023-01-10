package com.cauchy.springcloud.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dept implements Serializable {
    private long deptNo;
    private String deptName;
    /**
     * 这个数据存在哪个数据库的字段，微服务，一个服务对应一个数据库，同一信息可能在不同的数据库
     */
    private String dbSource;
}
