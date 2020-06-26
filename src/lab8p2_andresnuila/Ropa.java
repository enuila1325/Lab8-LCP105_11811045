/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_andresnuila;

import java.awt.Color;

public class Ropa extends Objeto{

    private String talla;
    private String tipoTela;
    private String pais;

    public Ropa() {
    }

    public Ropa(String talla, String tipoTela, String pais, Color color, String desc, String marca, String tam, String calidad, String personaIng) {
        super(color, desc, marca, tam, calidad, personaIng);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.pais = pais;
    }

    

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipoTela=" + tipoTela + ", pais=" + pais + '}';
    }
    
    
    
}
