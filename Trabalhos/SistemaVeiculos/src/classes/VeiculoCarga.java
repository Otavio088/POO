package classes;

import java.util.ArrayList;

public class VeiculoCarga {
    
    public static ArrayList<VeiculoCarga> vetCarga = new ArrayList<>();
    
    private String chassi;
    private String placa;
    private String marca;
    private String modelo;
    private String revendedor;
    private String endRevendedor;
    private String telRevendedor;
    private double cargMaxima;

    public VeiculoCarga() {
        
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public String getEndRevendedor() {
        return endRevendedor;
    }

    public void setEndRevendedor(String endRevendedor) {
        this.endRevendedor = endRevendedor;
    }

    public String getTelRevendedor() {
        return telRevendedor;
    }

    public void setTelRevendedor(String telRevendedor) {
        this.telRevendedor = telRevendedor;
    }

    public double getCargMaxima() {
        return cargMaxima;
    }

    public void setCargMaxima(double velMaxima) {
        this.cargMaxima = velMaxima;
    }
    
}
