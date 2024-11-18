package Array;

class arrya_1{
    void multi_array(){
        String [][]Ages = new String[2][3];
        Ages [0][0]="You";
        Ages [0][1]="Are ";
        Ages [0][2]="Going ";
        Ages [1][0]="Gym";
        Ages [1][1]="Every";
        Ages [1][2]="Day";

        String [][] Drinks  = {{"Coke Cola","Black drink"},{"Pepsi", "Black drink"},{"Mountain Dew","Green drink"}};


        for(int i = 0;i<2;i++){
            for (int j = 0; j<3; j++){
                System.out.println(Ages[i][j]);

            }

        }

        for(int i = 0 ;i<Drinks.length;i++){// Signify the number of arrays in array
            for (int j = 0; j<Drinks[i].length;j++){//Drinks[i].length - Signify tge number of items in Arrays
                System.out.println(Drinks[i][j]);
            }
        }


    }
}

public class arrays_with_loops {
    public static void main(String[] args) {
        System.out.println("We would use arrays with loops");
        String [] Names = new String[3];
        Names[0]= "Rohan";
        Names[1]= "Raj";
        Names[2]= "Ravi";
         // FOR LOOP IN ARRAY
//        for (int i = 0;i<3;i++){
//            System.out.println(  i+1 + " " + Names[i]);

        //FOR EACH LOOP IN ARRAY
//        for(String name: Names){
//            System.out.println(name);

            //USING WHILE LOOP IN ARRAY
        int i = 0;

        while(i <3){
            System.out.println(i +" "+ Names[i]);
            i++;
        }
        System.out.println("-----------------------------"+"\nLoops in Multi Array ");
        arrya_1 object_1 = new arrya_1();
        object_1.multi_array();



    }
}
