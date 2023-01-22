// good
public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int min = 0;
        int max = 0;
        // NOTE: 'i' is a triggering variable name in this case... 'i' almost always refers to an index (position) in an array, not an actual value from the array
        for (int i : a ){
            if (i >= a[0] && i >= a[1] && i >= a[2]){
                max = i;
            } 
            if (i <= a[0] && i <= a[1] && i <= a[2]){
                min = i;
            }
        }
        System.out.println(max - min);
    }
}
