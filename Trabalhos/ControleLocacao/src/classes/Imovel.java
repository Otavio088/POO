package classes;

import java.util.Objects;

public class Imovel {
    private Integer codigo;
    private String tipo;
    private Double aluguelbase;

    public Imovel(String tipo, Double aluguelbase) {
        this.codigo = (int) (Math.random() * 1000);
        System.out.println(this.codigo + "\n");
        for (int i = 0; i < TipoImovel.listaImoveis.size(); i++) {
            if (this.codigo.equals(TipoImovel.listaImoveis.get(i).getCodigo())) {
                this.codigo = (int) (Math.random() * 1000);
                i = 0;
            }
        }

        this.tipo = tipo;
        this.aluguelbase = aluguelbase;
    }
    
    public Imovel() {
    
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getAluguelbase() {
        return aluguelbase;
    }

    public void setAluguelbase(Double aluguelbase) {
        this.aluguelbase = aluguelbase;
    }   
}