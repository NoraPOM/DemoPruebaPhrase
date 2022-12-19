package com.example.DemoPrueba;

import com.example.DemoPrueba.controller.DemoPruebaRequest;
import com.example.DemoPrueba.service.DemoPruebaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoPruebaApplicationTests {

	@Autowired
	DemoPruebaService service;
	@Test
	void testPrime_WhenNumeroIsOne_ThenError() {
	//	Assertions.assertThrows
	//			(IllegalArgumentException.class,()
	//					-> service.calculatedResult(DemoPruebaRequest (['1'])));
		}

	@Test
	void testPrime_WhenNumeroIsNegative_ThenError() {
	//	Assertions.assertThrows(IllegalArgumentException.class,
//				() -> service.calculatedResult(DemoPruebaRequest ([-1])));
	}

}
