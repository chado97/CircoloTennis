package view.FinestraMain;

import model.Corso;
import model.Maestro;
import model.Modelli.Data;
import view.FinestraIncasso.FinestraIncasso;
import view.FinestraInfoCorso.FinestraInfoCorso;
import view.FinestraModificaCorso.FinestraModificaCorso;
import view.FinestraRegistrazione.FinRegPartecipante;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Chado on 01/04/2016.
 */
public class FinestraMain extends JFrame {
    private JPanel rootPanel;
    private JPanel pnlCenter;
    private JPanel pnlSX; //cambiare nome
    private JButton visualizzaInformazioniDelCorsoButton;
    private JButton registraPartecipantiButton;
    private JButton modificaPartecipantiButton;
    private JButton visualizzaIncassoButton;

    public FinestraMain(String title, int larghezza, int altezza) {
        //setup iniziale finestra
        super(title);
        this.setContentPane(new FinestraMain().rootPanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(larghezza, altezza);
        this.setLocationRelativeTo(null);
        //this.setPosizioneCentro();
        this.setVisible(true);
        this.setResizable(false);
    }

    public FinestraMain() {

        settaListenerTastiFinestre();






//        Circolo mainCircolo = new Circolo();
    }

    private void settaListenerTastiFinestre() {
        registraPartecipantiButton.addActionListener(e -> {
            FinRegPartecipante finRegPartecipante=new FinRegPartecipante("Registra Partecipante",800,400);
            finRegPartecipante.setVisible(true);

        });

        modificaPartecipantiButton.addActionListener(e -> {
            FinestraModificaCorso finestra=new FinestraModificaCorso();
            finestra.setVisible(true);
        });

        visualizzaInformazioniDelCorsoButton.addActionListener(e -> {
            FinestraInfoCorso finestra=new FinestraInfoCorso();
            finestra.setVisible(true);
        });

        visualizzaIncassoButton.addActionListener(e -> {
            FinestraIncasso finestra=new FinestraIncasso();
            finestra.setVisible(true);
        });
    }

    public static void main(String[] args) throws Exception {
        //main
        FinestraMain f = new FinestraMain("Circolo Tennis di Chadivlady", 450, 200);
    }
}

