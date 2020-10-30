package com.biz.grade.model;

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
public class GradeVO {

	private long g_seq;
	private int g_num;
	private String g_name;
	private int g_kor;
	private int g_eng;
	private int g_math;
	private int g_avg;
	private int g_sum;
	

	
}
