package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.biz.bbs.model.EmployeesVO;

public interface EmployeesDao {
	

	@Select("SELECT * FROM tbl_employees ORDER BY id DESC")
	public List<EmployeesVO> selectAll();
	
	@Select("SELECT * FROM tbl_employees WHERE id = #{id}")
	public EmployeesVO findById(Long id);
	
	@Insert("INSERT INTO tbl_employees(id,first_name,last_name,address,tel,email) VALUES ('1','홍','길동','광주','010-111-1111','email')")
	public int insert(EmployeesVO employeesVO);
	
	@Update("UPDATE tbl_employees SET first_name =#{first_name},last_name=#{last_name},address=#{address},tel=#{tel},email=#{email} WHERE id = #{id}")
	public int update(EmployeesVO employeesVO);
	
	@Delete("DELETE FROM tbl_employees WHERE id =#{id}")
	public int delete(Long id);


	
	

}
