package by.epam.classes.task2;

public class Test2 {

    private String name;
    private int age;

    public Test2() {
        this.name = "default name";
        this.age = 0;
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
}
