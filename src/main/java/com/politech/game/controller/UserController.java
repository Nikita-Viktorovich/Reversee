package com.politech.game.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.politech.game.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.politech.game.utils.JsonUtilities.toJson;

@RestController
@AllArgsConstructor
public class UserController {

    public final UserRepository userRepository;

    @GetMapping("/get/{id}")
    public ResponseEntity<String> user(@RequestBody long id) throws JsonProcessingException {
        return new ResponseEntity<>(toJson(userRepository.findById(id)), HttpStatus.OK);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<List<String>> userList(@RequestBody String name) throws JsonProcessingException {
        return new ResponseEntity(userRepository.findByName(name), HttpStatus.OK);
    }

}
