package com.biz.grade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.grade.mapper.GradeDao;
import com.biz.grade.model.GradeVO;

@Service("gradeServiceV1")
public class GradeServiceImpl implements GradeService {

	@Autowired
	private GradeDao gradeDao;

	@Override
	public List<GradeVO> seleAll() {
		List<GradeVO> graList = gradeDao.selectAll();
		return graList;
	}

	@Override
	public GradeVO findById(Long seq) {
		GradeVO gradeVO = gradeDao.findById(seq);
		
		return gradeVO;
	}

	@Override
	public int insert(GradeVO gradeVO) {

		int ret = gradeDao.insert(gradeVO);

		return ret;
	}

	@Override
	public int update(GradeVO gradeVO) {
		return gradeDao.update(gradeVO);
	}

	@Override
	public int delete(Long long_seq) {
		GradeVO gradeVO = gradeDao.findById(long_seq);
		return gradeDao.delete(long_seq);
	}

}
