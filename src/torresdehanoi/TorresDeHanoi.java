package torresdehanoi;
import javax.swing.JOptionPane;

public class TorresDeHanoi {
    static int numeromovimientos = 0;
    public static void main(String[] args) {
        int numerodiscoshanoi;
        JOptionPane.showMessageDialog(null, "ESTE PROGRAMA FUE CREADO PARA RESOLVER LA TORRE DE HANOI");
        JOptionPane.showMessageDialog(null, "TORRE 1 = TORRE ORIGEN");
        JOptionPane.showMessageDialog(null, "TORRE 2 = TORRE AUXILIAR");
        JOptionPane.showMessageDialog(null, "TORRE 3 = TORRE DESTINO");
        
        JOptionPane.showMessageDialog(null, "DIGITE EL NUMERO DE DISCOS QUE TIENE TU TORRE");
        numerodiscoshanoi = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
        Hanoi(numerodiscoshanoi, "TORRE 1", "TORRE 2", "TORRE 3");
                
        JOptionPane.showMessageDialog(null,"LA TORRE SE RESOLVIO EN: "+numeromovimientos+" MOVIMIENTOS.");
        
    }
    public static void Hanoi(int disco, String torreA, String torreB, String torreC) {
        if(disco == 1) {
            numeromovimientos = numeromovimientos + 1;
            JOptionPane.showMessageDialog(null,numeromovimientos+": MOVER DISCO "+disco+" DE LA "+torreA+" A LA "+torreC);
        } else {      
            Hanoi(disco-1, torreA, torreC, torreB);
            numeromovimientos = numeromovimientos + 1;
            JOptionPane.showMessageDialog(null,numeromovimientos+": MOVER DISCO "+disco+" DE LA "+torreA+" A LA "+torreC);
            Hanoi(disco-1, torreB, torreA, torreC);
            
        }
    }
    
}

