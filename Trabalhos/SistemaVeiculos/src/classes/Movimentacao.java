package classes;

import java.util.ArrayList;

public class Movimentacao {
    
    public static ArrayList<Movimentacao> vetMov = new ArrayList<>();
    
    private String nomeMotorista;
    private String placaVeiculo;
    private String marca;
    private String modelo;
    private double KmInicial;
    private double KmFinal;
    private String data;

    public Movimentacao() {
        
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
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

    public double getKmInicial() {
        return KmInicial;
    }

    public void setKmInicial(double KmInicial) {
        this.KmInicial = KmInicial;
    }

    public double getKmFinal() {
        return KmFinal;
    }

    public void setKmFinal(double KmFinal) {
        this.KmFinal = KmFinal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}