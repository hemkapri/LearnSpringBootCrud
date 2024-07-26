package java8;

public class InterfaceChanges implements  MyInterface{

    public static void main(String[] args) {

        MyInterface.division();
//        InterfaceChanges interfaceChanges = new InterfaceChanges();
//        interfaceChanges.add();
//        interfaceChanges.substractd();
//        interfaceChanges.multiply();
//
//
//        InterfaceChanges2 interfaceChanges2 = new InterfaceChanges2();
//        interfaceChanges2.add();
//        interfaceChanges2.substractd();
//        interfaceChanges2.multiply();
    }

    @Override
    public void add(){
        System.out.println("Interfcae1 -- Add method");
    }

    @Override
    public void substractd(){
        System.out.println("Interface1 -- substractd method");
    }

    @Override
    public void multiply(){
        System.out.println("Interface1 -- multiply method");
    }
}



class InterfaceChanges2 implements   MyInterface{

    @Override
    public void add() {
        System.out.println("Interfcae2 -- Add method");

    }

    @Override
    public void substractd() {
        System.out.println("Interface2 -- substractd method");

    }
}


interface MyInterface{

    void add();
    void substractd();

    default void  multiply(){
        System.out.println("Interface comon -- multiply method");
    }

    static void division(){
        System.out.println("Division");
    }
}

