
package guigyakorlascheckbox;


public class Program {


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nezet nezet = new Nezet();
                Kontroller vezerlo = new Kontroller(new Nezet());
                

            }
        });
    }

    
}
