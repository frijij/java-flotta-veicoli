package lessons.java.flotta;

public class Automobile extends Veicolo{
    /*
    Le automobili hanno un campo per indicare il numero di porte
     */

    // ATTRIBUTI
    private int numeroPorte;

    // COSTRUTTORI
        public Automobile(int numeroTarga, int annoImmatricolazione, int numeroPorte) {
        super(numeroTarga, annoImmatricolazione);
        this.numeroPorte=numeroPorte;
    }

    // GETTER E SETTER

    public int getNumeroPorte() {
        return numeroPorte;
    }

    // METODI
}
