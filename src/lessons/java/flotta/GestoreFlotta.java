package lessons.java.flotta;

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
    List<Veicolo> veicoli= new ArrayList<>();

    public List<Veicolo> getVeicoli() {
        return veicoli;
    }

    // METODI
    // aggiungere nuovi veicoli alla flotta
    public void aggiungiVeicolo(Veicolo veicolo){
        veicoli.add(veicolo);
        System.out.println(veicoli);
    }

    // contare veicoli per tipo all'interno della flotta


    @Override
    public String toString() {
        return "GestoreFlotta{" +
                "veicoli=" + veicoli +
                '}';
    }
}

