package com.myspring.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO myDao;

	public PaymentDAO getMyDao() {
		return myDao;
	}

	public void setMyDao(PaymentDAO myDao) {
		this.myDao = myDao;
	}
	
}
