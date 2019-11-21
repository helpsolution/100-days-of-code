package design.patterns.creational.singleton;

public final class DbSingleton {

    private static volatile DbSingleton instance;

    public String dbName;

    private DbSingleton(String dbNAme){
        this.dbName = dbNAme;
    }

    public static DbSingleton getInstance(String dbName){

        DbSingleton result = instance;
        if(result != null){
            return result;
        }

        synchronized (DbSingleton.class){

            if(instance == null){
                instance = new DbSingleton(dbName);
            }

            return instance;
        }
    }
}
