package com.biz.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.bbs.mapper.NoticeDao;
import com.biz.bbs.model.NoticeVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("noticeV1")
public class NoticeServiceImplV1 implements NoticeService {

	private final NoticeDao notDao;

	public NoticeServiceImplV1(NoticeDao notDao) {
		this.notDao = notDao;
	}

	@Override
	public List<NoticeVO> selectAll() {
		List<NoticeVO> notList = notDao.selectAll();
		return notList;
	}

	@Override
	public NoticeVO findBySeq(long long_id) {
		NoticeVO notlist = notDao.findById(long_id);
		return notlist;
	}

	@Override
	public int insert(NoticeVO emVO) {
		int ret = notDao.insert(emVO);
		if (ret > 0) {
			log.debug("데이터 추가 완료", ret);

		}
		return ret;
	}

	@Override
	public int update(NoticeVO emVO) {
		
		int ret = notDao.update(emVO);
		if (ret > 0) {
			log.debug("{}번 데이터 수정 완료", emVO.getId());
		}
		return ret;
	}

	@Override
	public int delete(long long_id) {
		int ret = notDao.delete(long_id);

		if (ret > 0) {
			log.debug("데이터 {}개 삭제", ret);
		}
		return ret;
	}



}
