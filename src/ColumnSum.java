import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int array[][]=new int[n][m];
        int sum;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]=scanner.nextInt();
            }

        }

        for (int i=0;i<m;i++){
            sum=0;
            for (int j=0;j<n;j++){
                sum+=array[j][i];
            }
            System.out.println(sum);
        }
    }
}
