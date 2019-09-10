package com.tonglc.demo.springcloudconfigdept8001.dao;

import com.tonglc.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: tonglc
 * @create: 2019-09-02 16:09
 **/

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
