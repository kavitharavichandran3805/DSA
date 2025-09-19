import java.util.*;
public class lexicographical_order {
    public static void main(String[] args) {
        String[] a={"dog","rat","cat","apple"};
        boolean swapped;
        for(int i=0;i<a.length;i++){
            swapped=false;
            for(int j=1;j<=a.length-i-1;j++){
                if(a[j].compareTo(a[j-1])<0){
                    String temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}