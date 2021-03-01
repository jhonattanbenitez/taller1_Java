package Jhonattan;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    static int totCerv = 0, totRon = 0, totRef = 0, totAgua = 0, totRB =0, totGat;
    static double totalBebidas;
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
	// write your code here

        Competidor c;
        Turista t;



    }

    private static Competidor crearCompetidor(){
        //Atributo
        Hidratante hidratante = crearHidratante();
        return new Competidor(hidratante);
    }
    private static Turista crearTurista() {
        //Atributos
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del turista: "));
        Licor licor = null;
        if (edad >=0){
            licor = crearLicor();
        }
        Refresco refresco = crearRefresco();
        Hidratante hidratante = crearHidratante();
        return new Turista(edad, licor, refresco, hidratante);
    }
    private static Hidratante crearHidratante(){

    }
}
