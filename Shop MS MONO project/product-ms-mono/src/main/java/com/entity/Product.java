package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@ApiModel(description = "Details about Product")
public class Product {
	@Id
	@GeneratedValue
//	@ApiModelProperty("ID must be unique")
	private Long productId;
	
//	@ApiModelProperty("Enter Product Name")
	private String productName;
	private int quantity;
	private Double price;
	
}
