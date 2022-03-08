/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto1;

import java.util.Scanner;//Entrada de Datos

/**
 *
 * @author Usuario
 */
public class Vista {

    int carrera, horasLab;//Atributo de la Clase Vista
    String estrato;
    float total,seguro,descuento,pagoLab;
    
    Vista() {//Constructor
        this.Menu();
        
    }
    
    void Imprime(float a,//aca recibe el valor del pago de la matricula
            float b, 
            float c,
            float d){
        /*this.total=a;
        this.seguro=b;
        this.descuento=c;
        this.pagoLab=d;*/
        
        System.out.println("Pago de Matricula: $"+a);
        System.out.println("Seguro Estudantil: $"+b);
        System.out.println("Pago de Laboratorio: $"+c);
        System.out.println("TOTAL FACTURA: $"+d);
    
    }
    
    void Menu(){
    Scanner opcion = new Scanner(System.in);//Objeto que permite hacer eso
        System.out.println("UColombia - Sistema de Recaudo");
        System.out.println("Seleccione el Programa al que desea matricularse:\n"
                + "1. Ingenieria\n"
                + "2. Ciencias Humanas\n"
                + "3. Finanzas\n"
                + "4. Prog. Tecnologíco\n"
        );
        carrera = opcion.nextInt();//input
        
         System.out.println("Seleccione el Estrato socio economico: \n"+
                "A. Estrato 1 o 2\n"+
                "B. Estrato 3 o 4\n"+
                "C. Estrato 5 o 6\n");
        
        estrato=opcion.next();//nextLine lee String
        
         System.out.println("Digite las horas de Laboratorio:");
        
        horasLab=opcion.nextInt();//nextLine lee String
    }
    
    

}
