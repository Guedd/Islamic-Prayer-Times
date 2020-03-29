import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Test {

public Test(){

    JFrame f=new JFrame("ACCEUIL");
    f.setSize(830,570);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setLocationRelativeTo(null);
    f.setResizable(false);

    Container c=f.getContentPane();
    c.setBackground(new Color(255,226,168));

    c.setLayout(null);
    JLabel ImageLabel = new JLabel();
    ImageLabel.setBounds(190,0,850,700);
    ImageLabel.setIcon(new ImageIcon(new ImageIcon("img/2.jpg").getImage().getScaledInstance(800, 600, Image.SCALE_FAST)));

    JLabel TITREapp=new JLabel("Prière");
    TITREapp.setBounds(550,50,830,50);
    TITREapp.setForeground( Color.BLACK);
    TITREapp.setFont(new Font("Curlz MT",Font.BOLD,50));



    JButton buttonAwkat=new JButton("");
    buttonAwkat.setToolTipText("اوقات الصلاة");
    buttonAwkat.setBounds(0,0,180, 180);
    buttonAwkat.setIcon(new ImageIcon(new ImageIcon("img/17.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));

    buttonAwkat.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();
            new Salat();

        }
    });


    JButton buttonAdkatr=new jbutton("");
    buttonAdkatr.setToolTipText("اذكار الصلاة ");
    buttonAdkatr.setBounds(180,0,180, 180);
    buttonAdkatr.setIcon(new ImageIcon(new ImageIcon("img/13.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));

    buttonAdkatr.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();
            new Adkar();

        }
    });



    JButton buttonCoron=new jbutton("");
    buttonCoron.setToolTipText(" قِراءة القرآن الكريم");
    buttonCoron.setBounds(0,180,180, 180);
    buttonCoron.setIcon(new ImageIcon(new ImageIcon("img/9.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));

    buttonCoron.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();

            new Coron();


        }
    });



    JButton buttonCalendrier=new jbutton("");
    buttonCalendrier.setBounds(180,180,180, 180);
    buttonCalendrier.setToolTipText("Calendrier hidjri");
    buttonCalendrier.setIcon(new ImageIcon(new ImageIcon("img/21.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));

    buttonCalendrier.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();
            new Calendrier();

        }
    });


    JButton buttonWodo2=new jbutton("");
    buttonWodo2.setBounds(0,360,180, 180);
    buttonWodo2.setToolTipText("كيفيّة الوضوء الصّحيح");
    buttonWodo2.setIcon(new ImageIcon(new ImageIcon("img/23.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));
    buttonWodo2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();
            new Wodo2();

        }
    });


    JButton buttonZakat=new jbutton("");
    buttonZakat.setBounds(180,360,180, 180);
    buttonZakat.setToolTipText("كيف أحسب نصاب زكاة المال");

    buttonZakat.setIcon(new ImageIcon(new ImageIcon("img/8.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_FAST)));

    buttonZakat.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.dispose();
            new Zakat();



        }
    });





    c.add(buttonAwkat);
    c.add(buttonAdkatr);
    c.add(buttonCoron);
    c.add(buttonZakat);
    c.add(buttonCalendrier);
    c.add(buttonWodo2);
    c.add(TITREapp);
    c.add(ImageLabel);


    f.setVisible(true);
}

   // public static void main(String[] args) {
        new Test();
    }

}

*/


