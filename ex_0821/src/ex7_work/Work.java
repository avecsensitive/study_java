package ex7_work;

public class Work {
    public static void main(String[] args) {
        
        //가장 큰 값 : 20

        int[] arr = {1, 11, 7, 20, 31, 15};

        
        WorkSub ws = new WorkSub();
        int res = ws.getbigger(arr);

        System.out.println("가장큰 값: " +res);


     

    }//main
}
