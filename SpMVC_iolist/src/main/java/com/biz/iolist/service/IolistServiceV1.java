package com.biz.iolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.iolist.mapper.IolistDao;
import com.biz.iolist.model.IolistVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service("ioserviceV1")
public class IolistServiceV1 implements IolistService {

	@Autowired
	private IolistDao iolistDao;
	

	@Override
	public List<IolistVO> selectAll() {
		// TODO Auto-generated method stub
		return iolistDao.selectAll();

	}

	@Override
	public IolistVO findById(Long id) {
		// TODO Auto-generated method stub
		return iolistDao.findById(id);
	}

	@Override
	public int insert(IolistVO ioVO) {

		int ret = iolistDao.insert(ioVO);
		return ret;

	}

	@Override
	public int update(IolistVO vo) {
		int ret = iolistDao.update(vo);	
		return ret;
	}

	@Override
	public int delete(Long id) {
		int ret = iolistDao.delete(id);
		return ret;
	}
}