package Jhonattan;

public class Licor {
    //Atributos

    private int unidadesC;  //unidades de Cerveza
    private int unidadesR;  //Unidades de Ron

    public Licor(int unidadesC, int unidadesR) {
        this.unidadesC = unidadesC;
        this.unidadesR = unidadesR;
    }

    public int getUnidadesC() {
        return unidadesC;
    }

    public int getUnidadesR() {
        return unidadesR;
    }

    @Override
    public String toString() {
        return "Unidades de cerveza: " + unidadesC +
                "\n Unidades de ron:" + unidadesR +
                "\n Valor pagado en licores: " + valorPagadoLicor() +
                "\n Valor Real del licor : " + valorReal_Licor() +
                "\n Valor pagado por concepto de IVA" + valorIVA_Licor();
    }

    public double valorPagadoLicor() {
        return 3500 * unidadesC + 7500 * unidadesR;
    }

    public double valorReal_Licor() {
        return valorPagadoLicor() / (1 + 32.0 / 100);
    }

    public double valorIVA_Licor() {
        return valorReal_Licor() * 32.0 / 100;
    }
}
