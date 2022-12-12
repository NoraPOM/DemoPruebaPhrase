package com.example.DemoPrueba.service;

import com.example.DemoPrueba.controller.DemoPruebaRequest;
import com.example.DemoPrueba.controller.DemoPruebaResponse;
import com.example.DemoPrueba.service.impl.DemoPruebaServiceImpl;
import org.springframework.stereotype.Service;

public interface DemoPruebaService {
    DemoPruebaResponse calculatedResult (DemoPruebaRequest id);
}
