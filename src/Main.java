import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scan();
    }

    private static void Scan() {
        System.out.println("Введите 5 строк: ");
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            listA.add(line);
        }
        System.out.println(listA);

        System.out.println("\n");
        System.out.println("Введите ещё 5 строк: ");

        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String line2 = scanner.nextLine();
            listB.add(line2);
        }
        System.out.println(listB);
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(listB.size() - 1 - i));
        }
        System.out.println(listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(listC);
    }
}