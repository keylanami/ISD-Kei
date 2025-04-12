package TipeE;

import java.util.List;
import java.util.Stack;

public class backforth {
    //dataurl, back, forward, history

    private Stack<String> back;
    private Stack<String> forth;
    private List<String> history;
    private String URLnow;

    public backforth(){
        back = new Stack<>();
        forth = new Stack<>();
        history = new Stack<>();
        URLnow = null;
    }

    public void addURL(String url){
        if (URLnow != null) {
            back.push(URLnow);
        }

        URLnow = url;
        forth.clear();
        history.add(url);
        System.out.println("Lagi buka " + url);
    }

    public void back(){
        if (!back.isEmpty()) {
            forth.push(URLnow);
            URLnow = back.pop();

            System.out.println("Back ke url " + URLnow);
        } else {
            System.out.println("ga bisa mundur");
        }
    }

    public void forth(){
        if (!forth.isEmpty()) {
            back.push(URLnow);
            URLnow = forth.pop();
            System.out.println("Kembali lagi ke url " + URLnow);
        } else {
            System.out.println("ga bisa maju");
        }
    }

    public void history(){
        System.out.println("History web");

        for (String url : history){
            System.out.println(url);
        }

    }


}
