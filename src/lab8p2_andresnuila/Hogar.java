/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_andresnuila;

import java.awt.Color;

public class Hogar extends Objeto{
    
    private String descLugar;
    private String instrucciones;
    private int tiempoGarantia;

    public Hogar() {
    }

    public Hogar(String descLugar, String instrucciones, int tiempoGarantia, Color color, String desc, String marca, String tam, String calidad, String personaIng) {
        super(color, desc, marca, tam, calidad, personaIng);
        this.descLugar = descLugar;
        this.instrucciones = instrucciones;
        this.tiempoGarantia = tiempoGarantia;
    }

    public String getDescLugar() {
        return descLugar;
    }

    public void setDescLugar(String descLugar) {
        this.descLugar = descLugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public String toString() {
        return "Hogar{" + "descLugar=" + descLugar + ", instrucciones=" + instrucciones + ", tiempoGarantia=" + tiempoGarantia + '}';
    }
    
    
}
