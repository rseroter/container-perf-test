package com.seroter.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@SpringBootApplication
public class SpringRestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestapiApplication.class, args);
    }

    private final List<Employee> employees = List.of(
            new Employee("300", "Walt Longmire", "WYG", "Sheriff"),
            new Employee("301", "Vic Moretti", "WYG", "Deputy")
    );

    @GetMapping("/employees")
    public Flux<Employee> getAllEmployees() {
        return Flux.fromIterable(employees);
    }
}
