package orchardshopsystem;

public class Orchard {

    private Apple apple;
    private Peach peach;
    private Watermelon watermelon;

    private ShineMuscat shineMuscat;

    public Orchard(Apple apple, Peach peach, Watermelon watermelon, ShineMuscat shineMuscat) {
        this.apple = apple;
        this.peach = peach;
        this.watermelon = watermelon;
        this.shineMuscat = shineMuscat;
    }

//    public Long setStock(Fruit fruit, Long stock) {
//
//    }

    public void inquiry(){
        System.out.println("------------------------------");
        System.out.println("사과 : " + apple.getStock() + "개");
        System.out.println("복숭아 : " + peach.getStock()+ "개");
        System.out.println("수박 : " + watermelon.getStock()+ "개");
        System.out.println("샤인머스캣 : " + shineMuscat.getStock()+ "개");
        System.out.println("------------------------------");
    }





}
