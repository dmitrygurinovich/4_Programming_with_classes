package by.epam.classes.task1;

public class Test1 {
    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

    public void sum() {
        System.out.println("a + b = " + (a + b));
    }

    public void max() {
        if (a > b) {
            System.out.println("Max: a = " + a);
        } else if (a < b) {
            System.out.println("Max: b = " + b);
        } else {
            System.out.println("a = b");
        }
    }

    public void changeA(int a) {
        this.a = a;
    }

    public void changeB(int b) {
        this.b = b;
    }

    public void changeAllNumbs(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
