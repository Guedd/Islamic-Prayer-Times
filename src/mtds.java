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


public class mtds extends JPanel {
    mtds(){
        this.setLayout(null);
        setVisible(true);
        setBackground(MaterialColors.BLUE_GRAY_600);




        //create buttons
        JButton uml = new JButton("UML");
        uml.setBounds(150, 120,150,20);
        uml.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(uml, MaterialColors.BLUE_GRAY_400);
        uml.setHorizontalAlignment(SwingConstants.CENTER);
        add(uml);
        uml.addActionListener(e -> main.go(this,new panel()));

        JButton isma = new JButton("ISMA");
        isma.setBounds(150, 150,150,20);
        isma.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(isma, MaterialColors.BLUE_GRAY_400);
        isma.setHorizontalAlignment(SwingConstants.CENTER);
        add(isma);
        isma.addActionListener(e -> main.go(this,new isma()));

        JButton egp = new JButton("Egypt");
        egp.setBounds(150, 180,150,20);
        egp.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(egp, MaterialColors.BLUE_GRAY_400);
        egp.setHorizontalAlignment(SwingConstants.CENTER);
        add(egp);
        egp.addActionListener(e -> main.go(this,new egp()));

        JButton mkh = new JButton("Makah");
        mkh.setBounds(150, 210,150,20);
        mkh.setBackground(MaterialColors.TEAL_300);
        MaterialUIMovement.add(mkh, MaterialColors.BLUE_GRAY_400);
        mkh.setHorizontalAlignment(SwingConstants.CENTER);
        add(mkh);
        mkh.addActionListener(e -> main.go(this,new mkh()));
    }
}


