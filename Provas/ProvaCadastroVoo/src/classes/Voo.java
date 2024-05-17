package classes;

import java.util.ArrayList;

public class Voo {
    private String numVoo;
    private String origemVoo;
    private String destinoVoo;
    private int numLugares;
    
    public static ArrayList<Voo> listaVoos = new ArrayList<Voo>();

    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }
    
    public String getOrigemVoo() {
        return origemVoo;
    }

    public void setOrigemVoo(String origemVoo) {
        this.origemVoo = origemVoo;
    }

    public String getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(String destinoVoo) {
        this.destinoVoo = destinoVoo;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }
}
