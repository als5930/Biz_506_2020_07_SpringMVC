package com.biz.grade.service;

import java.util.List;


import com.biz.grade.model.GradeVO;

public interface GradeService {
	public List<GradeVO> seleAll();
	
	public int insert(GradeVO gradeVO);
	public int update(GradeVO gradeVO);
	public int delete(Long long_seq);
	public GradeVO findById(Long long_seq);
}
