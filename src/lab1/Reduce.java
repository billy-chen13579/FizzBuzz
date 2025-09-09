package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int n) {
        int i = n;
        int count = 0;
        while (i > 0){
            if(i%2 == 0){
                i = i /2;
            }else{
                i--;
            }
            count++;
        }
        return count;
    }
}
