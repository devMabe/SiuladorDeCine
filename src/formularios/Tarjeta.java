/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.util.Calendar;

/**
 *
 * @author Yeya
 */
public class Tarjeta {
    private String tipo;
    private String numero;
    private String titular;
    private String cvv;
    private int dia;
    private int mes;
    private int anio;

    public Tarjeta() {
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public String getCvv() {
        return cvv;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    public Calendar getFecVen(){
        Calendar f = Calendar.getInstance();
        f.set(dia, mes, dia);
        return f;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
