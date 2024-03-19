package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Client implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer age;
	private java.lang.String firstName;
	private java.lang.String surname;
	private java.lang.Boolean consented;

	public Client() {
	}
	
	public Client(String data) {
	    this.firstName = data.get("firstName").toString();
	    this.surname = data.get("surname").toString();
	    this.age = (java.lang.Integer)data.get("age");
	    this.consented = (java.lang.Boolean)data.get("age");
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.Boolean getConsented() {
		return this.consented;
	}

	public void setConsented(java.lang.Boolean consented) {
		this.consented = consented;
	}

	public Client(java.lang.Integer age, java.lang.String firstName,
			java.lang.String surname, java.lang.Boolean consented) {
		this.age = age;
		this.firstName = firstName;
		this.surname = surname;
		this.consented = consented;
	}

}