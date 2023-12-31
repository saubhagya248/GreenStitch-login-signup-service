package com.GreenStitch.loginsignupservice;

import com.GreenStitch.loginsignupservice.Enums.Role;
import com.GreenStitch.loginsignupservice.Model.User;
import com.GreenStitch.loginsignupservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DummyInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void run(String... args) throws Exception {

        userRepository.save(User.builder()
                        .name("Saubhagya")
                        .username("Saubhagya248")
                        .password(passwordEncoder.encode("123456"))
                        .role(Role.ADMIN)
                .build());

        System.out.print("called command line runner");
        userRepository.save(User.builder()
                        .name("Komal")
                        .username("Komal1")
                        .password(passwordEncoder.encode("Komal@123"))
                        .role(Role.USER)
                .build());

    }
}
