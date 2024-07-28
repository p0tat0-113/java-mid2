package collection.re1.test1;

public class Card implements Comparable<Card>{
    private Integer number;
    private Symbol symbol;

    public Card(Integer number, Symbol symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public Integer getNumber() {
        return number;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public int compareTo(Card o) {
        if (number.compareTo(o.number) == 0){
            return symbol.compareTo(o.symbol);
        } else {
            return number.compareTo(o.number);
        }

        //return number.compareTo(o.number);
    }

    @Override
    public String toString() {
        return number+"("+symbol+")";
    }
}
