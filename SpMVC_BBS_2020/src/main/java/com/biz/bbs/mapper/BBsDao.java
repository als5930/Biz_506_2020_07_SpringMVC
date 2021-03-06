package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.bbs.model.BBsVO;
import com.biz.bbs.sql.BbsSQL;

public interface BBsDao {
	
	@Select("SELECT * FROM tbl_bbs ORDER BY b_seq DESC")
	public List<BBsVO> selectAll();
	
	@Select("SELECT * FROM tbl_bbs WHERE b_seq =#{seq}")
	public BBsVO findBySeq(long seq);
	
	@InsertProvider(type=BbsSQL.class,method="bbs_insert")
	@SelectKey(keyProperty = "b_seq", statement = "SELECT SEQ_BBS.NEXTVAL FROM DUAL",resultType = Long.class,before = true)
	public int insert(BBsVO bbsVO);
	
	@UpdateProvider(type=BbsSQL.class,method="bbs_update")
	public int update(BBsVO bbsVO);
	
	@Delete("DELETE FROM tbl_bbs WHERE b_seq =#{seq}")
	public int delete(long seq);
	
}
