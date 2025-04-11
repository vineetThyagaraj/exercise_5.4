
public class milesToKilometer {
    public static void main(String[] args) throws Exception {
        System.out.printf("%s %10s %s\n", "Miles", "", "Kilometers");
        for(int i=1; i <= 10; i++){
            double kilometer = i*1.609;
            System.out.printf("%d %-17s %.3f\n", i, "", kilometer);
        }
    
    }
}
