package bt1;

public class Person {
    protected String name;
    protected int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
    }
}

