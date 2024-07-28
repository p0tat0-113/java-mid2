package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();//현재 페이지 바로 전 페이지까지 저장됨.
    private String currentPage;//현재 페이지

    public void visitPage(String link){
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = link;
        System.out.println("방문: "+currentPage);
    }

    public String goBack(){
        if (!history.isEmpty()){
            currentPage = history.pop();//currentPage에 바로 전 페이지를 넣고, 해당 페이지를 history에서 제거함.
            System.out.println("뒤로가기: "+currentPage);
            return currentPage;
        }
        return null;
    }
}
