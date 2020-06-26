/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_andresnuila;

import java.util.ArrayList;

/**
 *
 * @author enuil
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String sexo;
    private String estcivil;
    private Double altura;
    private int peso;
    private ArrayList mensajes = new ArrayList();

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String sexo, String estcivil, double altura, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estcivil = estcivil;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(String estcivil) {
        this.estcivil = estcivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
