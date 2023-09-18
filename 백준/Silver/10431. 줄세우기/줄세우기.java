import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTest = sc.nextInt();

        for (int test = 1; test <= totalTest; test++) {
            int testNum = sc.nextInt();
            int studentArr[] = new int[20];
            int count = 0;
            for (int i = 0; i < 20; i++) {
                studentArr[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (studentArr[j] > studentArr[i]) {
                        int currentStudent = studentArr[i];
                        for (int k = i - 1; k >= j; k--) {
                            studentArr[k + 1] = studentArr[k];
                            count++;
                        }
                        studentArr[j] = currentStudent;
                        break;
                    }
                }
            }
            System.out.println(test + " " + count);
        }
    }
}