package com.company.Lesson14.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(SEX.MALE, "Mihail", 24);
        User user2 = new User(SEX.FEMALE, "Anastasiya", 23);
        User user3 = new User(SEX.MALE, "Mihail", 27);
        User user4 = new User(SEX.MALE, "Genadi", 24);
        User user5 = new User(SEX.FEMALE, "Anastasiya", 23);

        List <User> usersList = new LinkedList<>(Arrays.asList(user1, user2, user3, user4, user5));
        Set <User> userSet = new TreeSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);

        System.out.println(usersList);
        System.out.println(userSet);

        System.out.println(findByNameInList(usersList, "Mihail"));
        System.out.println(findByNameInSet(userSet, "Genadi"));
        System.out.println(findBySexInList(usersList, SEX.FEMALE));
        System.out.println(findBySexInSet(userSet, SEX.MALE));
        usersList.sort(new UserComparator());

        System.out.println(usersList);

    }

    public static List<User> findByNameInList(List<User> users, String name){
        List<User> foundedUsersList= new ArrayList<>();
        for(User user : users){
            if (user.getName().equals(name)){
                foundedUsersList.add(user);
            }
        }
        return foundedUsersList;
    }

    public static List<User> findBySexInList(List<User> users, SEX sex){
        List<User> foundedUsers= new ArrayList<>();
        for(User user : users){
            if (user.getSex().equals(sex)){
                foundedUsers.add(user);
            }
        }
        return foundedUsers;
    }

    public static Set<User> findByNameInSet(Set<User> users, String name){
        Set<User> foundedUsersList= new HashSet<>();
        for(User user : users){
            if (user.getName().equals(name)){
                foundedUsersList.add(user);
            }
        }
        return foundedUsersList;
    }

    public static Set<User> findBySexInSet(Set<User> users, SEX sex){
        Set<User> foundedUsers= new HashSet<>();
        for(User user : users){
            if (user.getSex().equals(sex)){
                foundedUsers.add(user);
            }
        }
        return foundedUsers;
    }
}
