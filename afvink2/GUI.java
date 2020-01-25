package afvink2;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GUI extends JPanel implements ActionListener, ChangeListener {
    private static final long serialVersionUID = 1L;
    private Timer     timer;
    private Board     board;
    private JButton   start;
    private JButton   clear;
    private JSlider   pred;
    private JComboBox<Pattern> figures;
    private JFrame    frame;
    private       int     iterNum   = 0;
    private final int     maxDelay  = 500;
    private       boolean running   = false;

    GUI(JFrame jf) {
        frame = jf;
        int initDelay = 100;
        timer = new Timer(initDelay, this);
        timer.stop();
    }

    void initialize(Container container) {
        container.setLayout(new BorderLayout());
        container.setSize(new Dimension(1024, 768));

        JPanel buttonPanel = new JPanel();

        start = new JButton("Start");
        start.setActionCommand("Start");
        start.setToolTipText("Starts clock");
        start.addActionListener(this);

        clear = new JButton("Clear");
        clear.setActionCommand("clear");
        clear.setToolTipText("Clears the board");
        clear.addActionListener(this);

        JButton add = new JButton("Add");
        add.setActionCommand("add");
        add.setToolTipText("Adds predefined pattern");
        add.addActionListener(this);

        figures = new JComboBox<>(Pattern.setPattern());
        figures.setToolTipText("Pattern choice");

        pred = new JSlider();
        pred.setMinimum(0);
        pred.setMaximum(maxDelay);
        pred.setToolTipText("Time speed");
        pred.addChangeListener(this);
        pred.setValue(maxDelay - timer.getDelay());

        buttonPanel.add(start);
        buttonPanel.add(clear);
        buttonPanel.add(figures);
        buttonPanel.add(add);
        buttonPanel.add(pred);

        board = new Board(1024, 768 - buttonPanel.getHeight());
        container.add(board, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(timer)) {
            iterNum++;
            frame.setTitle("Game of Life (" + Integer.toString(iterNum) + " iteration)");
            board.iteration();
        } else {
            String command = e.getActionCommand();
            switch (command) {
                case "Start":
                    if (!running) {
                        timer.start();
                        start.setText("Pause");
                    } else {
                        timer.stop();
                        start.setText("Start");
                    }
                    running = !running;
                    clear.setEnabled(true);

                    break;
                case "clear":
                    iterNum = 0;
                    timer.stop();
                    start.setEnabled(true);
                    board.clear();
                    frame.setTitle("Cellular Automata Toolbox");
                    break;
                case "add":
                    board.loadPattern((Pattern) Objects.requireNonNull(figures.getSelectedItem()));
                    break;
            }

        }
    }

    public void stateChanged(ChangeEvent e) {
        timer.setDelay(maxDelay - pred.getValue());
    }
}
