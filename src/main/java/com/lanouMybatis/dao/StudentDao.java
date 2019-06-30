package com.lanouMybatis.dao;

import com.lanouMybatis.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> queryAll();
    List<Student> queryBysage(int sage);
    List<Student> queryBysageAndSsex(@Param("sage") int age , @Param("ssex") String sex);

    int insertStudent(Student student);
    int insertStudentBySidBySname(@Param("sid") Integer sid,@Param("sname") String sname);
}
