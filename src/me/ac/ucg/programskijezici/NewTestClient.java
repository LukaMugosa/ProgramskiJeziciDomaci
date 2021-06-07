package me.ac.ucg.programskijezici;

public class NewTestClient extends NewClient{
    @Override
    public void operation() {
        System.out.println("Operation function from new client class.");
    }

    @Override
    public void newOperation() {
        System.out.println("New Operation function from new client class.");
    }
}
