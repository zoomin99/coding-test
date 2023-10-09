import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean find = false;
        List<Integer> peopleList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            peopleList.add(sc.nextInt());
            sum += peopleList.get(i);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - peopleList.get(i) - peopleList.get(j) == 100) {
                    find = true;
                    peopleList.remove(i);
                    peopleList.remove(j - 1);
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        peopleList.sort(Comparator.naturalOrder());
        for (int i = 0; i < peopleList.size(); i++) {
            System.out.println(peopleList.get(i));
        }
    }
}