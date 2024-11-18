package Array;
class array{
    void max_array(){
        int [] num = {1,5,3,8};//ans = 8
        int ans = 0;
        for (int i = 0; i< num.length;i++){
            if (num[i]> ans){
                ans = num[i];

            }
        }

        System.out.println("Max value is : " + ans);



    }
}

public class max_in_array {
    public static void main(String[] args) {
        array  obj = new array();
        obj.max_array();





    }
}
