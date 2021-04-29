package info;

import database.ConnectToSqlDB;

import java.util.List;

public class Reader {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("ChaseBank", "Categories");

        return list;
    }
}
