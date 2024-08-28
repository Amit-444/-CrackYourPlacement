// 526. Beautiful Arrangement

public class beautifulArrangement {
    int res = 0;

    public int countArrangement(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i+1;

        backtrack(arr, 0);

        return res;    
    }

    private void backtrack (int[] arr, int indx){
        if (indx == arr.length)
            res++;

        for (int i = indx; i < arr.length; i++){
            if ( (arr[i] % (indx+1) == 0 || (indx+1) % arr[i] == 0)){
                swap (arr, i, indx);
                backtrack (arr, indx+1);
                swap (arr, i, indx);
            }
        }

        return;
    }

    private void swap (int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
