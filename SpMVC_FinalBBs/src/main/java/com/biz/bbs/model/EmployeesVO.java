package com.biz.bbs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesVO {
	
	private long id;
	private String first_name;
	private String last_name;
	private String address;
	private String tel;
	private String email;

	

}
