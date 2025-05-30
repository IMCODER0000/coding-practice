package orchardshopsystem;

public interface Fruit {

    Long code = null;

    Long stock = null;
    Long annualYield = null;
    String description = null;



    void Buy(int num);
}
