package collection.re1.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = scanner.nextLine();
            if (eng.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String kor = scanner.nextLine();

            map.put(eng,kor);
        }

        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = scanner.nextLine();
            if (eng.equals("q")){
                break;
            }

            if (map.containsKey(eng)){
                System.out.println(eng+"의 뜻: "+map.get(eng));
            } else {
                System.out.println(eng+"은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
