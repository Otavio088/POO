package classes;

public class Livro {
    private int codCatagolacao;
    private String Area;
    private String Editora;
    
    public Livro(String Area, String Editora) {
        this.codCatagolacao = (int) (Math.random() * 1000);
        this.Area = Area;
        this.Editora = Editora;
    }

    public Livro() {
    }
    
    public int getCodCatagolacao() {
        return codCatagolacao;
    }

    public void setCodCatagolacao(int codCatagolacao) {
        this.codCatagolacao = codCatagolacao;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }
    
}