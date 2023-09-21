public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya"
        };
        String newName = "Slava";

        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = newName;
        names = tmp;

        //names = [..., "Slava"]
    }
}
