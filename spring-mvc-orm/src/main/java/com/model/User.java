package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import relationship_onetoone.Laptop;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@ApiModel(description = "Details about user")
public class User {
	@Id
	@GeneratedValue
	@ApiModelProperty("ID must be unique")
	private int uid;
	@ApiModelProperty("Enter Username")

	private String uname;
	private String password;
	private String city;
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
}
