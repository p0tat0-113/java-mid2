package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        //int형으로 캐스팅하게 되면 아스키코드 값이 나온다.
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex('A') = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex('B') = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex('AB') = " + hashIndex(hashCode("AB")));
    }

    //문자열을 넣으면 해시코드를 반환하는 메서드
    static int hashCode(String str){
        char[] charArray = str.toCharArray();//char 배열로 변환

        int sum = 0;
        for (char c : charArray) {//각 char의 고유한 숫자 값을 모두 더함.
            sum += (int)c;
        }
        return sum;
    }

    //해시코드를 해시인덱스로 반환
    static int hashIndex(int hashCode){
        return hashCode % CAPACITY;
    }

    //hashCode()로 문자를 기반으로 고유한 숫자들을 만들어냈다. 이 숫자들을 해시코드라고 함.
    //해시코드는 숫자이기 때문에 hashIndex()로 해시인덱스로 변환할 수 있다. 배열의 인덱스로 쓸 수 있는 것
}
