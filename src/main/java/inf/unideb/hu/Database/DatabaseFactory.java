package inf.unideb.hu.Database;

public class DatabaseFactory {

    public static DatabaseJSON get(){
        return new DatabaseJSON("database", true);
    }

}
