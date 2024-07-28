package collection.re1.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String url){
        System.out.println("방문: "+url);
        stack.push(url);
        currentPage = url;
    }

    public String goBack(){
        stack.pop();
        currentPage = stack.peek();
        System.out.println("뒤로 가기: "+currentPage);
        return currentPage;
    }
}
