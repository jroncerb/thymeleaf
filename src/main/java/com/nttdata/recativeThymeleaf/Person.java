package com.nttdata.recativeThymeleaf;

public class Person {

	
	private String firstname;
	private String lastname;
	private Integer age;

	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	
	/*para este ejercicio hace falta añadir una plantilla de html en una carpeta del proyecto, template y luego desarrollar como las capturas*/
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
