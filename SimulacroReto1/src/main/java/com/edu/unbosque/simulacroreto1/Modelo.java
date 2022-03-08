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
public class Modelo {

    protected float totalMatricula, seguroMedico, matricula, ValorLab, TotalLab;
    protected int carrera, horasLab;
    protected String estrato;

    Modelo() {

    }

    private void costoMatricula() {
        float matricula, labo;
        switch (this.carrera) {
            case 1:
                matricula = 1600000;
                labo = 20000;
                break;
            case 2:
                matricula = 1300000;
                labo = 15000;
                break;
            case 3:
                matricula = 1400000;
                labo = 25000;
                break;
            case 4:
                matricula = 900000;
                labo = 20000;
                break;
            default:
                matricula = 900000;
                labo = 20000;
                break;
        }

        this.matricula = matricula;
        this.ValorLab = labo;

    }

    float costoDescuento() {
        costoMatricula();
        float descuento;
        if (this.estrato.equals("A") || estrato.equals("a")) {
            descuento = 50;
            totalMatricula = matricula - (matricula * descuento / 100);
        } else if (estrato.equals("B") || estrato.equals("b")) {
            descuento = 15;
            totalMatricula = matricula - (matricula * descuento / 100);
        } else {
            descuento = 10;
            totalMatricula = matricula + (matricula * descuento / 100);
        }

        return totalMatricula;

    }

    float costoLaboratorio() {
        this.TotalLab = this.ValorLab * this.horasLab;
        return this.TotalLab;
    }

    float costoSeguro() {
        costoMatricula();
        costoDescuento();
        seguroMedico = totalMatricula * 1 / 100;
        return seguroMedico;
    }

    float Total() {
        costoSeguro();
        costoLaboratorio();
        return totalMatricula + seguroMedico + TotalLab;
    }

}
