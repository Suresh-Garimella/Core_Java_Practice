package junitprograms;

public class TwoVariableSwap {

    public int[] swap(int a,int b) {
//        int a = 35, b = 22;
        int arr[];
        if(a<0||b<0){
            arr=new int[] {b,a};
            return arr;
        }
        a = a + b;
        b = a - b;
        a = a - b;
        arr = new int[]{a, b};
        return arr;
    }

}
