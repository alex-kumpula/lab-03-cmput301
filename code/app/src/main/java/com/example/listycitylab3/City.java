package com.example.listycitylab3;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String province;
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }
    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String value) {
        this.province = value;
    }
}
