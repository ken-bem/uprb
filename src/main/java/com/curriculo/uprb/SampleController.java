package com.curriculo.uprb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {


    @RequestMapping("/")
    public String home(){
        return "dashboard/index";
    }

}
