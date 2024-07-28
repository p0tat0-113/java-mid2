package collection.re1.test1;

public enum Symbol {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("\u2666"),
    CLOVER("\u2663");

    private String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getOrder(){
        return ordinal();
    }

    @Override
    public String toString() {
        return symbol;
    }
}
