package Jhonattan;

public class Hidratante {
    private int unidadesA; //unidades de agua
    private int unidadesG; //unidades de gatorade
    private int unidadesR; //Unidades de redbull

    public Hidratante(int unidadesA, int unidadesG, int unidadesR) {
        this.unidadesA = unidadesA;
        this.unidadesG = unidadesG;
        this.unidadesR = unidadesR;
    }

    public int getUnidadesA() {
        return unidadesA;
    }

    public int getUnidadesG() {
        return unidadesG;
    }

    public int getUnidadesR() {
        return unidadesR;
    }

    public double PagadoHidratante()    {
        return 0;
    }
    public double valorReal_Hidratante(){
        return 0;
    }
    public double valorIVA_Hidratante(){
        return  0;
    }

    @Override
    public String toString() {
        return "Hidratante{" +
                "unidadesA=" + unidadesA +
                ", unidadesG=" + unidadesG +
                ", unidadesR=" + unidadesR +
                '}';
    }
}
