package com.lanouMybatis;

import com.lanouMybatis.bean.Studen;
import com.lanouMybatis.bean.Student;
import com.lanouMybatis.dao.BookDao;
import com.lanouMybatis.dao.ProvinceDao;
import com.lanouMybatis.dao.StudenDao;
import com.lanouMybatis.dao.StudentDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {
    public static void main( String[] args ) throws IOException {
        // 1. 读入配置文件
        String confPath = "mybatis_conf.xml";
        InputStream in = Resources.getResourceAsStream(confPath);

        // 2. 构建SqlSessionFactory(用于获取sqlSession)
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);

        // 3. 获取sqlSession对象(用于具体的CRUD)  !如果需要提交数据的话，需要设置autocommit
        SqlSession sqlSession = sessionFactory.openSession(true);

        // xml方式测试
        //ProvinceDao provinceDao = sqlSession.getMapper(ProvinceDao.class);
        //System.out.println(provinceDao.queryProvince());

        //注解方式测试
//        TeacherDao teacherDao  = sqlSession.getMapper(TeacherDao.class);
//        System.out.println(teacherDao.queryTeacher());

        //练习
        //StudentDao studentDao  =sqlSession.getMapper(StudentDao.class);
        //log.info(""+studentDao.queryAll());
        //log.info(""+studentDao.queryBysage(23));
//        log.info(""+studentDao.queryBysageAndSsex(23,"男"));
        /*Student student = new Student(100,"金赛赛",25,"女");
        log.info("插入了："+studentDao.insertStudent(student)+"行");*/
        //log.info("插入l："+studentDao.insertStudentBySidBySname(200,"因赛赛"));

       /* BookDao bookDao = sqlSession.getMapper(BookDao.class);
        log.info("一对一"+bookDao.queryAllBook());*/

        /*ProvinceDao provinceDao = sqlSession.getMapper(ProvinceDao.class);
        log.info("一对多"+provinceDao.queryAllProvince());*/
        // 动态sql if测试
        /*StudenDao studenDao = sqlSession.getMapper(StudenDao.class);
        Studen studen = new Studen();
        studen.setId(5);
        System.out.println(studenDao.queryByid(studen));*/
        // 动态choose when 测试
        StudenDao studenDao = sqlSession.getMapper(StudenDao.class);
        Studen studen = new Studen();
        //studen.setId(5);
        System.out.println(studenDao.queryBychoose(studen));
    }
}
