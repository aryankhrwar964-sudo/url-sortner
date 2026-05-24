import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Map;
public class step1{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL");
        String url = sc.next();

        Random random = new Random();
        String code = "";
        for(int i=0;i<6;i++){
            int idx = random.nextInt(chars.length());
            char store = chars.charAt(idx);
            code+=store;
        }
        map.put(code, url);
        System.out.println("Generated Code:");
        System.out.println(code);

        System.out.println("Enter the code ");
        String code2 = sc.next();
        int flag = 1;
        for(Map.Entry<String,String> entry : map.entrySet()){
            if(entry.getKey().equals(code2)){
                 System.out.println(entry.getValue());
                 flag = 0;
                 break;
            }
        }
        if(flag == 1){
            System.out.println("invalid code ");
        }
    }
}