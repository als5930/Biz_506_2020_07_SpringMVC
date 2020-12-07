package com.biz.bbs.model;

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
public class NoticeVO {
	
	private long id;
	private String n_date;
	private String n_time;
	private String n_writer;
	private String n_subject;
	private String n_text;
	private int n_count;
	private String n_content;

	

}
