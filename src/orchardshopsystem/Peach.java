package orchardshopsystem;

public class Peach implements Fruit {

    private static final Peach peach = new Peach();
    private Long stock = 3000L;
    private Long annualYield;
    private String description = "너무 달콤한 복숭아 입니다~";



    private int price = 1200;

    private Peach() {}

    public static Peach getPeach() {
        return peach;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getAnnualYield() {
        return annualYield;
    }

    public void setAnnualYield(Long annualYield) {
        this.annualYield = annualYield;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void Buy(int num){
        peach.setStock(peach.getStock() - num);

    }
}