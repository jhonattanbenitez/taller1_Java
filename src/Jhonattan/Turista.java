package Jhonattan;

public class Turista {
    private int edad; // Edad del turista
    private Licor licor;
    private Refresco refresco;
    private Hidratante hidratante;

    public Turista(int edad, Licor licor, Refresco refresco, Hidratante hidratante) {
        this.edad = edad;
        this.licor = licor;
        this.refresco = refresco;
        this.hidratante = hidratante;
        if (edad < 18) this.licor = null;
    }

    public int getEdad() {
        return edad;
    }

    public Licor getLicor() {
        return licor;
    }

    public Refresco getRefresco() {
        return refresco;
    }

    public Hidratante getHidratante() {
        return hidratante;
    }


    public double recaudoTurista(){


        if (edad >= 18) {
            return licor.valorReal_Licor() + refresco.valorReal_Refresco() + hidratante.valorReal_Hidratante();
        } else {

            return  refresco.valorReal_Refresco() + hidratante.valorReal_Hidratante();
        }


    }

    @Override
    public String toString() {
        if(edad >18) {
            return "Edad del turista: " + edad + "\n" + licor.toString() + "\n" + refresco.toString() +
                    "\n" + hidratante.toString();
        }else{
            return "Edad del turista: " + edad +  "\n" + refresco.toString() +
                    "\n" + hidratante.toString();
        }

    }
}
