package com.example.DemoPrueba.service.impl;

import com.example.DemoPrueba.controller.DemoPruebaRequest;
import com.example.DemoPrueba.controller.DemoPruebaResponse;
import com.example.DemoPrueba.service.DemoPruebaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoPruebaServiceImpl implements DemoPruebaService {

    @Override
    public DemoPruebaResponse calculatedResult(DemoPruebaRequest id) {

        List<String> numbersId = id.getId();

        List<String> devuelveLista = new ArrayList<>();

        DemoPruebaResponse rs = new DemoPruebaResponse();

        if (numbersId.size() == 0)
        {
            devuelveLista.add("Ingrese una cadena de números, no puede ser vacía");
        } else

        {
            devuelveLista.add("Tamaño de la lista: " + String.valueOf(numbersId.size()));
            for (int i = 0; i < numbersId.size(); i++)
            {
                Integer number = Integer.valueOf(numbersId.get(i));
                if (validateNumber(number)) {
                    if (esPrimo(number)) {
                        devuelveLista.add("El número " + number + " es primo");
                    } else {
                        devuelveLista.add("El número " + number + " no es primo");
                    }
                } else {
                    devuelveLista.add("El número " + number + " es <= 1 o mayor a 100, no es primo");
                }
            }
        }
        rs.setResult(devuelveLista);
        return rs;
    }


    public static boolean validateNumber(int number) {

        if ((number <= 1) || (number > 100)) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean esPrimo(int number) {

        int contador = 0;

        //bucle que cuenta los numeros divisibles
        for (int k = (int) Math.sqrt(number); k > 1; k--) {
            if (number % k == 0) {
                contador++;
            }
        }
        return contador < 1;
    }
}


