package com.ws.insumak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.insumak.model.Person;
import com.ws.insumak.model.TestTable;
import com.ws.insumak.repository.TestTableRepository;

@RestController
public class TestController {
    
    @Autowired
    private TestTableRepository testTableRepository;

    @GetMapping("/hello")
    public String vratiIme(@RequestParam(value = "name") String name) {
        TestTable testData = testTableRepository.findById("333").get();
        return "Hello" + testData.getOpis();
    }

    @PostMapping("/hello")
    public String pratiIme(@RequestBody Person person) { // json
        System.out.println(person.toString());
        return "Hello " + person.getFirstName() + " " + person.getLastName() + ", with age: " + person.getAge();
    }

}
