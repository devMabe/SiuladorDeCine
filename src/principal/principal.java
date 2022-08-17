/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import formularios.Catalogo;
import formularios.CompraPeli;
import java.util.ArrayList;
import formularios.Ranking;

public class principal {
    public static ArrayList<Pelicula> peliculas = new ArrayList();
    public static ArrayList<CompraPeli> compras = new ArrayList();
    public static ArrayList<Ranking> ranking = new ArrayList();
    public static String pla ="";
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        cat.setVisible(true);
    }
}
