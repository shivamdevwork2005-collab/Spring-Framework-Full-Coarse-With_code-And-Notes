package in.strikes.simple;

public class B {
    private A a;

    public B() {
        System.out.println("B created");
        this.a = new A();
    }
}
