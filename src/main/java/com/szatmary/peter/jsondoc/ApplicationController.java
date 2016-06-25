package com.szatmary.peter.jsondoc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nue on 22.6.2016.
 */
@RestController
public class ApplicationController {

    @RequestMapping(value = "/hello")
    public @ResponseBody
    String hello() {
        return "hello";
    }

    @RequestMapping(value = "/car")
    public @ResponseBody
    Car car() {
        return new Car("BMW", new Owner("owner of BMW"));
    }

}
