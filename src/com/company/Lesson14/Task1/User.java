package com.company.Lesson14.Task1;

import java.util.Objects;

public class User implements Comparable<User> {

    private SEX sex;
    private String name;
    private Integer age;

    public User(SEX sex, String name, Integer age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return sex == user.sex && Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age){
            return 1;
        } else if (this.age.equals(o.age)){
            return this.name.compareTo(o.name);
        } else {
            return -1;
        }
    }
}
