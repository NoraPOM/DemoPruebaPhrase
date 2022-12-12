package com.example.DemoPrueba.service.impl;

import com.example.DemoPrueba.controller.DemoPruebaRequest;
import com.example.DemoPrueba.controller.DemoPruebaResponse;
import com.example.DemoPrueba.service.DemoPruebaService;
import org.springframework.stereotype.Service;

@Service
public class DemoPruebaServiceImpl implements DemoPruebaService {

    @Override
    public DemoPruebaResponse calculatedResult(DemoPruebaRequest id) {
        DemoPruebaResponse rs = new DemoPruebaResponse();
        if(id.getId()=="123") {
            rs.setResult(id.getId());
        } else {
            rs.setResult(id.getId());
        }
        return rs;
    }
}

