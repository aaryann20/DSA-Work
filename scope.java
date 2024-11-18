class algebra{
    int a = 10;//class level scope
//    int b = 20;//class level scope
    int add(){
        int p = 10;//Method level scope
        int q= 100;//Method level scope
        return p + q;
//        return a + b ;
    }
    int sub(){
//        return a - b;
        int p = 100;//Method level scope
        int q = 10;//Method level scope
        return p - q;
    }
//    public static void huuu(){
//
//    }

    void haha(){
        int a = 1;
        System.out.println(a);
//        System.out.println(b);// It cannot call the value outside the block
        {
            int b = 2000;//Block level scope
            System.out.println(b);// output = 2000
        }
        {
            int b = 10000;
            System.out.println(b);// output = 10000
        }
    }
}



public class scope {
    public static void main(String[] args) {
        System.out.println("Scope in JAVA");
        algebra object_1 = new algebra();
        object_1.haha();
    }
}
