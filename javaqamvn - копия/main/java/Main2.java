public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anya");
        names.add("Olya");
        names.add("Sveta");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
