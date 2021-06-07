package me.ac.ucg.programskijezici;

public interface AbstractSupplier {
    // TODO: zatvoren modul jer ne predstavlja neku konkretnu implementaciju, vec zelimo iz njega da kreiramo nove koje se baziraju na njemu
    default void operation() {
        System.out.println("Default operation method.");
    }


}
