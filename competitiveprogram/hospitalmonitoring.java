import java.util.Scanner;

public class hospitalmonitoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours: ");
        int n = sc.nextInt();

        int[] patients = new int[n];

        System.out.println("Enter patient count for each hour:");
        for (int i = 0; i < n; i++) {
            patients[i] = sc.nextInt();
        }

        int max = patients[0];
        int min = patients[0];
        int peakHour = 0;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += patients[i];

            if (patients[i] > max) {
                max = patients[i];
                peakHour = i;
            }

            if (patients[i] < min) {
                min = patients[i];
            }
        }

        double average = (double) sum / n;

        int aboveAverage = 0;

        for (int i = 0; i < n; i++) {
            if (patients[i] > average) {
                aboveAverage++;
            }
        }

        System.out.println("Maximum patients: " + max);
        System.out.println("Hour: " + (peakHour + 1));
        System.out.println("Minimum patients: " + min);
        System.out.println("Peak hour: " + (peakHour + 1));
        System.out.println("Average patients: " + average);
        System.out.println("Hours above average: " + aboveAverage);
    }
}
