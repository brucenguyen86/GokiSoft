package GokiSoftPractice;

import java.util.ArrayList;

public class General {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("Toi la Hung");
    list.add("Toi la Tam");
    for ( String string : list){
        System.out.println(string);
    }
    for(int i=0; i<list.size();i++){
        System.out.println(list.get(i));
    }
    // Vector shares the same functions with Arraylist
        // public Vector(){ this(10); } -> Waste memory
}
}
