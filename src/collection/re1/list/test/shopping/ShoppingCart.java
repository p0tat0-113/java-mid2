package collection.re1.list.test.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void displayItems(){
        for (Item item : list) {
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());
        }
        System.out.println("전체 가격 합: "+calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int sum = 0;
        for (Item item : list) {
            sum += item.getTotalPrice();
        }
        return sum;
    }
}
