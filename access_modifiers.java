import org.w3c.dom.ls.LSOutput;

public class access_modifiers {
//    public protected default private
    public String str_1 = "I am a public member";
    void in_class(){
        System.out.println("Accessing the str_1 from inside the class : " + str_1);
    }
    public static void main(String[] args) {
        System.out.println("Access modifiers");
        access_modifiers object_1 = new access_modifiers();
        object_1.in_class();
        home obj = new home();
        obj.outside_class();


    }
}
class home{
    void outside_class(){
        access_modifiers object_2 = new access_modifiers();
        System.out.println("Accessing it from another class "+object_2.str_1);
//        object_2.



    }
}

