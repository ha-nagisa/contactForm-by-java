package com.example.demo.app.inquiry;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Inquiryform {

	@Size(min = 1, max = 20, message = "Please input 20 characters or less")
	private String name;

	@NonNull
	@Email(message = "Invalid E-mail Format")
	private String email;

	@NonNull
	private String contents;

	public Inquiryform() {

	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}
