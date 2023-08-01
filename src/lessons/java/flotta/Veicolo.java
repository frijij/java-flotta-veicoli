package lessons.java.flotta;

public class Veicolo {
    /*
    Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
    Deve essere possibile visualizzare tutte le informazioni di ciascun tipo di veicolo.
     */

    // ATTRIBUTI
    private String numeroTarga;
    private int annoImmatricolazione;

    // COSTRUTTORI

    public Veicolo(String numeroTarga, int annoImmatricolazione) {
        this.numeroTarga = numeroTarga;
        this.annoImmatricolazione = annoImmatricolazione;
    }


    // GETTER E SETTER

    public String getNumeroTarga() {
        return numeroTarga;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    // METODI

}
