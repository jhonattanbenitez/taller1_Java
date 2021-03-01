package Jhonattan;

public class Refresco {
    private int unidades; //unidades de refresco

    public Refresco(int unidades) {
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Unidades de refresco: " + unidades +
                "Valor pagado por refrescos: " + valorPagadoRefresco() +
                "Valor pagado por IVA: " + valorIVA_Refresco();
    }

    public double valorPagadoRefresco(){
        return 1500* unidades;
    }
    public  double valorReal_Refresco(){
        return valorPagadoRefresco() ;
    }
    public double valorIVA_Refresco(){
        return 0 ;
    }

}
