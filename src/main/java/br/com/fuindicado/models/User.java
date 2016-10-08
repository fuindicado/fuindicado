package br.com.fuindicado.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "{message.model.user.name.null}")
	@Size(min=5, message = "{message.model.user.name.size.min}")
	private String name;

	@NotNull(message = "{message.model.user.email.null}")
	@Size(min=8, message = "{message.model.user.email.size.min}")
	private String email;
	
	@NotNull
	@Size(min=4)
	private String login;
	
	@NotNull
	@Size(min=6)
	private String password;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date createdDate;
	
	@JsonIgnore
	private Integer numberToPassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getNumberToPassword() {
		return numberToPassword;
	}

	public void setNumberToPassword(Integer numberToPassword) {
		this.numberToPassword = numberToPassword;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", login=" + login + ", password=" + password
				+ ", createdDate=" + createdDate + ", numberToPassword=" + numberToPassword + "]";
	}
	
	

}
