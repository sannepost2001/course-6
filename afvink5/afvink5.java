package afvink5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;

public class afvink5 extends JFrame {

    private JTextArea lijst1 = new JTextArea();
    private JTextArea lijst2 = new JTextArea();
    private JTextArea lijst3 = new JTextArea();

    private JTextArea vergeleken = new JTextArea("", 20, 20);

    private JButton analyse = new JButton("Calculate");

    private String[] choices = {"compare all", "compare 1 and 2", "compare 2 and 3", "compare 1 and 3"};

    private JComboBox<String> comboBox;

    public static void main(String[] args) {
        afvink5 frame = new afvink5();
        frame.setSize(725, 375);
        frame.createGUI();
        frame.setTitle("Translator");
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(null);

        lijst1.setBounds(25, 25, 200, 100);
        window.add(lijst1);

        lijst2.setBounds(250, 25, 200, 100);
        window.add(lijst2);

        lijst3.setBounds(475, 25, 200, 100);
        window.add(lijst3);

        vergeleken.setBounds(25, 200, 650, 100);
        window.add(vergeleken);

        analyse.setBounds(475, 150, 200, 20);
        window.add(analyse);
        analyse.addActionListener(new Analyse());

        comboBox = new JComboBox<String>(choices);
        comboBox.setBounds(25, 150, 200, 20);
        window.add(comboBox);
    }

    class Analyse implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("analyseer");
            String[] setString1 = lijst1.getText().replaceAll("(?m)^[ \t]*\r?\n", "").split("\n");
            String[] setString2 = lijst2.getText().replaceAll("(?m)^[ \t]*\r?\n", "").split("\n");
            String[] setString3 = lijst3.getText().replaceAll("(?m)^[ \t]*\r?\n", "").split("\n");

            HashSet<String> box1 = new HashSet<>(Arrays.asList(setString1));
            HashSet<String> box2 = new HashSet<>(Arrays.asList(setString2));
            HashSet<String> box3 = new HashSet<>(Arrays.asList(setString3));

            if (comboBox.getSelectedItem().toString().equals("compare all")) {
                HashSet<String> common1and2and3 = new HashSet<String>(box1);
                common1and2and3.retainAll(box2);
                common1and2and3.retainAll(box3);
                vergeleken.setText(String.valueOf(common1and2and3));
            }
            else if (comboBox.getSelectedItem().toString().equals("compare 1 and 2")) {
                HashSet<String> common1and2 = new HashSet<String>(box1);
                common1and2.retainAll(box2);
                vergeleken.setText(String.valueOf(common1and2));
            }
            else if (comboBox.getSelectedItem().toString().equals("compare 2 and 3")) {
                HashSet<String> common2and3 = new HashSet<String>(box2);
                common2and3.retainAll(box3);
                vergeleken.setText(String.valueOf(common2and3));
            }
            else if (comboBox.getSelectedItem().toString().equals("compare 1 and 3")) {
                HashSet<String> common1and3 = new HashSet<String>(box1);
                common1and3.retainAll(box3);
                vergeleken.setText(String.valueOf(common1and3));
            }

        }
    }
}
