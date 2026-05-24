import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Map;
public class step1{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Scanner sc = new Scanner(System.in);

        while(true){
            
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
        String url2 = map.get(code2);
        if(url2 != null){
            System.out.println(url2);
        }else{
            System.out.println("Invalid code");
        }
        System.out.println("Enter the coice '0' or '1' ");
        System.out.println("Show all URL click '5'");
        int coice = sc.nextInt();
        if(coice == 0){
            break;
        }
        else if(coice == 5){
            for(Map.Entry<String,String> entry : map.entrySet()){
                System.out.println(entry.getKey() +"->"+ entry.getValue());
            }
            continue;
        }else{
            continue;
        }
    }
    }
}