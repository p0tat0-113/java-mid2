package collection.map.test.cart;

import java.security.CodeSource;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> map = new HashMap<>();

    public void add(Product product, int quantity){
        //장바구니에 상품과 수량을 담는다. 상품의 이름과 가격이 같으면 같은 상품이다.
        //장바구니에 이름과 가격이 같은 상품을 추가하면 기존에 담긴 상품에 수량만 추가된다.
        //장바구니에 이름과 가격이 다른 상품을 추가하면 새로운 상품이 추가된다.
        if (quantity <= 0){
            return;
        }
        map.put(product,map.getOrDefault(product,0)+quantity);
    }

    public void minus(Product product, int minusQuantity){
        //장바구니에 담긴 상품의 수량을 줄일 수 있다. 만약 수량이 0보다 작다면 상품이 장바구니에서 제거된다
        int currentQuantity = map.getOrDefault(product, 0);//만약 key값이 없는, 즉 장바구니 없는 상품이면 0이 반환됨. 아래 조건문에서 걸러진다.
        currentQuantity -= minusQuantity;

        if (currentQuantity <= 0){
            map.remove(product);
        } else {
            map.put(product,currentQuantity);
        }
    }

    //이 문제의 핵심은 HashMap의 key로 쓰는 객체 Product의 equals(), hashCode()를 재정의 하는 것이다.
    //김영한 아저씨 말로는 분명히 같은 문제를 실무에서 한 번 만나게 될거라고 한다.
    //equals(), hashCode()를 재정의 하지 않고, 해시 자료구조에 넣었다가 정체불명의 버그에 시달릴 것ㅋㅋㅋ

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println("상품: "+entry.getKey()+" 수량: "+entry.getValue());
        }
    }
}
