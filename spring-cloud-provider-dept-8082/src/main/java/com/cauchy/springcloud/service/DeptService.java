package com.cauchy.springcloud.service;

import com.cauchy.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();
}
