package com.joo.validtest.controller;

import com.joo.validtest.dto.RequestDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RequestDto requestDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
