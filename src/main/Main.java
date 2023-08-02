
package main;

import bd.DatabaseMysql;
import logica.PrecioMedioCocheCalculator;
import logica.CarroService;
import modelo.Carro;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Carro("Renault"),
                new Carro("Audi")
        };
        imprimirPrecioMedioCoche(arrayCoches);

        DatabaseMysql database = new DatabaseMysql();
        CarroService service = new CarroService(database);
        service.guardarCocheDB(new Carro("Renault"));
        service.guardarCocheDB(new Carro("Audi"));

    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            int precioMedio = PrecioMedioCocheCalculator.calcularPrecioMedio(carro);
            if (precioMedio > 0) {
                System.out.println(precioMedio);
            } else {
                System.out.println("Precio desconocido para la marca: " + carro.getMarca());
            }
        }
    }
}
