package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.bbs.model.BBsVO;
import com.biz.bbs.sql.BbsSQL;

public interface BBsDao {
	
	@Select("SELECT * FROM tbl_bbs")
	public List<BBsVO> selectAll();
	
	@Select("SELECT * FROM tbl_bbs WHERE b_seq =#{seq}")
	public BBsVO findBySeq();
	
	@InsertProvider(type=BbsSQL.class,method="bbs_insert")
	public int insert(BBsVO bbsVO);
	
	@UpdateProvider(type=BbsSQL.class,method="bbs_update")
	public int update(BBsVO bbsVO);
	
	@Select("DELETE FROM tbl_bbs WHERE b_seq =#{seq}")
	public int delete(long seq);
	
}
