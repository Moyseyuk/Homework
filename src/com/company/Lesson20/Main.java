package com.company.Lesson20;

import com.company.Input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "3476");

        Statement statement = connection.createStatement();
        statement.execute(
                "create table if not exists users(id int primary key, name varchar, sex varchar)"
        );
        DBService dbService = new DBService(connection);

                dbService.saveUser(addElementToDatabase());
                User user = dbService.getUser(Input.inputInt("Enter id of element in database: "));
                System.out.println(user);
    }

    public static User addElementToDatabase() {
        SEX sex = null;
        String name = Input.inputString("Enter name of user: ");
        System.out.println("1. Male\n2. Female");
        int sexNumber = Input.inputInt("Select sex of user: ");
        if (sexNumber == 1) {
            sex = SEX.MALE;
        } else if (sexNumber == 2) {
            sex = SEX.FEMALE;
        } else {
            System.out.println("You select incorrect type, try again: ");
        }
        return new User(name, sex);

    }
}
