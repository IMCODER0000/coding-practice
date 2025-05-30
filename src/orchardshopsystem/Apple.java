package orchardshopsystem;

public class Apple implements Fruit {

    private static final Apple apple = new Apple();

    private Long code = 100L;
    private Long stock = 5000L;
    private Long annualYield;
    private String description = "맛있는 사과 에요 ~";

    private int price = 1000;


    private Apple() {}
    public static Apple getApple() {
        return apple;
    }

    public int getPrice() {
        return price;
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

    @Override
    public void Buy(int num){
        apple.setStock(apple.getStock() - num);

    }

}
