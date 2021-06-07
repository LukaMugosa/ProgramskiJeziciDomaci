package me.ac.ucg.programskijezici;

public class ConcreteSupplier implements AbstractSupplier{

    private String attribute;

    public ConcreteSupplier(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public void operation() {
        System.out.println("Operation function from concrete supplier");
    }
}
