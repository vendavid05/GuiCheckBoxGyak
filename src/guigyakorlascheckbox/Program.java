
package guigyakorlascheckbox;


public class Program {


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kontroller vezerlo = new Kontroller(new Nezet());
                
                new Nezet().setVisible(true);
            }
        });
    }

    
}
