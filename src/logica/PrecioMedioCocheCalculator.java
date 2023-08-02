package logica;
import modelo.Carro;
public class PrecioMedioCocheCalculator {
    public static int calcularPrecioMedio(Carro carro) {
        if (carro.getMarca().equals("Renault")) {
            return 18000;
        } else if (carro.getMarca().equals("Audi")) {
            return 25000;
        } else {
            return 0;
        }
    }
}
//Prueba 2 de ramas