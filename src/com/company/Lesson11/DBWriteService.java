package com.company.Lesson11;

public class DBWriteService {

    public void check (Database database){

        if (database.strings[4] != null){
            throw new DBWriteException(database);
        } else {
            System.out.println("Successful");
        }

    }
}
