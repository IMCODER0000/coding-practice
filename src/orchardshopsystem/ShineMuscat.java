package orchardshopsystem;

public class ShineMuscat implements Fruit {

    private static final ShineMuscat shineMuscat = new ShineMuscat();
    private Long code = 400L;
    private Long stock = 4000L;
    private Long annualYield;
    private String description = "이쁘고 맛있는 샤인머스켓입니다!";

    private int price = 2300;

    private ShineMuscat() {}



    public static ShineMuscat getShineMuscat() {
        return shineMuscat;
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
        shineMuscat.setStock(shineMuscat.getStock() - num);

    }
}
