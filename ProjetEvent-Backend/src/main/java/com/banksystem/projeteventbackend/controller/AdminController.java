//package com.banksystem.projeteventbackend.controller;
//
//import com.banksystem.projeteventbackend.service.AdminService;
//import com.banksystem.projeteventbackend.service.UserService;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminService adminService;
//    @PostMapping
//    public ResponseEntity<User> createAdmin(@RequestBody User user) {
//        return ResponseEntity.ok(adminService.createAdmin(user));
//    }
//}
