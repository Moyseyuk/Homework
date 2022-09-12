package com.company.Lesson20;

import java.sql.*;
import java.util.Locale;

public class DBService {

    private final Connection connection;

    public DBService(Connection connection) {
        this.connection = connection;
    }

    public void saveUser(User user){

        String name = user.getName();
        String sex = user.getSex().name();

        try{

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select max(id) + 1 as id from users"
            );
            int nextId = 0;

            if (resultSet.next()){
                nextId = resultSet.getInt("id");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into users (id, name, sex) values (?, ?, ?)"
            );
            preparedStatement.setInt(1,nextId);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, sex);
            preparedStatement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public User getUser(Integer id){

        User user = null;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from users where id = ?"
            );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                user = new User(name, SEX.valueOf(sex.toUpperCase(Locale.ROOT)));
            }
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

}
