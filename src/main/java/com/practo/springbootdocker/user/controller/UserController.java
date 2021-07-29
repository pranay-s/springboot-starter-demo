package com.practo.springbootdocker.user.controller;

import com.practo.springbootdocker.user.entities.User;
import com.practo.springbootdocker.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> listAll(){
        return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/compute-fib/{num}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> fibonacci(@PathVariable("num") int n) {
        return new ResponseEntity<>(userService.computeFibonacci(n), HttpStatus.OK);
    }
}
