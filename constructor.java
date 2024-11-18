class Aa{
    int a ; String b;
    int x,y;
    Aa(){
         a =  320;
         b = "hello";
        System.out.println("hhhhhh");
    }
    Aa(int a , int b){
        x= a;
        y = b;
        System.out.println("The sum of given numbers are : " + (x+y));

    }
     void haha(){
        System.out.println("The given in intiger is : " + a + "\nand The given String is : "+ b);
//        System.out.println(s);
    }
}
public class  constructor {

    public static void main(String[] args) {
        System.out.println("Calling constructor");
        Aa object_1 = new Aa();
        object_1.haha();
        System.out.println("done");
        Aa object_2 = new Aa(3,4);



    }
}


