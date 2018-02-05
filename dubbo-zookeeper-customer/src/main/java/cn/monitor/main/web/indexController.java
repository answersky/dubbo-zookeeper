package cn.monitor.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuf on 2016/9/3.
 */
@Controller
public class indexController {

    @RequestMapping("index")
    public String index() {
        System.out.println(123);
        return "index";
    }

}
