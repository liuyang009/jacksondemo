package com.jackson.example.web.controller;

import com.jackson.example.web.model.Animal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author five.liu
 */
@RestController
public class ZooController {


    @RequestMapping(value = "/animals", method = RequestMethod.POST)
    public void saveAnimal(@RequestBody Animal animal) {
        System.out.println("111111111111111111111");
    }
}
