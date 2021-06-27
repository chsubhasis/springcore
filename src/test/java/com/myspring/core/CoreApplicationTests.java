package com.myspring.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myspring.core.services.PaymentService;
import com.myspring.core.services.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService srvc;
	
	@Autowired
	PaymentServiceImpl srvcImpl;
	
	@Test
	void testDepInjIntf() {
		assertNotNull(srvc);
	}
	
	@Test
	void testDepInjImpl() {
		assertNotNull(srvcImpl.getMyDao());
	}

}
