package com.tass.microservice.users.microserviceusers.controller;

import com.tass.microservice.users.microserviceusers.entity.model.User;
import com.tass.microservice.users.microserviceusers.service.abstractions.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK) ;
    }

    @PutMapping("/")
    public ResponseEntity<?> update (@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK) ;
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        userService.deleteUser(id) ;
    }
}
