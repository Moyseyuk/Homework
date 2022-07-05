package com.company.Lesson11;

public class DBReadService {

    public void check (Database database){

        if (database.strings[0] == null){
            throw new DBReadException(database);
        }

    }

}
