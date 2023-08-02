package bd;

public class DatabaseMysql implements Database {
 @Override
    public void guardar() {
        System.out.println("Creo conexion a la base de datos");
        System.out.println("Guarde en la base de datos");
    }
}
