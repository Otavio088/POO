package classes;

import java.util.ArrayList;
public class DadosProduto {
    
    //vetor dinamico sem limite de tamanho
    /*public*/ static ArrayList<DadosProduto> vetProd = new ArrayList<>();
    
    //atributos ou variaveis de instancias
    private int cod;
    private String tipo;
    private double precUnit;
    private String desc;
    private int qtd;
    
    //construtor vazio
    public DadosProduto() {
        
    }

    //metodos de acesso: getters e setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecUnit() {
        return precUnit;
    }

    public void setPrecUnit(double precUnit) {
        this.precUnit = precUnit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


}