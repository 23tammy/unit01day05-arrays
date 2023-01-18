public class ThreeArrayRange {
    public static void main(String[] args, int max, int min) {
        int[] a = {2, 1, 3};
        
        for (int i : a ){
            if (i >= a[0] && i >= a[1] && i >= a[2]){
                max = i;
            }else if (i <= a[0] && i <= a[1] && i <= a[2]){
                min = i;
            }else{
                continue;
            }
        }
        System.out.println(max - min);
    }
}
