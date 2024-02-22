/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaquiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author gean3
 */
public class PracticaQuiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float haciendaTot = 0, totM;
        String NCursos = JOptionPane.showInputDialog("Cuantos cuersos desea incluir?");
        for(int x = 0; x < Integer.parseInt(NCursos); x++){
            JOptionPane.showInputDialog("Ingrese el nombre del curso #" + (x+1));
            totM = Integer.parseInt(JOptionPane.showInputDialog("Monto del curso"));
            haciendaTot += (totM*0.02);
        }
        JOptionPane.showMessageDialog(null, "La profesor Walter White deberá pagar a hacienda el monto de $" + haciendaTot);
    }
    
}
