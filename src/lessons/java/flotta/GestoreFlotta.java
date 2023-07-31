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
/*
public int contaVeicoli(Class tipo){
        int conteggio = 0;
        for (Veicolo veicolo:veicoli) {
            String tipoVeicolo = veicolo.getClass().getName();
            if (tipoVeicolo.equals(tipo)){
            conteggio +=1;
            }
        }
    return conteggio;
}
*/

    // trova veicoli in base alla targa

    public void trovaTarga(String numeroTarga){
        boolean trovato=false;
        for (Veicolo veicolo : veicoli){
            if (veicolo.getNumeroTarga() == numeroTarga){
                trovato = true;
                System.out.println("La targa inserita corrisponde al seguente veicolo: " + veicolo);
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "GestoreFlotta{" +
                "veicoli=" + veicoli +
                '}';
    }
}

