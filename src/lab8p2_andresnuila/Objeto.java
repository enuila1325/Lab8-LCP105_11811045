/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_andresnuila;

import java.awt.Color;

public class Objeto {

    private Color color;
    private String desc;
    private String marca;
    private String tam;
    private String calidad;
    private String personaIng;

    public Objeto() {
    }

    public Objeto(Color color, String desc, String marca, String tam, String calidad, String personaIng) {
        this.color = color;
        this.desc = desc;
        this.marca = marca;
        this.tam = tam;
        this.calidad = calidad;
        this.personaIng = personaIng;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPersonaIng() {
        return personaIng;
    }

    public void setPersonaIng(String personaIng) {
        this.personaIng = personaIng;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", desc=" + desc + ", marca=" + marca + ", tam=" + tam + ", calidad=" + calidad + ", personaIng=" + personaIng + '}';
    }

}
