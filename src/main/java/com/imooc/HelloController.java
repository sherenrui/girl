package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/24.
 */
@Component
@RestController
public class HelloController {

    @Autowired
    private GirlInfo girlInfo;//?需要显示的加上解决方式：GirlInfosuozai1

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String  say()
    {
        return girlInfo.getName();
    }
}
