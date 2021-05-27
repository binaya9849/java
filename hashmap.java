import java.util.HashMap;

public class hashmap {
    public static void main(String[]args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add keywords and values
        capitalCities.put("England","Lomdon");
        capitalCities.put("Englan","Lomdo");
        capitalCities.put("Engla","Lomd");
        capitalCities.put("Engl","Lomd");
        capitalCities.put("Eng","Lom");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("Engl"));
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
