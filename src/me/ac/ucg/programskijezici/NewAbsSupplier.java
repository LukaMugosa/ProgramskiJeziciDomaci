package me.ac.ucg.programskijezici;

public interface NewAbsSupplier extends AbstractSupplier{

    default void newOperation() {
        System.out.println("Default new operation method.");
    }

}
