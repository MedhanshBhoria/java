// FACTORIAL, FIBONACCI, SUM OF NATURAL NUMBERS, REVERSE NUMBERS, COUNT DIGIT, POWER OF EACH NUMBER
public class Q1_rec_printN {
    public static void rec(int n){
        if(n==0){
            return;
        }
        rec(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n = 8;
        rec(n);
    }
}
