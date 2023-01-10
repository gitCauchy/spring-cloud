package com.cauchy.springcloud.dao;

import com.cauchy.springcloud.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();
}
