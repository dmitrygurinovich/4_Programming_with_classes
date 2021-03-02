package by.epam.classes.task2;

import java.util.Objects;

public class Test2 {

    private String name;
    private int age;

    public Test2() {

    }

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test2 test2 = (Test2) o;
        return age == test2.age && Objects.equals(name, test2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
