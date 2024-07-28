package collection.list.test.ex2;

/*ShoppingCartMain 코드가 작동하도록 ShoppingCart 클래스를 완성해라.
ShoppingCart 는 내부에 리스트를 사용해야 한다.*/

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items = new ArrayList<>();
    //전에 배열로 만들었을 때는 배열의 크기를 먼저 지정을 해야했다. 배열의 크기를 동적으로 늘릴 수 없었음.
    //배열 안에 실제로 들어있는 아이템들의 갯수를 파악하기 위한 별도의 변수를 운용해야했음. 지금은 .size()로 쉽게 얻을 수 있다.

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());
        }

        System.out.println("전체 가격 합: "+ calculateTotalPrice());//가격 합계를 계산하는 부분은 별도의 메서드로 분리해서 유지 보수성을 높였다.
        //성능은 좀 떨어지겠지만 어차피 이 정도 루프로는 간에 기별도 안감.
    }
    
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
