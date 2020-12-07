package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.bbs.model.NoticeVO;
import com.biz.bbs.sql.NoticeSQL;

public interface NoticeDao {
	

	@Select("SELECT * FROM tbl_notice ORDER BY id DESC")
	public List<NoticeVO> selectAll();
	
	@Select("SELECT * FROM tbl_notice WHERE id = #{id}")
	public NoticeVO findById(Long id);
	
	@InsertProvider(type=NoticeSQL.class,method="not_insert")
	@SelectKey(keyProperty = "id", statement = "SELECT SEQ_NOTICE.NEXTVAL FROM DUAL",resultType = Long.class,before = true)	
	public int insert(NoticeVO employeesVO);
	
	@UpdateProvider(type=NoticeSQL.class,method="not_update")
	public int update(NoticeVO employeesVO);
	
	@Delete("DELETE FROM tbl_notice WHERE id =#{id}")
	public int delete(Long id);


	
	

}
