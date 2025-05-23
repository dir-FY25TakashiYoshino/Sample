package Sample;

import java.util.Iterator;

public class ForSample {

    public static void main(String[] args) {
        for (var i=2; i<=20; i+=2) {
            System.out.println(i);
        }
        
        
        
        for(int i=1; i<=20; i++) {
    if (i%2!=0) {
        //現在の処理をスキップし、次の処理に進む
        continue;
    }
    System.out.println(i);}
        
        
        
        for (int i=2; i<=100; i+=2) {
            if(i>20){
                //繰り返しから抜け出す
                break;
            }
            System.out.println(i);
        }
        
        
        var numbers=new int[] {1,2,3,4,5};
        for (var number:numbers){
            System.out.println(number);
        }
}
    }
