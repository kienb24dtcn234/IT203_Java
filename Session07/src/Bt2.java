class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Person p1 = new Person("Thế");
        Person p2 = p1;
        p2.name = "Kiên";

        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);
    }
}
