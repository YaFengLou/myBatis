package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Province {
    //省份
    private int id;
    private String pname;

    private List<City> cities;

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", cities=" + cities +
                "}\n";
    }
}
