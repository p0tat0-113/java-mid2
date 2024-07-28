package collection.re1.test1;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("동우");
        Player player2 = new Player("우동");

        player1.draw(deck);
        player2.draw(deck);

        dealer(player1,player2);
    }

    private static void dealer(Player p1, Player p2){
        System.out.println(p1.getName()+": "+p1.showHand()+", 합계: "+p1.getSum());
        System.out.println(p2.getName()+": "+p2.showHand()+", 합계: "+p2.getSum());

        if (p1.getSum() > p2.getSum()){
            System.out.println(p1.getName()+" 승리");
        } else if (p1.getSum() < p2.getSum()){
            System.out.println(p2.getName()+" 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
