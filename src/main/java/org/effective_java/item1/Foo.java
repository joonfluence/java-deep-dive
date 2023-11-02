package org.effective_java.item1;

public class Foo {

    String name;
    String address;

    public Foo() {}

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo(String name){
        this.name = name;
    }

    /**
    public Foo(String address){
        this.address = address;
    }
    **/

    public static Foo withName(String name){
        return new Foo(name);
    }

    public static Foo withAddress(String address){
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFoo(){
        return GOOD_NIGHT;
    }

    public static void main(String[] args) {
        Foo foo = new Foo("joonho");
        Foo foo1 = Foo.withAddress("joonho");
        Foo foo2 = Foo.getFoo();
        Foo foo3 = Foo.getFoo();

        System.out.println("foo = " + foo);
        System.out.println("foo1 = " + foo1);
        System.out.println("foo2 = " + foo2);
        System.out.println("foo3 = " + foo3);
    }
}
