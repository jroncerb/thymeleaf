package com.nttdata.recativeThymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

@Controller
public class PersonController {
	
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/table")
	public String viewTable(final Model model) {
		
		final Flux<Person> personList = personService.allPersons();
		model.addAttribute("personlist", personList);
		
		return "personList";
			
	}
}
