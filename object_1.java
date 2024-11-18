class car {
    int milage = 20;
    String colour = "Black" ;
}
public class object_1 {
     public static void main(String[] args){
         car object_1 = new car();
         System.out.println("coulur of the car is :"+ object_1.colour);
         System.out.println("milage of the car is : "+ object_1.milage);
         car object_2 = new car();
         object_2.colour= "megenta";
         object_2.milage = 30;


         System.out.println("coulur of the car is :"+ object_2.colour);
         System.out.println("milage of the car is : "+ object_2.milage);

     }


}
