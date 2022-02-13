package day5;

public class Da5Test {
    public static void main(String[] args){
        TestSingleIn obj = new TestSingleIn();
        obj.display();

        System.out.println("******* Multi Level Inheritance*******");

        Colt clt = new Colt();
        clt.eat();
        clt.call();
        clt.desc();

        System.out.println("******* Hierarchical Inheritance*****");
        Cat cat = new Cat();
        cat.eat();
        cat.speak();
        clt.eat();
        clt.call();

    }
}
