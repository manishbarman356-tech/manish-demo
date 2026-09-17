import java.util.Scanner;
public class university_attandance_analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] attendance = new double[n];
        System.out.println("Enter attendance percentages:");
        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextDouble();
        }
        System.out.print("Enter attendance threshold: ");
        double threshold = sc.nextDouble();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (attendance[i] < threshold) {
                count++;
            }
        }
        double lowest = attendance[0];
        int position = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += attendance[i];
            if (attendance[i] < lowest) {
                lowest = attendance[i];
                position = i;
            }
        }
        double average = sum / n;
        System.out.println("Students below threshold: " + count);
        System.out.println("Lowest attendance: " + lowest);
        System.out.println("Position: " + (position + 1));
        System.out.println("Average attendance: " + average);
    }
}