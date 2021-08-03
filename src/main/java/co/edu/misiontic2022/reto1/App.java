package co.edu.misiontic2022.reto1;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var caso = 1;
        if (caso == 1) {
            Double valor = 35000000.0;
            Integer tiempo = 12;
            EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();
            String eleccion = evaluar.compararOpcion(valor, tiempo);
            System.out.println(eleccion);
        } else if (caso == 2) {
            Double valor = 41900000.0;
            Integer tiempo = 24;
            EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();
            String eleccion = evaluar.compararOpcion(valor, tiempo);
            System.out.println(eleccion);
        } else if (caso == 3) {
            Double valor = 53250000.0;
            Integer tiempo = 36;
            EvaluarOpcionCredito evaluar = new EvaluarOpcionCredito();
            String eleccion = evaluar.compararOpcion(valor, tiempo);
            System.out.println(eleccion);
        }
    }
}
