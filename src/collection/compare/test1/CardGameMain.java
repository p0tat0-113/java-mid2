package collection.compare.test1;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player();
        Player player2 = new Player();

        player1.getDeck(deck);
        player2.getDeck(deck);

        whoIsWinner(player1.pickAndShow(),player2.pickAndShow());


        /*==김영한 아저씨와 내 코드의 차이점==
        일단 제일 많이 차이가 난 부분은 enum 사용이다.
        나는 enum을 안쓰고, 상수로 처리를 했음.
        근데 영한아저씨는 enum을 써서, 우선은 코드의 안정성을 더 확보했고,
        문양의 총 갯수, 문양의 우선순위 같은 부분을 아주 매끄러우면서도 깔끔하게 처리함.
        그리고 생각을 해보니까 둘이서 같은 덱을 가지고 게임을 하는데, 카드가 겹치면 안됨.
        그냥 덱에서 한 장씩 뽑아가게 했어야 했다.*/
    }

    private static void whoIsWinner(Deck player1Pick, Deck player2Pick){
        int player1Sum = player1Pick.getSum();
        int player2Sum = player2Pick.getSum();
        System.out.println("플레이어1의 카드: " + player1Pick + ", 합계 : "+player1Sum);
        System.out.println("플레이어2의 카드: " + player2Pick + ", 합계 : "+player2Sum);

        if (player1Sum > player2Sum) {
            System.out.println("플레이어1 승리");
        } else if (player1Sum < player2Sum) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
