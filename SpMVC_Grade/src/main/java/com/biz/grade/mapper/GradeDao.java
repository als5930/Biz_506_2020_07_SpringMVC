package com.biz.grade.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.biz.grade.model.GradeVO;



public interface GradeDao {
	
	@Select("SELECT * FROM tbl_grade  ORDER BY g_seq DESC")
	public List<GradeVO> selectAll();
	
	@Insert("INSERT INTO tbl_grade(g_seq,g_num, g_name,g_kor,g_eng,g_math,g_avg,g_sum) VALUES( SEQ_GRADE.NEXTVAL,#{g_num}, #{g_name},#{g_kor},#{g_eng},#{g_math},#{g_avg},#{g_sum})") 
	public int insert(GradeVO Grade);
	
	@Select("SELECT * FROM tbl_grade WHERE g_seq = #{g_seq}")
	public GradeVO findById(Long seq);
	
	@Delete("DELETE FROM tbl_grade WHERE g_seq =#{g_seq}")
	public int delete(Long seq);
	
	@Update("UPDATE tbl_grade SET g_num =#{g_num},g_name=#{g_name},g_kor=#{g_kor},g_eng=#{g_eng},g_math=#{g_math},g_avg=#{g_avg},g_sum=#{g_sum} WHERE g_seq = #{g_seq}")
	public int update(GradeVO Grade);


}
