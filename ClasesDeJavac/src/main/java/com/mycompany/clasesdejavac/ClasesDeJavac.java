/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasesdejavac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class ClasesDeJavac {

    public static void main(String[] args) throws IOException {
         //Se piden los 3 numeros para que se ingresen
        
        System.out.println("Ingrese el primer número");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo número");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer número");
        Integer numero3 = cargarNumero();
       
       
         /*Con este codigo se realizan las dos funciones para numero
         mayor y numero menor con las funciones de abajo*/
         
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
        
    }
    
    private static Integer cargarNumero() throws IOException{
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader Buffer = new BufferedReader(capturarTeclado);
            String strNumero = Buffer.readLine();
            Integer numero = Integer.parseInt(strNumero);
        return numero;
        
    }
    
    private static void calcularNumeroMayor (Integer numero1, Integer numero2, Integer numero3) {
        
         Integer numeroMayor = numero1;
        
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        } 
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        } 
        System.out.println("El numero mayor es: " + numeroMayor);
        
    }
    
    private static void calcularNumeroMenor (Integer numero1, Integer numero2, Integer numero3) {
        
        Integer numeroMenor = numero1;
        
        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        } 
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        } 
        System.out.println("El numero menor es: " + numeroMenor);
        
    }
}
