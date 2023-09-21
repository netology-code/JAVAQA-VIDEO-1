public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya",
                "Slava"
        };
        String removeName = "Olya";

        // ???
        String[] tmp = new String[names.length - 1];
        int copyToIndex = 0;
        for (String name : names) {
            if (!name.equals(removeName)) {
                tmp[copyToIndex] = name;
                copyToIndex++;
            }
        }
        names = tmp;
    }
}
