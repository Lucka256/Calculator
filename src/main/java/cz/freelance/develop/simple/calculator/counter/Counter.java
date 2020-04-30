package cz.freelance.develop.simple.calculator.counter;

/**
 * Počítadlo císel
 */
public interface Counter {

    /**
     * Metoda inkrementuje počítadlo
     */
    void addNumber();

    /**
     * Metoda vrací aktualní číslo počítadla
     */
    int getNumber();

    /**
     * Metoda resetuje počítadlo na nulu
     */
    void reset();

}
