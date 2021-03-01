package Jhonattan;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    static int totCerv = 0, totRon = 0, totRef = 0, totAgua = 0, totRB = 0, totGat;
    static double totalBebidas;
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // write your code here

        Competidor c;
        Turista t;
        char sigue;
        sigue = JOptionPane.showInputDialog("¿Hay  clientes? [S/N]").toUpperCase().trim().charAt(0);
        if(sigue == 'N') System.exit(0);
        //ciclo de lectura
        while (sigue == 'S') {
            c = crearCompetidor();
            mostrarFacturaCompetidor(c);
            acumularFacturaCompetidor(c);

            t = crearTurista();
            mostrarFacturaTurista(t);
            acumularFacturaTurista(t);
            sigue = JOptionPane.showInputDialog("¿Hay más clientes? [S/N]").toUpperCase().trim().charAt(0);
        }


        mostrarTotales();
    }

    private static Competidor crearCompetidor() {
        //Atributo
        Hidratante hidratante = crearHidratante();
        return new Competidor(hidratante);

    }

    private static void acumularFacturaCompetidor(Competidor c) {
        totAgua += c.getHidratante().getUnidadesA();
        totGat += c.getHidratante().getUnidadesA();
        totRB += c.getHidratante().getUnidadesR();
        totalBebidas += c.recaudoHidratante();
    }

    private static void mostrarFacturaCompetidor(Competidor c) {
        System.out.println(c.toString());
    }

    private static void acumularFacturaTurista(Turista t) {
        if (t.getEdad() >= 18) {
            totCerv += t.getLicor().getUnidadesC();
            totRon += t.getLicor().getUnidadesR();
        }
        totRef += t.getRefresco().getUnidades();
        totAgua += t.getHidratante().getUnidadesA();
        totGat += t.getHidratante().getUnidadesG();
        totRB += t.getHidratante().getUnidadesR();
        totalBebidas += t.recaudoTurista();
    }

    private static void mostrarFacturaTurista(Turista t) {
        System.out.println(t.toString());
    }

    private static void mostrarTotales() {
        System.out.println("\n ****Totales***");
        System.out.println("Total unidades de Cerveza: " + totCerv);
        System.out.println("Total unidades de Ron: " + totRon);
        System.out.println("Total unidades de Refresco: " + totRef);
        System.out.println("Total unidades de Agua: " + totAgua);
        System.out.println("Total unidades de Gatorade: " + totGat);
        System.out.println("Total unidades de RedBull: " + totRB);
        System.out.println("\n Total recaudado por bebidas: $" + df.format(totalBebidas));
    }

    private static Turista crearTurista() {
        //Atributos
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del turista: "));
        Licor licor = null;
        if (edad >= 18) {
            licor = crearLicor();
        }
        Refresco refresco = crearRefresco();
        Hidratante hidratante = crearHidratante();
        return new Turista(edad, licor, refresco, hidratante);
    }

    private static Licor crearLicor() {
        //Atributos
        int unidadesC; //Unidades de cervezas
        int unidadesR; //Unidades de ron

        unidadesC = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de cervezas: "));
        unidadesR = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de Ron: "));

        return new Licor(unidadesC, unidadesR);
    }

    private static Refresco crearRefresco() {
        //Atributos
        int unidades; //unidades de refresco.
        unidades = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de refrescos: "));
        return new Refresco(unidades);
    }

    private static Hidratante crearHidratante() {
        //Atributos
        int unidadesA; //unidades de agua
        int unidadesG; //Unidades de Gatorade
        int unidadesR; //unidades de RedBull

        unidadesA = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de unidades de Agua "));
        unidadesG = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de RedBull: "));
        unidadesR = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de Gatorade: "));

        return new Hidratante(unidadesA, unidadesG, unidadesR);
    }


}
