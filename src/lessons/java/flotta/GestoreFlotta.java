package lessons.java.flotta;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GestoreFlotta {
        /*
        La classe GestoreFlotta deve permettere di:
        aggiungere nuovi veicoli alla flotta
        contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
        trovare un veicolo specifico tramite il numero di targa
         */

    //ATTRIBUTI
    List<Veicolo> veicoli;

    // COSTRUTTORI
    public GestoreFlotta(){
    veicoli= new ArrayList<>();
    }
    public List<Veicolo> getVeicoli() {
        return veicoli;
    }

    // METODI
    // aggiungere nuovi veicoli alla flotta
    public void aggiungiVeicolo(Veicolo veicolo){
        veicoli.add(veicolo);
    }

    // contare veicoli per tipo all'interno della flotta

    public int contaVeicoli(String tipo){
        int conteggio = 0;
        for (Veicolo veicolo:veicoli) {
            if (tipo.equals(veicolo.getClass().getSimpleName())){
            conteggio ++;
            }
        }
    return conteggio;
    }

    // trova veicoli in base alla targa

    public Veicolo trovaTarga(String numeroTarga){
        boolean trovato=false;
        int contatore=0;
        Veicolo veicoloCercato=null;
        while (!trovato && contatore<veicoli.size()){
            if(numeroTarga.equals(veicoli.get(contatore).getNumeroTarga())){
                veicoloCercato = veicoli.get(contatore);
                trovato = true;
            }
            contatore++;
        }
        return veicoloCercato;
    }


    @Override
    public String toString() {
        return "GestoreFlotta{" +
                "veicoli=" + veicoli +
                '}';
    }
}

