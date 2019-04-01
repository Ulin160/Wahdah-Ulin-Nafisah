import javax.swing.*;
import java.awt.*;

public class Aplikasi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Selamat Datang");
        frame.setSize(300, 300);

        frame.setLayout(new BorderLayout());

        JLabel lblNama = new JLabel();
        lblNama.setText("Wahdah Ulin Nafisah");
        //frame.add(lblNama, BorderLayout.WEST);
        JLabel lblNim = new JLabel();
        lblNim.setText("17090019");

        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.SOUTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblNama);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2,1));
        frame.add(eastPanel, BorderLayout.EAST);
        eastPanel.add(lblNim);

        frame.setVisible(true);
    }

}