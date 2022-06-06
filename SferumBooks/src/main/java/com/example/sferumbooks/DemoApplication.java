package com.example.sferumbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

@SpringBootApplication
@RestController
public class DemoApplication {

    public DemoApplication() throws FileNotFoundException {
        System.out.println("File not found");
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\DE\\IdeaProjects\\SferumBooks\\src\\main\\java\\com.example.sferumbooks\\user.json"), UTF_8);
        List<String> result = new ArrayList<>();
        for (String s: result){
            System.out.println(s);
        }
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Stas") String name) {
        return String.format("Hello %s!", name);
    }

    Path file = ResourceUtils.getFile("java/com.example.sferumbooks/user.json").toPath();
}

