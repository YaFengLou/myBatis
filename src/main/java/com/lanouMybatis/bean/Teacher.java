package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private int tid;
    private String tname;
    private int cid;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", cid=" + cid +
                "}\n";
    }
}
