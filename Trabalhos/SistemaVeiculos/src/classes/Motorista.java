package classes;

import java.util.ArrayList;

public class Motorista {
    
    public static ArrayList<Motorista> vetMot = new ArrayList<>();
    
    private String matricula;
    private String nome;
    private String correcaoVisual;
    private String valHabilitacao;
    private char tipoCNH;

    public Motorista() {
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorrecaoVisual() {
        return correcaoVisual;
    }

    public void setCorrecaoVisual(String correcaoVisual) {
        this.correcaoVisual = correcaoVisual;
    }

    public String getValHabilitacao() {
        return valHabilitacao;
    }

    public void setValHabilitacao(String valHabilitacao) {
        this.valHabilitacao = valHabilitacao;
    }

    public char getTipoCNH() {
        return tipoCNH;
    }

    public void setTipoCNH(char tipoCNH) {
        this.tipoCNH = tipoCNH;
    }
    
}