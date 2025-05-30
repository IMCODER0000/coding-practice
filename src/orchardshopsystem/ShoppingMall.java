package orchardshopsystem;

import java.util.HashMap;
import java.util.Map;

public class ShoppingMall {
    private static Map<Class<? extends Fruit>, Fruit> registry = new HashMap<>();

    // 과일 등록
    public static void register(Class<? extends Fruit> clazz, Fruit fruit) {
        registry.put(clazz, fruit);
    }


    // 등록된 과일 인스턴스 반환
    public static Fruit getFruit(Fruit fruit) {
        Fruit fruit1 = registry.get(fruit.getClass());
        if (fruit1 != null) {
            return fruit1;
        }
        return null;
    }
}