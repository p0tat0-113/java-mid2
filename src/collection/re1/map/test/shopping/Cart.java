package collection.re1.map.test.shopping;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> map = new HashMap<>();

    public void add(Product product, int quantity){
        map.put(product,map.getOrDefault(product,0)+quantity);
    }

    public void minus(Product product, int quantity){
        map.put(product,map.getOrDefault(product,0)-quantity);

        if (map.get(product) <= 0){
            map.remove(product);
        }
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println("상품: "+entry.getKey()+", 수량: "+entry.getValue());
        }
    }
}
