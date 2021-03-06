package com.seroter.springrestapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@SpringBootApplication
public class SpringRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestapiApplication.class, args);
	}

	List<Employee> employees;

	public SpringRestapiApplication() {

		employees = new ArrayList<Employee>();
		employees.add(new Employee("300", "Walt Longmire", "WYG", "Sheriff"));
		employees.add(new Employee("301", "Vic Moretti", "WYG", "Deputy"));

	}

	@GetMapping("/employees")
	public Flux<Employee> getAllEmployees() {
		return Flux.fromIterable(employees);
	}



}
