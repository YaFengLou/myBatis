package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Studen {
    private Integer id;
    private String sname;
    private Integer age;
    private String gender;
    private String nickName;

    @Override
    public String toString() {
        return "Studen{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                "}\n";
    }
}
