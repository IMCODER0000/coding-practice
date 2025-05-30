package orchardshopsystem;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String id;
    private String pass;

    private  String roll;
    private String name;
    private Map<String, Integer> purchaseHistory;
    private Long totalPurchasePrice;


    public User(String roll, String name, Long totalPurchasePrice, String id, String pass) {
        this.roll = roll;
        this.name = name;
        this.purchaseHistory = purchaseHistory = new HashMap<>();
        this.totalPurchasePrice = totalPurchasePrice;
        this.id = id;
        this.pass = pass;
    }

    public User(String roll, String name, String id, String pass ) {
        this.roll = roll;
        this.name = name;
        this.id = id;
        this.pass = pass;

    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getPurchaseHistory() {
        return purchaseHistory;
    }

    public Long getTotalPurchasePrice() {
        return totalPurchasePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchaseHistory(Map<String, Integer> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public void setTotalPurchasePrice(Long totalPurchasePrice) {
        this.totalPurchasePrice = totalPurchasePrice;
    }
}
