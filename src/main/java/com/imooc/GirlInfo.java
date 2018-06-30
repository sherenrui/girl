package com.imooc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/24.
 */
@Component
@ConfigurationProperties(prefix = "girl")//prefix指的是前缀的意思,该注解可以把配置文件中的girl前缀的配置全部获取过来
public class GirlInfo {

    private int age;

    private String cupSize;

    private String Name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public GirlInfo() {
    }
}
