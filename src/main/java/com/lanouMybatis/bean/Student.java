package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;
    private String ssex;

    public Student() {
    }

    public Student(Integer sid, String sanme, Integer sage, String ssex) {
        this.sid = sid;
        this.sname = sanme;
        this.sage = sage;
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sanme='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                "}\n";
    }
}
