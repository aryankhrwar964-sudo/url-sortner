import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Map;

public class temp {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("do you have continue press '1' not press '0'");
            int rr = sc.nextInt();

            if (rr == 1) {

                System.out.println("for generating a sort url press '1'");
                System.out.println("for chaking a generated code press '2'");
                System.out.println("for showing all code and URL press '3'");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        String code = "";
                        System.out.println("Enter a URL");
                        String url = sc.next();

                        for (int i = 0; i < 6; i++) {
                            int idx = random.nextInt(chars.length());
                            char store = chars.charAt(idx);
                            code += store;
                        }

                        map.put(code, url);

                        System.out.println("Generated Code:");
                        System.out.println(code);
                        break;

                    case 2:
                        System.out.println("Enter the Generated code");
                        String code2 = sc.next();

                        String url2 = map.get(code2);

                        if (url2 != null) {
                            System.out.println("code is ");
                            System.out.println(url2);
                        } else {
                            System.out.println("Invalid code");
                        }
                        break;

                    case 3:
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                        break;

                    case 0:
                        System.out.println("Program closed");
                        sc.close();
                        break;

                    default:
                        break;
                }

            } else {
                System.out.println("Program closed");
                break;
            }
        }
    }
}