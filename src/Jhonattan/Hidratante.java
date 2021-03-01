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

    @Override
    public String toString() {
        return "Unidades de Agua: " + unidadesA +
                "\n Unidades de Gatorade: " + unidadesG +
                "\n Unidades de RedBull: " + unidadesR +
                "\n Valor pagado por bebidas hidratantes: $" + valorPagadoHidratante() +
                "\n valor real de las bebidas hidratantes: $" + valorReal_Hidratante() +
                "\n Valor pagado por concepto de IVA: $" + valorIVA_Hidratante();
    }

    public double valorPagadoHidratante() {
        return 1000 * unidadesA + 2000 * unidadesG + 2450 * unidadesR;
    }

    public double valorReal_Hidratante() {
        return (unidadesG * 2000 + unidadesR * 2450) / 1.16 + unidadesA * 1000;
    }

    public double valorIVA_Hidratante() {
        return (unidadesG * 2000 + unidadesR * 2450) * 0.16;
    }


}
