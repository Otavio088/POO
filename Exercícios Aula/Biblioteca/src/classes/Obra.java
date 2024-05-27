package classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Obra extends Livro {
    private String nomeObra;
    private String nomeAutor;
    private int nPaginas;

    public static ArrayList<Obra> listaLivros = new ArrayList<Obra>();
    
    public Obra(String nomeObra, String nomeAutor, int nPaginas, String Area, String Editora) {
        super(Area, Editora);
        this.nomeObra = nomeObra;
        this.nomeAutor = nomeAutor;
        this.nPaginas = nPaginas;
    }

    public Obra() {
        super();
    }
    
    

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    public static void incluirObra(Obra novaObraCadastrada) {
        listaLivros.add(novaObraCadastrada);
        
        JOptionPane.showMessageDialog(null,"Inclusão realizada com sucesso",
               "Cadastro de Conta",1);
    }
    
    public static int buscarObra(String autorBuscado, DefaultTableModel modelo, int qtd) {
        for (Obra l : listaLivros) {
            if (l.getNomeAutor().equalsIgnoreCase(autorBuscado)) {
                qtd = qtd + 1;
                modelo.addRow(new Object[]{
                    l.getNomeObra(),
                    l.getCodCatagolacao(),
                    l.getArea()
                });
            }
        }
        
        return qtd;
    }
    
    public static void buscarObra(String obraBuscada, DefaultTableModel modelo) {
        for (Obra l : listaLivros) {
            if (l.getNomeObra().equalsIgnoreCase(obraBuscada)) {
                modelo.addRow(new Object[]{
                    l.getCodCatagolacao(),
                    l.getArea(),
                    l.getEditora(),
                    l.getNomeAutor(),
                    l.getnPaginas()
                });
            }
        }
    }
    
}