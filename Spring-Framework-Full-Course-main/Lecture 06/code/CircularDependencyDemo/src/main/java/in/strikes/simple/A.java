package in.strikes.simple;

public class A {
    private B b;

    public A() {
        System.out.println("A created");
        this.b = new B();
    }
}
