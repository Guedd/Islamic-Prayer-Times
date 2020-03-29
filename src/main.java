
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import java.awt.*;
import javax.swing.*;

public class main {

    private static JFrame frame = new JFrame();
    private panel main_p = new panel();

    private void setFrame(){
        frame.setMinimumSize(new Dimension(700, 350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Center the window in the screen;
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(main_p);

        //pack method is to establish a frame size explicitly by calling setSize or setBounds
        frame.pack();
    }

    public static void go( JPanel current, JPanel next){
        SwingUtilities.invokeLater(()->{
            frame.remove(current);
            frame.add(next);
            frame.invalidate();
            frame.revalidate();
        });
    }
    public static void main(String[] args) {

        main setup = new main();
        setup.setFrame();

    }
}
