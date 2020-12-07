package com.biz.bbs.service;

import java.util.List;

import com.biz.bbs.model.NoticeVO;

public interface NoticeService {

	public List<NoticeVO> selectAll();
	public NoticeVO findBySeq(long long_id);

	public int insert(NoticeVO emVO);
	public int update (NoticeVO emVO);
	public int delete(long long_id);


	
	
	
}
