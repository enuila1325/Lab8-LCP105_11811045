/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_andresnuila;

public class PersonalGeneral extends Persona{
    private String ocupacion;
    private String horario;
    private int tiempotrabajo;
    private double sueldo;

    public PersonalGeneral() {
    }

    public PersonalGeneral(String ocupacion, String horario, int tiempotrabajo, double sueldo, int id, String nombre, int edad, String sexo, String estcivil, double altura, int peso) {
        super(id, nombre, edad, sexo, estcivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempotrabajo = tiempotrabajo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempotrabajo() {
        return tiempotrabajo;
    }

    public void setTiempotrabajo(int tiempotrabajo) {
        this.tiempotrabajo = tiempotrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "PersonalGeneral{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempotrabajo=" + tiempotrabajo + ", sueldo=" + sueldo + '}';
    }
    
    
}