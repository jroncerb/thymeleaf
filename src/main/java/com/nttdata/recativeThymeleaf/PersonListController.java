package com.nttdata.recativeThymeleaf;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

//@Controller
//@RestControlle
//@RequestMapping
public class PersonListController {

//	//ejercicio2  //para que funcione el ejercicio 2 hay que separar el controller del restcontroller ,son incompatibles 
//	@Autowired
//	PersonService personservice;
	
	@GetMapping("/person-list-1")
	public Flux<Person>PersonList1(){
	Flux<Person>flux1 = Flux.just(new Person("Raul","Gonzalez",7)).delayElements(Duration.ofSeconds(2));	
	return flux1;
	}

	@GetMapping("/person-list-2")
	public Flux<Person>PersonList2(){
	Flux<Person>flux2 = Flux.just(new Person("Zinedine","zidane",5)).delayElements(Duration.ofSeconds(2));	
	return flux2;
	}
	@GetMapping("/person-list-3")
	public Flux<Person>PersonList3(){
	Flux<Person>flux3 = Flux.just(new Person("Karím","Benzema",9)).delayElements(Duration.ofSeconds(2));	
	return flux3;
	}
	@GetMapping("/person-list-4")
	public Flux<Person>PersonList4(){
	Flux<Person>flux4 = Flux.just(new Person("Iker","Casillas",1)).delayElements(Duration.ofSeconds(2));	
	return flux4;
	}
}
