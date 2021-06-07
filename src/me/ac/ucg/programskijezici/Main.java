package me.ac.ucg.programskijezici;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------Domaci zadatak iz programskih jezika--------------");

        System.out.println("--------------------ConcreteSupplier----------------------------");
        ConcreteSupplier concreteSupplier = new ConcreteSupplier("Atribut");
        concreteSupplier.operation();

        System.out.println();

        System.out.println("--------------------NewConcreteSupplier--------------------------");
        NewConcreteSupplier newConcreteSupplier = new NewConcreteSupplier();
        newConcreteSupplier.operation();
        newConcreteSupplier.newOperation();

        System.out.println();

        System.out.println("--------------------Client---------------------------------------");
        Client client = new TestClient(); // MOGLI SMO I OBJEKAT INSTANCIRANJA INSTANCIRATI I SA TEST CLIENT KLASOM
        client.operation(); //               ISTO TO VAAZI I ZA NEW TEST CLIENT
        System.out.println();

        System.out.println("--------------------NewClient-------------------------------------");
        NewClient newClient = new NewTestClient();
        newClient.operation();
        newClient.newOperation();

        System.out.println("--------------------Kraj------------------------------------------");

    }
}
