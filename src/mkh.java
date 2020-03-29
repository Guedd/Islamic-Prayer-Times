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


public class mkh extends JPanel {
    mkh(){
        this.setLayout(null);
        setVisible(true);
        setBackground(MaterialColors.BLUE_GRAY_600);


        Label Fajr = new Label("Fajr");
        Fajr.setBounds(400, 80, 90, 20);
        Fajr.setVisible(true);
        Fajr.setBackground(MaterialColors.TEAL_300);
        add(Fajr);

        Label Duhr = new Label("Duhr: ");
        Duhr.setBounds(400, 130, 90, 20);
        Duhr.setVisible(true);
        Duhr.setBackground(MaterialColors.TEAL_300);
        add(Duhr);

        Label Asr = new Label("Asr: ");
        Asr.setBounds(400, 180, 90, 20);
        Asr.setVisible(true);
        Asr.setBackground(MaterialColors.TEAL_300);
        add(Asr);

        Label sunset = new Label("Maghreb: ");
        sunset.setBounds(400, 210, 90, 20);
        sunset.setVisible(true);
        sunset.setBackground(MaterialColors.TEAL_300);
        add(sunset);

        Label Isha = new Label("Isha");
        Isha.setBounds(400, 240, 90, 20);
        Isha.setVisible(true);
        Isha.setBackground(MaterialColors.TEAL_300);
        add(Isha);


        final Date[] now = new Date[1];
        Calendar cal = Calendar.getInstance();
        PrayTime prayers = new PrayTime();
        double latitude =  -36.190747;
        double longitude = -5.4042684;
        double timezone = -1;
        // Test Prayer times here


        prayers.setTimeFormat(prayers.Time12);
        prayers.setCalcMethod(prayers.Makkah);
        prayers.setAsrJuristic(prayers.Shafii);
        prayers.setAdjustHighLats(prayers.AngleBased);
        int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
        prayers.tune(offsets);

        Date nowd = new Date();

        cal.setTime(nowd);

        ArrayList<String> prayerTimes = prayers.getPrayerTimes(cal,
                latitude, longitude, timezone);
        ArrayList<String> prayerNames = prayers.getTimeNames();

        Fajr.setText("Fajr: "+ prayerTimes.get(0));
        Duhr.setText("Dhuhr: "+ prayerTimes.get(2));
        Asr.setText("Asr: "+ prayerTimes.get(3));
        sunset.setText("Maghreb: "+ prayerTimes.get(5));
        Isha.setText("Isha: "+ prayerTimes.get(6));

        for (int i = 0; i < prayerTimes.size(); i++) {
            System.out.println(prayerNames.get(i) + " - " + prayerTimes.get(i));
        }

        //create buttons
        JButton place = new JButton("Switch Place");
        place.setBounds(150, 120,150,20);
        place.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(place, MaterialColors.BLUE_GRAY_400);
        place.setHorizontalAlignment(SwingConstants.CENTER);
        add(place);
        place.addActionListener(e -> main.go(this,new places()));

        JButton date = new JButton("Choose date");
        date.setBounds(150, 150,150,20);
        date.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(date, MaterialColors.BLUE_GRAY_400);
        date.setHorizontalAlignment(SwingConstants.CENTER);
        add(date);
        date.addActionListener(e -> main.go(this,new dates()));


        date.addActionListener(e -> main.go(this,new mtds()));
        JButton mtd = new JButton("Met");
        mtd.setBounds(150, 180,150,20);
        mtd.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(date, MaterialColors.BLUE_GRAY_400);
        mtd.setHorizontalAlignment(SwingConstants.CENTER);
        add(mtd);
        mtd.addActionListener(e -> main.go(this,new mtds()));
    }
}


