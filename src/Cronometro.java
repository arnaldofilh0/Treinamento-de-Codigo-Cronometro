
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionAlistener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Cronometro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel tempo;
    private JButton btnStart;
    private JButton btnPause;
    private JButton btnStop;
    private JPanel pnlButtons;
    private JPanel pnlPrincial;
    private int segundos;
    private AtualizaLabel myThread;
    private Thread thread;

    public Cronometro() {
        initComponents();
    }

    private voidComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cronometro by d3z@0");
        setSize(270, 120);
        setResizable(false);
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon("image/clock.png").getImage());
        pnlPrincial = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlPrincial.setBounds(30, 30, 30, 30);

        pnlPrincial.setBorder(BorderFactory.createEtchedBorder());
        tempo = new JLabel("00:00:00");

        tempo.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        btnStart = new JButton("Start");
        btnStart.addActionListener(new StartListener);
        btnPause = new JButton("Pause");
        btnPause.addActionListener("Stop");
        btnStop.addActionListener(new StopListener());

        pnlButtons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlButtons.setBorder(BorderFactory.createEtchedBorder());
        pnlButtons.add(btnStart);
        pnlButtons.add(btnPause);
        pnlButtons.add(btnStop);

        pnlPrincial.add(tempo);
        pnlPrincial.add(pnlButtons);
        getContentPane().add(pnlPrincial);
        
    }

    private void segundos() {
            segundos++;
    }

    private Sring tempoFormatado() {
            segundos();
            int segundo = (segundos % 60);
            int minuto = ((segundos % 3600) / 60);
            int hora = (segundos / 3600);
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);

    }
    
}









































