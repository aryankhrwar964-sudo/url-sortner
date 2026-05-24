import java.util.Random;
public class step2 {
    public static void main(String[] args) {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String code = "";
        for(int i=0;i<6;i++){
            int idx = random.nextInt(chars.length());
            char store = chars.charAt(idx);
            code+=store;
        }
        System.out.println(code);
    }
}
