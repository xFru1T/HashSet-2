import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
        System.out.print("Print 1 string: ");
        String str1 = scanner.nextLine();
        System.out.print("Print 2 string: ");
        String str2 = scanner.nextLine();
        s1.add(str1);
        s2.add(str2);
        HashSet<String> res = new HashSet<>(s1);
        res.retainAll(s2);
        System.out.println("Common elements: " + res);
    }
}
