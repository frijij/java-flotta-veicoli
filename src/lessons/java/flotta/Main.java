package lessons.java.flotta;

import java.util.LinkedList;
import java.util.List;

/*
Aggiungere un’altra classe Main, con il metodo main nel quale viene creata un’istanza di
GestoreFlotta e ne vengono testati tutti i metodi. Può essere fatto implementando un
menu interattivo usando lo Scanner oppure impostando direttamente nel codice i dati con cui
 costruire i vari oggetti.
 */
public class Main {
    public static void main(String[] args) {
        Automobile jeep = new Automobile ("gb760lw", 2021, 5);
        Motocicletta yamaha = new Motocicletta("dt2195",2010, true);
        Automobile panda= new Automobile("ct210jw", 2005, 5);
        GestoreFlotta gestore = new GestoreFlotta();
        gestore.aggiungiVeicolo(jeep);
        gestore.aggiungiVeicolo(yamaha);
        gestore.aggiungiVeicolo(panda);

        System.out.println("Questa è la tua flotta: " + gestore);

        gestore.trovaTarga("ct210jw");



    }
}
