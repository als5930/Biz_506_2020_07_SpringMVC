package com.biz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IolistVO {

	private Long seq;
	private String IO_DATE;
	private String IO_TIME;
	private String IO_INPUT;
	private String IO_PNAME;
	private int IO_PRICE;
	private int IO_QUAN;
	private int IO_TOTAL;

	
	
}
