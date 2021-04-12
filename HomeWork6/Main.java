package HomeWork6;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String filePath = scanner.next();
        File file = new File(filePath);
        try {
            Scanner fileScanner = new Scanner(file);
            string = fileScanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HashMap<String, Integer> map = new HashMap();
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
