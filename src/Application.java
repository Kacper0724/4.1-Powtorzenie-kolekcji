import java.util.*;

public class Application{
    public static void main(String[] args) {
        String result = "";

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for(int i = 0; i < companies.size(); i++){
            result += companies.get(i) + ", ";
        }

        System.out.println(result);
    }
}
