
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = br.readLine();
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            count = 0;
            for (int k = j - 1; k >= 0; k--) {
                int check = arr[j].compareTo(arr[k]);
                if (check > 0)
                    count = count + 1;

            }
            System.out.println(count);
        }


    }
}
