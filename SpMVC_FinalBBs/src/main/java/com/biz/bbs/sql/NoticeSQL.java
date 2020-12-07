package com.biz.bbs.sql;

import org.apache.ibatis.jdbc.SQL;

public class NoticeSQL {

	public String not_insert() {

		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_notice");

		sql.INTO_COLUMNS("id").INTO_VALUES("#{id}");

		sql.INTO_COLUMNS("n_date").INTO_VALUES("#{n_date}");
		sql.INTO_COLUMNS("n_time").INTO_VALUES("#{n_time}");
		
		sql.INTO_COLUMNS("n_writer").INTO_VALUES("#{n_writer}");
		sql.INTO_COLUMNS("n_subject").INTO_VALUES("#{n_subject}");
		sql.INTO_COLUMNS("n_text").INTO_VALUES("#{n_text}");
	
		return sql.toString();

	}
	
	public String not_update() {
		SQL sql = new SQL();
		
		sql.UPDATE("tbl_notice");
		sql.SET("n_date = #{n_date}");
		sql.SET("n_time = #{n_time}");
		sql.SET("n_writer = #{n_writer}");
		sql.SET("n_subject = #{n_subject}");
		sql.SET("n_text = #{n_text}");
		sql.SET("id = #{id}");
		return sql.toString();
	}

}
