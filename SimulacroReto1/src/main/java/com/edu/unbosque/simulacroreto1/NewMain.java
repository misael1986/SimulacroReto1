/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /* Programa de Calcula:
        Costo de Matriculas en una Universidad Pública 'UColombia'
        50% de descuento sobre el costo del semestre para estratos 1 y 2
        15% de descuento para estratos 3 y 4
        10% de sobrecosto para estratos 5 y 6
      
        Ingenieria= $1.600.000;
        Humanas= $1.300.000;
        Finanzas= $1.400.000;
        Prog. Tecnologíco= $900.000
      
        Seguro Medico Estudiantil:1% del total (con descuento o Incremento)
        
     */
    public static void main(String[] args) {
        /*
        Scanner opcion = new Scanner(System.in);//Objeto que permite leer desde teclado
        System.out.println("UColombia - Sistema de Recaudo");
        System.out.println("Seleccione el Programa al que desea matricularse:\n"
                + "1. Ingenieria\n"
                + "2. Ciencias Humanas\n"
                + "3. Finanzas\n"
                + "4. Prog. Tecnologícos\n"
        );
        int carrera = opcion.nextInt();//input de Enteros
        float matricula;
        switch (carrera) {
            case 1:
                matricula = 1600000;
                break;
            case 2:
                matricula = 1300000;
                break;
            case 3:
                matricula = 1400000;
                break;
            case 4:
                matricula = 900000;
                break;
            default:
                matricula = 900000;
                break;
        }

        System.out.println("Seleccione el Estrato socio economico: \n"
                + "A. Estrato 1 o 2\n"
                + "B. Estrato 3 o 4\n"
                + "C. Estrato 5 o 6\n");

        String estrato = opcion.next();//next lee String
        float descuento;
        float totalMatricula;
        if (estrato.equals("A") || estrato == "a") {
            descuento = 50;
            totalMatricula = matricula - (matricula * descuento / 100);
        } else if (estrato.equals("B") || estrato.equals("b")) {
            descuento = 15;
            totalMatricula = matricula - (matricula * descuento / 100);
        } else {
            descuento = 10;
            totalMatricula = matricula + (matricula * descuento / 100);
        }

        float seguroMedico = totalMatricula * 1 / 100;

        System.out.println("Pago de Matricula: $" + totalMatricula);
        System.out.println("Seguro Estudantil: $" + seguroMedico);
        System.out.println("TOTAL FACTURA: $" + (totalMatricula + seguroMedico));
        */

        
        Vista interfaz=new Vista();//'interfaz' es un Objeto de clase Vista
        Modelo calculos=new Modelo();//'calculos' es Objeto de clase Modelo
        Controlador control=new Controlador(interfaz,calculos);
        /*control es un Objeto de Clase Controlador pero, este como debe 
        comunicarse entre la Vista y el Modelo, por eso recibe esos 2 como 
        Parametros y usarlos internamente*/
        
        Vista v1=new Vista();//'interfaz' es un Objeto de clase Vista
        Modelo m1=new Modelo();//'calculos' es Objeto de clase Modelo
        Controlador c1=new Controlador(v1,m1);
        
        
        System.out.println("Estrado del Objeto 1: "+interfaz.estrato);
        System.out.println("Estrado del Objeto 2: "+v1.estrato);
        
    }

}
