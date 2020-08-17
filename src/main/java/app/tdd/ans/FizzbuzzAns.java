package app.tdd.ans;

public class FizzbuzzAns {
    public String transrate(int i) {
        if(i % 3 == 0 ){
            return "Fizz";
        }
        if(i % 5 == 0 ){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
