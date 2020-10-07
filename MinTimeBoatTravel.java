public class MinTimeBoatTravel {

    static int min(int a, int b){
        return (a<b) ? a:b;
    }

    static int mintime(int wt[], int w, int n){

        if(n==0||w==0){
            return 0;
        }

        if(wt[n-1] <= w){
            return min(15 + mintime(wt, w-wt[n-1], n-1), mintime(wt, w, n-1));
        }else  if(wt[n-1]> w){
            return  mintime(wt, w, n-1);
        }


        return w;
    }

    public static void main(String[] args){

        int[] wt = new int[]{70,68,97,50,40,85,60,70,60,30,60,20,10};   
        int w=140;
        int n=13;

        System.out.println(mintime(wt,w,n));

    }

}



