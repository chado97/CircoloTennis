package controller;

import Librerie.Util.UtilityMessages;
import model.Data.D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chado on 01/04/2016.
 * suck it chadi
 */
public class FinestraMain extends JFrame {
private JPanel rootPanel;
private JButton btnInfo;
private JButton btnRegistra;
private JButton btnScegliModifica;
private JButton btnIncasso;

//private static int finestreAperte;

private FinestraMain(String title, int larghezza, int altezza) {
	//setup iniziale finestra
	super(title);
	this.setContentPane(new FinestraMain().rootPanel);
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	this.pack();
	this.setSize(larghezza, altezza);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	this.setResizable(false);
}

private FinestraMain() {
	settaListenerTastiFinestre();
//        Circolo mainCircolo = new Circolo();
}

public static void main(String[] args) throws Exception {
	//main
//	D.assegnaFinestra(0,new FinestraMain("Circolo Tennis di Chadivlady", 450, 200));

	FinestraMain f0 = new FinestraMain("Circolo Tennis di Chadivlady", 450, 200);
}

private void settaListenerTastiFinestre() {
	btnRegistra.addActionListener(e ->
			apriFinestra(D.getkRegistra())
	);

	btnScegliModifica.addActionListener(e ->
			apriFinestra(D.getkScegli())
	);

	btnIncasso.addActionListener(e ->
			apriFinestra(D.getkIncasso())
	);
	btnInfo.addActionListener(e ->
			apriFinestra(D.getkInformazioni())
	);

}

private void apriFinestra(int indice) {


	System.out.println("Finestre aperte prima: "+D.finestreAperte());

	if (D.finestreAperte() > 0) {
		D.svuotaFinestre();
	}

	//in base all'indice datomi dal listener faccio aprire ogni finestra solo una volta
	if (indice == D.getkRegistra()) {
		//test se è già aperta
		if (!D.isFinestraAperta(indice)) {

			D.assegnaFinestra(D.getkRegistra(),
					new RegistraPartecipante("Registra Partecipante",
							900,
							400)
			);
		}
	} else if (indice == D.getkScegli()) {
		//test se è già aperta
		if (!D.isFinestraAperta(indice)) {
			if (D.isAllEmpty()) {
				UtilityMessages.creaDialogErrore("I corsi sono tutti vuoti! ", new Frame("Errore"));
			} else {

				D.assegnaFinestra(D.getkScegli(),new ScegliDaModificare("Modifica un partecipante",
						D.larghezzaScegliMod,
						D.altezzaScegliMod)
				);
			}
		}
	} else if (indice == D.getkIncasso()) {
//		test se è già aperta
		if (!D.isFinestraAperta(indice)) {
			D.assegnaFinestra(D.getkIncasso(), new Incasso("Incasso totale",400,250));
//			finestreAperte++;
		}
	} else if (indice == D.getkInformazioni()) {
		if (!D.isFinestraAperta(indice)) {
			D.assegnaFinestra(D.getkInformazioni(), new Informazioni("Informazioni sul circolo", 400, 250));

		}

	}
	System.out.println("Finestre aperte dopo: "+D.finestreAperte());
}

}

