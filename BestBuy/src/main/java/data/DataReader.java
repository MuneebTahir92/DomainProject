package data;

import database.ConnectToSqlDB;

import java.util.List;

public class DataReader {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("Amazon", "ItemList");

        return list;
    }
}
