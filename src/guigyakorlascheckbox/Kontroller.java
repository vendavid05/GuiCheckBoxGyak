
package guigyakorlascheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;


public class Kontroller {
    private Nezet nezet;

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;
        
        JCheckBox chb = nezet.getChb();
        chb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kattintás event: actionPerformed");
            }
        });
    }
    
    
}
