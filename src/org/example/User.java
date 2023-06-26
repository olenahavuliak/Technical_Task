package org.example;

public class User {
  private String name;
  private int age;

  private User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static User createUser(String name, int age){
    return new User(name, age);
  }

  @Override
  public String toString() {
    return "\nUser{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
