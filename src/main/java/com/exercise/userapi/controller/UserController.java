package com.exercise.userapi.controller;

import com.exercise.userapi.dto.UserRequest;
import com.exercise.userapi.dto.UserResponse;
import com.exercise.userapi.model.User;
import com.exercise.userapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest){
        return userService.create(userRequest);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        userService.delete(id);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable String id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable String id, @RequestBody UserRequest user) {
        return userService.update(user, id);
    }


    //todo: verificar relacionamento com api de vendas, o que eh pra trazer?
    /*
    @GetMapping
    public List<OrderId>*/
}
