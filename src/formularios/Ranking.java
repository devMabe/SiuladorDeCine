/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Yeya
 */
public class Ranking {
    private String nombre;
    private String src;
    private int cantidad;

    public Ranking() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSrc() {
        return src;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSrc(String src) {
        this.src = src;
    }
    
}
