import java.util.*;

class TestClass{

    public static void main(String[] args) throws Exception{
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();

        }

        for (int j = 0; j < size; j++) {
            int temp = arr[j];
            int k = j;
        /*storing current element whose left side is checked for correct position*/

            /*Check whether the adjacent element in left is greater or less than current element*/

            while ( k > 0 && temp < arr[k-1]){

                // moving left side element to one space forward

                    arr[k] =  arr[k-1];
                    k -= 1;
            }
            // moving current element to correct position
            arr[k] = temp;
        }

        int evesum = 0, oddsum = 0, noofodds = 0;
        //Hashtable<Integer,Integer> oddele = new Hashtable<>();
        LinkedList<Integer> oddele = new LinkedList<>();
        for (int m = 0; m < size; m++) {
            if (arr[m] %2 == 0){
                System.out.print(arr[m]+" ");
                evesum += arr[m];
            }else {
                oddele.add(noofodds,arr[m]);
                noofodds++;
                oddsum += arr[m];
            }
        }
        System.out.print(evesum+" ");
        for (int x = 0; x < oddele.size(); x++) {
            System.out.print(oddele.get(x)+" ");
        }
        System.out.print(oddsum);
    }

}
