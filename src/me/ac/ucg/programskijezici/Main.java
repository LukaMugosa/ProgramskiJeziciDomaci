package me.ac.ucg.programskijezici;

public class Main {
    // Luka Mugosa 16/2018, D-smjer
    // rad se moze naci i na githubu "https://github.com/LukaMugosa/ProgramskiJeziciDomaci"
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
        Client client = new Client(); // MOGLI SMO I OBJEKAT INSTANCIRANJA INSTANCIRATI I SA TEST CLIENT KLASOM
        client.operation(); //               ISTO TO VAAZI I ZA NEW TEST CLIENT
        System.out.println();

        System.out.println("--------------------NewClient-------------------------------------");
        NewClient newClient = new NewClient();
        newClient.operation();
        newClient.newOperation();

        System.out.println("--------------------Kraj------------------------------------------");

    }
}
