package co.edu.misiontic2022.reto1;

public class EvaluarOpcionCredito {

    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        Double interesSimple = valor * (interes/100) * tiempo;
        return interesSimple;
    }
    private Double calcularInteresCompuesto(Double valor,Integer tiempo,Double interes) {
        Double interesCompuesto = valor * (Math.pow(1 + (interes /100), tiempo) - 1);
        return interesCompuesto;
    }
    public String compararOpcion(Double valor, Integer tiempo) {
        String eleccion = "credito especial";

        if (calcularInteresSimple(valor, tiempo, 2.5) > calcularInteresCompuesto(valor, tiempo, 2.2)) {
            eleccion = "credito estandar";
        } 
    return eleccion;
    }

}
