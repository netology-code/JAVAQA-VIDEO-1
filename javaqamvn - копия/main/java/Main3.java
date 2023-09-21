public class Main {

    public static void main(String[] args) {
        String[] levels = { "Новичок", "Средний", "Мастер", "Новичок"};

        HashMap<String, String> map = new HashMap<>();
        map.put("anya49", "Новичок");
        map.put("petro", "Средний");
        map.put("koo", "Мастер");
        map.put("yotyr", "Новичок");
        map.put("anya49", "Мастер");
        String v = map.get("anya49"); // "Мастер"

        for (String key : map.keySet()) {
            String value = map.get(key);
            //
        }

        map.
    }
}
