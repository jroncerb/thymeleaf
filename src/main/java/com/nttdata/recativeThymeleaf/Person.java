package com.nttdata.recativeThymeleaf;

public class Person {

	
	private String firstname;
	private String lastname;
	private Integer age;

	public Person(String firstname, String lastname, Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	//Han surgido errores de compliación con la generacion automatica de getteres y setters . poner atención
	
	
	public Person() {
		super();
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
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


	/*para este ejercicio hace falta añadir una plantilla de html en una carpeta del proyecto, template y luego desarrollar como las capturas*/

}
