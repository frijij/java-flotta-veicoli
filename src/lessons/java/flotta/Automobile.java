package lessons.java.flotta;

public class Automobile extends Veicolo{
    /*
    Le automobili hanno un campo per indicare il numero di porte
     */

    // ATTRIBUTI
    private int numeroPorte;

    // COSTRUTTORI
        public Automobile(String numeroTarga, int annoImmatricolazione, int numeroPorte) {
        super(numeroTarga, annoImmatricolazione);
        this.numeroPorte=numeroPorte;
    }

    // GETTER E SETTER

    public int getNumeroPorte() {
        return numeroPorte;
    }

    // METODI

    @Override
    public String toString() {
        return "Automobile{" + "Targa: " + getNumeroTarga() + "; Anno di immatricolazione: " + getAnnoImmatricolazione() +
                "; Porte: " + numeroPorte +
                '}';
    }
}
