package com.example.sferumbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Files;

@SpringBootApplication
@RestController
public class Main {
    Path file = ResourceUtils.getFile("java/com.example.sferumbooks/user.json").toPath();
    public Main() throws FileNotFoundException {
        System.out.println("File not found");
    }
}
