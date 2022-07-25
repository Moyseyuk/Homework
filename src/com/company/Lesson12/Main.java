package com.company.Lesson12;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User("Mihail", 24, "male");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.dat"));
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.dat"));
        Object object = objectInputStream.readObject();

        if (object instanceof User) {
            User newUser = (User) object;
            System.out.println(newUser);
        }
        objectInputStream.close();

        FileInputStream inputStream = new FileInputStream("dialog.txt");

        int read = 0;
        String str = "";
        String[][] romeoAndJuliet = new String[20][20];
        String romeo = "";
        String juliet = "";

        while (read != -1) {
            read = inputStream.read();
            char c = (char) read;
            str += c;

        }
        inputStream.close();

        String[] onlyRomeo = str.split("Romeo:");
        for (int i = 0; i < onlyRomeo.length; i++) {
            romeoAndJuliet[i] = onlyRomeo[i].split("Juliet:");
        }

        romeoAndJuliet[0][0] = null;

        for (int i = 0; i < romeoAndJuliet.length; i++) {
            for (int j = 0; j < romeoAndJuliet[i].length; j++) {
                if (romeoAndJuliet[i][j] != null) {
                    if (j == 0) {
                        romeo = String.join("Romeo: ", romeo, romeoAndJuliet[i][j]);
                    } else if (j == 1) {
                        juliet = String.join("Juliet: ", juliet, romeoAndJuliet[i][j]);
                    }
                }
            }
        }

        try (FileWriter writer = new FileWriter("Romeo.txt", false)) {
            writer.write(romeo);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("Juliet.txt", false)) {
            writer.write(juliet);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
