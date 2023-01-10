package com.cauchy.springcloud.service.impl;

import com.cauchy.springcloud.dao.DeptDao;
import com.cauchy.springcloud.pojo.Dept;
import com.cauchy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        Dept dept = new Dept();
        dept.setDeptNo(1);
        dept.setDeptName("1");
        dept.setDbSource("1");
        List<Dept> list = new ArrayList<>();
        list.add(dept);
        return list;
    }
}
