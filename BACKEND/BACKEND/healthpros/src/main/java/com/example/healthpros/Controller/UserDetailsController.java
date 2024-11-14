package com.example.healthpros.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.healthpros.Model.UserDetails;
import com.example.healthpros.Service.UserDetailsService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/userdetails")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping
    public UserDetails createUserDetails(@RequestBody UserDetails userDetails) {
        return userDetailsService.saveUserDetails(userDetails);
    }

    @GetMapping
    public List<UserDetails> getAllUserDetails() {
        return userDetailsService.getAllUserDetails();
    }

    @GetMapping("/user")
    public List<UserDetails> getDetailsByUsername(@RequestParam String username) {
        return userDetailsService.getDetailsByUsername(username);
    }

    @PutMapping("/update")
    public UserDetails updateUserDetails(@RequestBody UserDetails userDetails) {
        return userDetailsService.updateUserDetails(userDetails);
    }
}