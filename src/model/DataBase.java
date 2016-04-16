package model;

import model.Modelli.Data;
import util.Random.RndNome;

/**
 * Created by Chado on 14/04/2016.
 */
public class DataBase  {

    private static String[] nomiCorsi = new String[3];

    private static Maestro[] maestri = new Maestro[3];

    private static Corso[] corsi = new Corso[3];

    private static boolean setupEffettuato=false;

    public DataBase() {
        setupIniziale();

    }

    private static void setupIniziale() {
        creaMaestri();
        creaCorsi();
        creaEtichetteNomi();

        System.out.println("Setup dati completato");
    }

    private static void creaEtichetteNomi() {
        nomiCorsi[0] = "Facile";
        nomiCorsi[1] = "Medio";
        nomiCorsi[2] = "Avanzato";
    }

    private static void creaCorsi() {
        corsi[0] = new Corso((maestri[0]), nomiCorsi[0], 50.35);
        corsi[1] = new Corso((maestri[1]), nomiCorsi[1], 65.75);
        corsi[2] = new Corso((maestri[2]), nomiCorsi[2], 90.99);
    }

    private static void creaMaestri() {
        maestri[0] = new Maestro(RndNome.get(), "Barbarossa", "025-112233", new Data());
        maestri[1] = new Maestro(RndNome.get(), "Minelli", "011-425698", new Data());
        maestri[2] = new Maestro(RndNome.get(), "Bortolotti", "051-124378", new Data());
    }

    public static void addPartecipante(int idCorso,Partecipante personaDaAggiungere) {
        //se non è stato fatto il setup
        if (!setupEffettuato) {
            setupIniziale();
            setupEffettuato = true;
        }
        corsi[idCorso].add(personaDaAggiungere);

    }

    public static String getNomeCorso(int idCorso) {
        return corsi[idCorso].getNome();
    }

//    public static String getNomeMaestroCorso


}
