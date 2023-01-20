import java.util.Arrays;
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int min = 0;
        int mid = 0;
        int max = 0;
        for (int i : a){
            if (i== a[0] && i == a[1] && i == a[2]){
                min = i;
                mid = i;
                max = i;
            }else if (i>= a[0] && i >= a[1] && i >= a[2]){
                if (max == i){
                    mid = i;
                }else{
                    max = i;
                }
            }else if (i<= a[0] && i <= a[1] && i <= a[2]){
                if (min == i){
                    mid = i;
                }else{
                    min = i;
                }
            }else{
                mid = i;
            }
        }
        a[0] = min;
        a[1] = mid;
        a[2] = max;
        System.out.println(Arrays.toString(a));
    }
}