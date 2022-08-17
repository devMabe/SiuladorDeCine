/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JRadioButton;

/**
 *
 * @author Yeya
 */
public class Pelicula {
    private String nombre;
    private String src;
    private JRadioButton rb;

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getSrc() {
        return src;
    }

    public JRadioButton getRb() {
        return rb;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setRb(JRadioButton rb) {
        this.rb = rb;
    }
    
    
}
