
package modelo;

import bd.DatabaseMysql;

public class Carro {


    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void guardarEnBD() {

        DatabaseMysql databaseMysql = new DatabaseMysql();

        databaseMysql.guardar();

        System.out.println("Guarde en BD");
    }
}

