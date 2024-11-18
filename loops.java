import java.lang.reflect.Array;

public class loops {
    public static void main (String[] args){
        System.out.println("LOOPS");
        int a=0;
        while (true){

            if(a % 5 ==0 && a % 7 ==0)
            {
                System.out.println("Ans Found!");
                System.out.println(a);
                break;
            }
            a++;

       }


    }
}
