package model;

import java.util.LinkedList;

/**
 * Creato da Vlady il 17/03/2016.
 * in origine parte del progetto:
 * CircoloTennis
 */
public class Corso extends LinkedList<Partecipante> {

private Maestro maestro;
private String nome;
private double costo;

//indici
//0 = facile
//1 = intermedio
//2 = avanzato


//classe pronta
//corso contiene vari partecipanti

public Corso(Maestro maestro, String nomeCorso, double costoCorso) {
	this.maestro = maestro;
	this.nome = nomeCorso;
	this.costo = costoCorso;
}

public void aggiungiPartecipante(Partecipante partInAggiunta) {
	this.add(partInAggiunta);
}

public Maestro getMaestro() {
	return this.maestro;
}

public String getNomeCorso() {
	return this.nome;
}

public double getPrezzoCorso() {
	return this.costo;
}
}
