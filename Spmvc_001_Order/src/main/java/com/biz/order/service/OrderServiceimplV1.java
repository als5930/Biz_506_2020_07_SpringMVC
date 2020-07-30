package com.biz.order.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.order.dao.OrderDao;
import com.biz.order.model.OrderVO;

import lombok.Setter;

@Service
public class OrderServiceimplV1 implements OrderService {

	@Autowired
	SqlSession sqlSession;

	private OrderDao orderDao;

	/*
	 * orderServiceImpl 클래스가 객체로 생성하는 과정에서 getMapper() method를 자동으로 호출하고 orderDao를
	 * 초시화 하라
	 * 
	 * ServiceImpl클래스를 객체로 생성할때 호출되는 생성자는 최초에 한번 Container에 들록될때 호출된다
	 * 
	 * 이후에 다른 객체, 변수등을 초기화 하려면 별도의 method를 만든후 @Aut
	 * 
	 */
	@Autowired
	public void getMapper() {
		this.orderDao = sqlSession.getMapper(OrderDao.class);
	}

	@Override
	public List<OrderVO> selectAll() {

		return null;
	}

	/*
	 * seq값을 파라메터로 받아서 OrderDao.finBySeq(seq) 호출하고 DB로부터 전달되어온 주문서1개 레코드를 orderVO에
	 * 받고 호출한곳으로 그대로 return구조
	 * 
	 */
	@Override
	public OrderVO findByseq(long seq) {

		// 146
		OrderVO orderVO = orderDao.findBySeq(seq);

		return orderVO;
	}

	@Override
	public int insert(OrderVO orderVO) {

		return 0;
	}

	@Override
	public int update(OrderVO orderVO) {

		return 0;
	}

	@Override
	public int delete(long seq) {

		return 0;
	}

}
