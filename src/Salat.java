/*import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Salat {
    JLabel time_FADJR=new JLabel("");
    JLabel timeidohr2=new JLabel("");
    JLabel Time_assar=new JLabel(" ");
    JLabel Time_mghrib=new JLabel(" ");
    JLabel Time_icha=new JLabel(" ");
    Date now;
    Calendar cal = Calendar.getInstance();
    PrayTime prayers = new PrayTime();
    double latitude;
    double longitude;
    double timezone;


    public Salat(){
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
        ImageLabel.setBounds(100,50,830,570);
        ImageLabel.setIcon(new ImageIcon(new ImageIcon("img/14.png").getImage().getScaledInstance(600, 350, Image.SCALE_FAST)));

        JLabel labDate=new JLabel("date : ");
        labDate.setBounds(10,20,800,50);
        labDate.setFont(new Font("Curlz MT",Font.BOLD,30));
        labDate.setForeground(new Color(130,0,65));

        JXDatePicker datePicker = new JXDatePicker();
        datePicker.setDate(new Date());
        datePicker.setFormats("dd-MM-yyyy");
        datePicker.setBounds(100, 20, 200, 40);
        datePicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(datePicker.getDate());
                now=datePicker.getDate();
                cal.setTime(now);

                ArrayList<String> prayerTimes = prayers.getPrayerTimes(cal,
                        latitude, longitude, timezone);
                ArrayList<String> prayerNames = prayers.getTimeNames();

                time_FADJR.setText(prayerTimes.get(0));
                timeidohr2.setText(prayerTimes.get(2));
                Time_assar.setText(prayerTimes.get(3));
                Time_mghrib.setText(prayerTimes.get(5));
                Time_icha.setText(prayerTimes.get(6));
            }
        });


        JLabel labLatitu=new JLabel("Latitude  : ");
        labLatitu.setBounds(10,60,800,50);
        labLatitu.setFont(new Font("Curlz MT",Font.BOLD,30));
        labLatitu.setForeground(new Color(130,0,65));

        JTextField LatituTextField = new JTextField();
        LatituTextField.setBounds(150, 70, 200, 40);



        JLabel labLongitu=new JLabel("Longitude : ");
        labLongitu.setBounds(10,110,800,50);
        labLongitu.setFont(new Font("Curlz MT",Font.BOLD,30));
        labLongitu.setForeground(new Color(130,0,65));

        JTextField LongituTextField = new JTextField();
        LongituTextField.setBounds(200, 120, 200, 40);



        JButton bouttonCalcule= new JButton("calculer");
        bouttonCalcule.setBounds(670,140,140,50);
        bouttonCalcule.setToolTipText("appuier pour calculer ");
        bouttonCalcule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LongituTextField.getText());
                System.out.println(LatituTextField.getText());
                latitude = Double.valueOf(LatituTextField.getText());
                longitude = Double.valueOf(LongituTextField.getText());
                 timezone= 1;
                // Test Prayer times here


                prayers.setTimeFormat(prayers.Time12);
                prayers.setCalcMethod(prayers.MWL);
                prayers.setAsrJuristic(prayers.Shafii);
                prayers.setAdjustHighLats(prayers.AngleBased);
                int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
                prayers.tune(offsets);

                now = new Date();

                cal.setTime(now);

                ArrayList<String> prayerTimes = prayers.getPrayerTimes(cal,
                        latitude, longitude, timezone);
                ArrayList<String> prayerNames = prayers.getTimeNames();

                time_FADJR.setText(prayerTimes.get(0));
                timeidohr2.setText(prayerTimes.get(2));
                Time_assar.setText(prayerTimes.get(3));
                Time_mghrib.setText(prayerTimes.get(5));
                Time_icha.setText(prayerTimes.get(6));

                for (int i = 0; i < prayerTimes.size(); i++) {
                    System.out.println(prayerNames.get(i) + " - " + prayerTimes.get(i));
                }

            }
        });

        JLabel labFADJR=new JLabel("FADJR : ");
        labFADJR.setBounds(20,200,800,50);
        labFADJR.setFont(new Font("Curlz MT",Font.BOLD,30));
        labFADJR.setForeground(new Color(130,0,65));

        JLabel Imagecloche = new JLabel();
        Imagecloche.setBounds(700,220,20,20);
        Imagecloche.setIcon(new ImageIcon(new ImageIcon("img/39.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST)));



        time_FADJR.setBounds(550,200,800,50);
        time_FADJR.setFont(new Font("Curlz MT",Font.BOLD,30));
        time_FADJR.setForeground(new Color(130,0,65));

        JLabel Imagecloche1 = new JLabel();
        Imagecloche1.setBounds(700,270,20,20);
        Imagecloche1.setIcon(new ImageIcon(new ImageIcon("img/39.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST)));


        JLabel labdohr=new JLabel("THOHR : ");
        labdohr.setBounds(20,250,800,50);
        labdohr.setFont(new Font("Curlz MT",Font.BOLD,30));
        labdohr.setForeground(new Color(130,0,65));

        timeidohr2.setBounds(550,250,800,50);
        timeidohr2.setFont(new Font("Curlz MT",Font.BOLD,30));
        timeidohr2.setForeground(new Color(130,0,65));



        JLabel labassar=new JLabel("ASSR : ");
        labassar.setBounds(20,300,800,50);
        labassar.setFont(new Font("Curlz MT",Font.BOLD,30));
        labassar.setForeground(new Color(130,0,65));

        JLabel Imagecloche2 = new JLabel();
        Imagecloche2.setBounds(700,320,20,20);
        Imagecloche2.setIcon(new ImageIcon(new ImageIcon("img/39.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST)));


        Time_assar.setBounds(550,300,800,50);
        Time_assar.setFont(new Font("Curlz MT",Font.BOLD,30));
        Time_assar.setForeground(new Color(130,0,65));


        JLabel labmghrib=new JLabel("MGHREB : ");
        labmghrib.setBounds(20,350,800,50);
        labmghrib.setFont(new Font("Curlz MT",Font.BOLD,30));
        labmghrib.setForeground(new Color(130,0,65));

        JLabel Imagecloche3 = new JLabel();
        Imagecloche3.setBounds(700,370,20,20);
        Imagecloche3.setIcon(new ImageIcon(new ImageIcon("img/39.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST)));

        Time_mghrib.setBounds(550,350,800,50);
        Time_mghrib.setFont(new Font("Curlz MT",Font.BOLD,30));
        Time_mghrib.setForeground(new Color(130,0,65));



        JLabel labicha2=new JLabel("ICHA : ");
        labicha2.setBounds(20,400,800,50);
        labicha2.setFont(new Font("Curlz MT",Font.BOLD,30));
        labicha2.setForeground(new Color(130,0,65));

        JLabel Imagecloche4 = new JLabel();
        Imagecloche4.setBounds(700,420,20,20);
        Imagecloche4.setIcon(new ImageIcon(new ImageIcon("img/39.png").getImage().getScaledInstance(20, 20, Image.SCALE_FAST)));


        Time_icha.setBounds(550,400,800,50);
        Time_icha.setFont(new Font("Curlz MT",Font.BOLD,30));
        Time_icha.setForeground(new Color(130,0,65));


        JLabel ReturnLABEL = new JLabel("Return");
        ReturnLABEL.setBounds(750, 500, 400, 50);;
        ReturnLABEL.setFont(new Font("Euphorigenic", Font.BOLD, 15));

        JButton BoutonReturn=new jbutton("");
        BoutonReturn.setToolTipText("return");
        BoutonReturn.setBounds(750,450,60,60);
        BoutonReturn.setIcon(new ImageIcon(new ImageIcon("img/64.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_FAST)));

        BoutonReturn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                new Test();
                f.dispose();

            }
        });


        c.add(labLatitu);
        c.add(labDate);
        c.add(labLongitu);
        c.add(datePicker);
        c.add(LatituTextField);
        c.add(LongituTextField);
        c.add(bouttonCalcule);
        c.add(labFADJR);
        c.add(labicha2);
        c.add(labmghrib);
        c.add(labassar);
        c.add(labdohr);
        c.add(time_FADJR);
        c.add(Time_icha);
        c.add(Time_mghrib);
        c.add(Time_assar);
        c.add(timeidohr2);
        c.add(ReturnLABEL);
        c.add(BoutonReturn);
        c.add(Imagecloche);
        c.add(Imagecloche1);
        c.add(Imagecloche2);
        c.add(Imagecloche3);
        c.add(Imagecloche4);
        c.add(ImageLabel);
        f.setVisible(true);



    }
}
*/