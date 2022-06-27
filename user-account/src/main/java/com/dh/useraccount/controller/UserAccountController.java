package com.dh.useraccount.controller;

import com.dh.useraccount.model.UserAccount;
import com.dh.useraccount.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-account")
public class UserAccountController {

    @Autowired
    IService iService;

    @PostMapping
    public ResponseEntity<UserAccount> post(@RequestBody UserAccount userAccount) {
        return ResponseEntity.status(201).body(iService.post(userAccount));
    }

    @GetMapping
    public ResponseEntity<List<UserAccount>> getAll() {
        return ResponseEntity.ok(iService.getAll());
    }

}
