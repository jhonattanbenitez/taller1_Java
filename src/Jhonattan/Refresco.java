package Jhonattan;

public class Refresco {
    private int unidades;

    public Refresco(int unidades) {
        this.unidades = unidades;
    }
    public double valorPagadoRefresco(){
        return 0;
    }
    public  double valorReal_Refresco(){
        return 0;
    }
    public double valorIVA_Refresco(){
        return 0;
    }

    @Override
    public String toString() {
        return "Refresco{" +
                "unidades=" + unidades +
                '}';
    }
}
