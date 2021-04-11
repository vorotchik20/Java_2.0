package HomeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        String string = "alex ferg greg alex ferg alex";
        String[] array = string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, array);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))){
                map.put(list.get(i), 1);
            }else{
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }

        int maxCount = 0;
        String maxWord = "";
        for (String key : map.keySet()) {
            if (map.get(key) > maxCount){
                maxCount = map.get(key);
                maxWord = key;
            }
            System.out.println("слово " + key + ", количество = " +  map.get(key));
        }

        System.out.println("чаще всего встречается слово " + maxWord + ", количество = " + maxCount);
    }
}
