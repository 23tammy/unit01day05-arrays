// good
import java.util.Arrays;
public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = {0, 0, 0};
        // NOTE: again, I'd use a variable name like 'num' or 'item' instead of 'i'
        for (int i : a){
            if (i== a[0] && i == a[1] && i == a[2]){
                b[0] = i;
                b[1] = i;
                b[2] = i;
            }else if (i>= a[0] && i >= a[1] && i >= a[2]){
                if (b[2] == i){
                    b[1] = i;
                }else{
                    b[2] = i;
                }
            }else if (i<= a[0] && i <= a[1] && i <= a[2]){
                if (b[0] == i){
                    b[1] = i;
                }else{
                    b[0] = i;
                }
            }else{
                b[1] = i;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}