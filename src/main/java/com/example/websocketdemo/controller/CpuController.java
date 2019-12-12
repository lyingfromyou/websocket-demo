package com.example.websocketdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Lying
 * @Date 2019/12/12
 */
@RestController
public class CpuController {


    @GetMapping("/cup")
    public String cup(){
        while (true) {

        }
    }

}
