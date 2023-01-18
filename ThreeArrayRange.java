public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int min = 0;
        int max = 0;
        for (int i : a ){
            if (i >= a[0] && i >= a[1] && i >= a[2]){
                max = i;
            } 
            
            if (i <= a[0] && i <= a[1] && i <= a[2]){
                min = i;
            }else{
                continue;
            }
        }
        System.out.println(max - min);
    }
}
