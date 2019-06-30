package com.lanouMybatis.dao;


import com.lanouMybatis.bean.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherDao {
    @Select("select * from teacher")
    List<Teacher> queryTeacher();
}
