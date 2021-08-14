package org.gdupt.controller;

import org.gdupt.bean.Pet;
import org.gdupt.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author czy
 * @create 2021-08-09 14:16
 */
//@ResponseBody
//@Controller//
@RestController//这个注解是上面几个注解的合体
public class IndexController {

    @Autowired
    PetService service;

    @ResponseBody//不跳转页面
    @GetMapping("/pets")
    public List<Pet> getAll() {

        return service.queryAllPet();
    }

    @GetMapping("/pet")
    @ResponseBody
    public Pet getPetById(@RequestParam("id") Integer id) {

        return service.getPetById(id);
    }

}
