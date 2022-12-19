package com.example.DemoPrueba.service.impl;

import com.example.DemoPrueba.controller.DemoPruebaRequest;
import com.example.DemoPrueba.controller.DemoPruebaResponse;
import com.example.DemoPrueba.service.DemoPruebaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DemoPruebaServiceImpl implements DemoPruebaService {

    @Override
    public DemoPruebaResponse calculatedResult(DemoPruebaRequest id) {

        DemoPruebaResponse rs = new DemoPruebaResponse();

        String cadenaId = id.getId();

        String cadena = String.valueOf(cadenaId);

        Integer ccons = 0;
        Integer cvow = 0;
        String phrase = "";

        String cadenaL = cadena.toLowerCase();

        for (int i = 1; i < cadenaL.length(); i++)
        {
            char ch = cadena.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                cvow++;
            } else if ((ch >= 'A') && (ch <= 'Z')) {
                ccons++;
            }

        }

        String vocal = "a";
        String cadenaReplaced = cadena.replaceAll(cadenaL, vocal);

        rs.setResultCon(ccons);
        rs.setResultVow(cvow);
        rs.setResultPhrase(cadenaReplaced);
        return rs;
    }
}





/*

Integer sizeValidated  = id.getMax();

        StringBuilder cadenaTemporal1 = new StringBuilder();
        StringBuilder cadenaTemporal2 = new StringBuilder();

        List<String> devuelveLista = new ArrayList<>();

        DemoPruebaResponse rs = new DemoPruebaResponse();

        if (cadena.length() == 0) {

            devuelveLista.add("Ingrese una cadena de números, no puede ser vacía");

        } else {

            devuelveLista.add("Cadena ingresada: " + cadena);

            devuelveLista.add("Tamaño a validar: " + sizeValidated);

            Integer sizeCadena = cadena.length();

            devuelveLista.add("Tamaño de la cadena: " + sizeCadena);

            String[] textoSeparado = cadena.split(" ");
            devuelveLista.add("textoSeparado: " + Arrays.toString(textoSeparado));

            Integer sizeTextoSeparado = textoSeparado.length;
            devuelveLista.add("numeroObjetos: " + sizeTextoSeparado);

            Integer sumSize = 0;

            for (int i = 1; i<=sizeTextoSeparado ; i++) {
                devuelveLista.add("- - - - - - - - - - - - - - - - - - -  - - - -");
                String part = textoSeparado[i-1];
                devuelveLista.add("Valor de cada parte: " + part);
                Integer sizePart = part.length();
                devuelveLista.add("Tamaño de cada parte: " + sizePart);


                if (sumSize+sizePart<=sizeValidated) {

                    devuelveLista.add("Tamaño sumado: " + sumSize);
                    cadenaTemporal1.append(part);
                    cadenaTemporal1.append(" ");
                    sumSize = sizePart + sumSize;

                } else {
                    cadenaTemporal2.append(",");
                    cadenaTemporal2.append(part);
                    //textoSeparado.append("otra","prueba");
                }
            }
            devuelveLista.add("**********************************************");
            devuelveLista.add("cadena temporal1: " +  cadenaTemporal1);
            devuelveLista.add("


            int i, j;
            int postem = 0;
            int posEspacio = 0;
            int posInicial = 0;
            int tamanoSubCadena = 0;

            for (i = 1; i < sizeCadena ; i++ ) {

                //devuelveLista.add("Valores: " + posInicial + posEspacio + postem);

                //String cadena2 = cadena.substring(7, 2);
                //devuelveLista.add("cadena2: " + cadena2);

                posEspacio = cadena.indexOf(" "); //se busca el primer espacio en blanco
                devuelveLista.add("posEspacio: " + posEspacio);

                String subCadena = cadena.substring(posInicial, posEspacio);
                devuelveLista.add("subCadena: " + subCadena);

                tamanoSubCadena = subCadena.length();
                devuelveLista.add("Tamaño  subCadena: " + tamanoSubCadena);

                postem = tamanoSubCadena;
                devuelveLista.add("Tamaño pos_tem: " + postem);

               // posInicial = posEspacio + 1;
                devuelveLista.add("posInicial 2: " + posInicial);

                devuelveLista.add("sizeCadena " + sizeCadena);


                //String cadena2 = cadena.substring(7 ,  7);

                //devuelveLista.add("sizeCadena: " + cadena2);

                devuelveLista.add(" *** *** *** *** ***  *** *** *** *** *** *** *** *** " );

                if (cadenaTemporal.length() < 16) {
                    cadenaTemporal.append(subCadena);

                }
 */
