package com.lanouMybatis.dao;

import com.lanouMybatis.bean.Province;

import java.util.List;

public interface ProvinceDao {
    List<Province> queryProvince();
    // 下面这个是多表查询，还是一对多
    List<Province> queryAllProvince();
}
