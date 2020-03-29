import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.jdesktop.swingx.JXDatePicker;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialColors;


public class places extends JPanel {
    places(){
        this.setLayout(null);
        setVisible(true);
        setBackground(MaterialColors.BLUE_GRAY_600);

        Label Fajr = new Label("Fajr");
        Fajr.setBounds(400, 80, 90, 20);
        Fajr.setVisible(true);
        Fajr.setBackground(MaterialColors.TEAL_300);
        add(Fajr);

        Label Duhr = new Label("Duhr: ");
        Duhr.setBounds(400, 120, 90, 20);
        Duhr.setVisible(true);
        Duhr.setBackground(MaterialColors.TEAL_300);
        add(Duhr);

        Label Asr = new Label("Asr: ");
        Asr.setBounds(400, 160, 90, 20);
        Asr.setVisible(true);
        Asr.setBackground(MaterialColors.TEAL_300);
        add(Asr);

        Label sunset = new Label("Maghreb: ");
        sunset.setBounds(400, 200, 90, 20);
        sunset.setVisible(true);
        sunset.setBackground(MaterialColors.TEAL_300);
        add(sunset);

        Label Isha = new Label("Isha");
        Isha.setBounds(400, 240, 90, 20);
        Isha.setVisible(true);
        Isha.setBackground(MaterialColors.TEAL_300);
        add(Isha);

        JLabel labLongitu=new JLabel("Longitude : ");
        labLongitu.setBounds(10,110,90,25);
        labLongitu.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(labLongitu, MaterialColors.BLUE_GRAY_400);
        labLongitu.setHorizontalAlignment(SwingConstants.CENTER);
        add(labLongitu);


        JTextField LongituTextField = new JTextField();
        LongituTextField.setBounds(80, 110, 90, 20);
        LongituTextField.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(LongituTextField, MaterialColors.BLUE_GRAY_400);
        LongituTextField.setHorizontalAlignment(SwingConstants.CENTER);
        add(LongituTextField);

        JLabel labLatitu=new JLabel("Latitude  : ");
        labLatitu.setBounds(10,150,90,25);
        labLatitu.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(labLatitu, MaterialColors.BLUE_GRAY_400);
        labLatitu.setHorizontalAlignment(SwingConstants.CENTER);
        add(labLatitu);

        JTextField LatituTextField = new JTextField();
        LatituTextField.setBounds(80, 150, 90, 20);
        LatituTextField.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(LatituTextField, MaterialColors.BLUE_GRAY_400);
        LatituTextField.setHorizontalAlignment(SwingConstants.CENTER);
        add(LatituTextField);

        final Date[] now = new Date[1];
        Calendar cal = Calendar.getInstance();
        PrayTime prayers = new PrayTime();
        final Double[] latitude = {0.0};
        final Double[] longitude = {0.0};
        final double[] timezone = {-1};

        //create buttons
        JButton calcul = new JButton("Calcul");
        calcul.setBounds(40, 180,90,20);
        calcul.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(calcul, MaterialColors.BLUE_GRAY_400);
        calcul.setHorizontalAlignment(SwingConstants.CENTER);
        add(calcul);
        calcul.addActionListener(e -> {

            System.out.println(LongituTextField.getText());
            System.out.println(LatituTextField.getText());
            latitude[0] = Double.valueOf(LatituTextField.getText());
            longitude[0] = Double.valueOf(LongituTextField.getText());
            timezone[0] = 1;
            // Test Prayer times here


            prayers.setTimeFormat(prayers.Time12);
            prayers.setCalcMethod(prayers.MWL);
            prayers.setAsrJuristic(prayers.Shafii);
            prayers.setAdjustHighLats(prayers.AngleBased);
            int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
            prayers.tune(offsets);

            Date nowd = new Date();

            cal.setTime(nowd);

            ArrayList<String> prayerTimes = prayers.getPrayerTimes(cal,
                    latitude[0], longitude[0], timezone[0]);
            ArrayList<String> prayerNames = prayers.getTimeNames();

            Fajr.setText("Fajr: "+ prayerTimes.get(0));
            Duhr.setText("Dhuhr: "+ prayerTimes.get(2));
            Asr.setText("Asr: "+ prayerTimes.get(3));
            sunset.setText("Maghreb: "+ prayerTimes.get(5));
            Isha.setText("Isha: "+ prayerTimes.get(6));

            for (int i = 0; i < prayerTimes.size(); i++) {
                System.out.println(prayerNames.get(i) + " - " + prayerTimes.get(i));
            }
        });

        JButton StepBack = new JButton("Back");
        StepBack.setBounds(540, 255, 80, 30);
        StepBack.setForeground(MaterialColors.BLUE_A400);
        StepBack.setBackground(MaterialColors.CYAN_200);
        MaterialUIMovement.add(StepBack, MaterialColors.RED_200);
        StepBack.addActionListener(e -> main.go(this, new panel()));
        add(StepBack);
    }
}


