import java.util.Arrays;
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        for (int i : a){
            if (i== a[0] && i == a[1] && i == a[2]){
                a[0] = i;
                a[1] = i;
                a[2] = i;
            }else if (i<= a[0] && i <= a[1] && i <= a[2]){
                a[0] = i;
            }else if (i>= a[0] && i <= a[2]){
                a[1] = i;
            }else if (i>= a[0] && i >= a[1] && i >= a[2]){
                a[2] = i;
            
            
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
