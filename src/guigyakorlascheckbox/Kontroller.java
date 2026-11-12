
package guigyakorlascheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class Kontroller {
    private Nezet nezet;

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;
        
        JCheckBox chb = nezet.getChb();
        JTextField txt = nezet.getTxt();
        chb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Kattintas");
            }
        });
    }
    
    
}
