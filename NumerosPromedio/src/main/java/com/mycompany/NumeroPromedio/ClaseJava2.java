/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasejava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class ClaseJava2 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Ingrese el primer número");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo número");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer número");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El numero promedio es: " + numeroPromedio);
    }
    
    private static Integer cargarNumero() throws IOException{
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader Buffer = new BufferedReader(capturarTeclado);
            String strNumero = Buffer.readLine();
            Integer numero = Integer.parseInt(strNumero);
        return numero;
        
    }
}
