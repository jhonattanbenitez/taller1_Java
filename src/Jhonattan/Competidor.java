package Jhonattan;

public class Competidor {
    private Hidratante hidratante;

    public Competidor(Hidratante hidratante) {
        this.hidratante = hidratante;
    }

    public Hidratante getHidratante() {
        return hidratante;
    }


    public double recaudoHidratante() {
        return (hidratante.valorReal_Hidratante());
    }

    @Override
    public String toString() {
        return hidratante.toString();
    }
}

