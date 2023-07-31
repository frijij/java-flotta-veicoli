package lessons.java.flotta;
/*
le motociclette hanno un campo per indicare se sono dotate di cavalletto o meno
 */
public class Motocicletta extends Veicolo{
    // ATTRIBUTI
    private boolean conCavalletto;

    // COSTRUTTORI
    public Motocicletta(String numeroTarga, int annoImmatricolazione, boolean conCavalletto){
        super(numeroTarga,annoImmatricolazione);
        this.conCavalletto=conCavalletto;
    }
    // GETTER E SETTER

    public boolean isConCavalletto() {
        return conCavalletto;
    }

    // METODI

    @Override
    public String toString() {
        return "Motocicletta{" + "Targa: " + getNumeroTarga() + "; Anno di immatricolazione: " + getAnnoImmatricolazione() +
                "; Cavalletto: " + conCavalletto +
                '}';
    }
}
