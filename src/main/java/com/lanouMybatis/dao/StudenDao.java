package com.lanouMybatis.dao;

import com.lanouMybatis.bean.Studen;

import java.util.List;

public interface StudenDao {
    //动态sql的if
    List<Studen> queryByid(Studen studen);
    //动态sql的choose when
    List<Studen> queryBychoose(Studen studen);
}
