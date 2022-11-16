/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeroimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class NumeroImpar {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Ingrese el primer número");
        Double numero = Double.valueOf(cargarNumero());
        
        Boolean esPar = (numero % 2) == 0;
        
        if (esPar) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
    private static Integer cargarNumero() throws IOException{
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader Buffer = new BufferedReader(capturarTeclado);
            String strNumero = Buffer.readLine();
            Integer numero = Integer.parseInt(strNumero);
        return numero;
        
    }
}
