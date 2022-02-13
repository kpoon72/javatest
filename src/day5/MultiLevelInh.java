package day5;

public class MultiLevelInh {
    public static void main(String[] args){
        Animal a, b, c, d;
        a= new Animal();
        b = new Horse();
        c = new Cat();
        d = new Colt();
    a.eat();
    b.eat();
    c.eat();
    d.eat();
    }
}
