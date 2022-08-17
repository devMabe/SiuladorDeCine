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
public class CompraPeli {
    private String id;
    private String nombre;
    private int cantidad;
    private String fechaPeli;
    private String horaPeli;
    private String tipoSala;
    private int tipoPago; 
    private double totalPagar;
    private double totalPagado;
    private double valorPeli;
    private double incremento;
    private String tipoCompra;
    private Tarjeta[] tarjeta;

    public CompraPeli() {
    }

    public double getValorPeli() {
        return valorPeli;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setValorPeli(double valorPeli) {
        this.valorPeli = valorPeli;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    public void setFechaPeli(String fechaPeli) {
        this.fechaPeli = fechaPeli;
    }

    public void setHoraPeli(String horaPeli) {
        this.horaPeli = horaPeli;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public String getFechaPeli() {
        return fechaPeli;
    }

    public String getHoraPeli() {
        return horaPeli;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public int getTipoPago() {
        return tipoPago;
    }
    

    

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public Tarjeta[] getTarjeta() {
        return tarjeta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public void setTarjeta(Tarjeta[] tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
