package collection.map.test.cart;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //상품의 이름과 가격이 같은 Product는 논리적으로 동등한 객체이다. 논리적으로 동등한 객체는 해시코드도 같아야 한다.
    //HashMap에서 key로 쓸 것이기 때문에 equals()와 hashCode()를 오버라이딩 해야함.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + price +
                '}';
    }
}
