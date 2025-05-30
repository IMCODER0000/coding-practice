package orchardshopsystem;

public class Watermelon implements Fruit {

    private static final Watermelon watermelon = new Watermelon();
    private Long code = 300L;
    private Long stock = 2000L;
    private Long annualYield;
    private String description = "시원한 수박~";

    private int price = 12000;

    private Watermelon() {}

    public static Watermelon getWatermelon() {
        return watermelon;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
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
        watermelon.setStock(watermelon.getStock() - num);

    }
}