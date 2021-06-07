package me.ac.ucg.programskijezici;

public class NewConcreteSupplier implements NewAbsSupplier{
    @Override
    public void operation() {
        System.out.println("Operation function from new concrete supplier");
    }

    @Override
    public void newOperation() {
        System.out.println("New Operation function from new concrete supplier");
    }

}
