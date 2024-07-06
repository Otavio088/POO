package M;

public class Medicamento {
    private int cod;
    private String nome;
    private String validade; 
    private int qtde;

    public int getCod() {
        return cod;
    }

    public void setCod(int codigo) {
        this.cod = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtdEstoque) {
        this.qtde = qtdEstoque;
    }
    
}
