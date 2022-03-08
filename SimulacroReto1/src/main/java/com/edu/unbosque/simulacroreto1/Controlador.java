/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto1;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    Vista vis;
    Modelo mod;
    
    Controlador(Vista v,Modelo m){
        this.vis=v;
        this.mod=m;
        this.mod.carrera=this.vis.carrera;
        this.mod.estrato=this.vis.estrato;
        this.mod.horasLab=this.vis.horasLab;
        /*
        System.out.println("Pago de Matricula: $"+m.costoDescuento());
        System.out.println("Seguro Estudantil: $"+m.costoSeguro());
        System.out.println("TOTAL FACTURA: $"+m.Total());
        */
        
        this.vis.Imprime(this.mod.Total(),
                this.mod.costoSeguro(),
                this.mod.costoDescuento(),
                this.mod.costoLaboratorio()
        );

    }
    
}
