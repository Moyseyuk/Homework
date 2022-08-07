package com.company.Lesson14.Task1;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        } else if (o1.getAge().equals(o2.getAge())){
            return o1.getName().compareTo(o2.getName());
        } else {
            return -1;
        }
    }
}
