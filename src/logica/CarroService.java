package logica;

import bd.Database;
import modelo.Carro;

public class CarroService {

    private final Database database;

    public CarroService(Database database) {
        this.database = database;
    }

    public void guardarCocheDB(Carro carro) {
        database.guardar();
        System.out.println("Carro " + carro.getMarca() + " guardado en la base de datos.");

    }
}

