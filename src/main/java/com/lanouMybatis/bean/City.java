package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class City {
    //城市
    private Integer id;
    private String cname;
    private Integer pid;


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                "}\n";
    }
}
