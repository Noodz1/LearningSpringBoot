/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author krist
 */
@RestController
public class HelloController {

    /**
     *
     * @return
     */
     @RequestMapping("/hello")
    public String hello(){
        return "hello from the spring world!";
    }
   
    
   
}
