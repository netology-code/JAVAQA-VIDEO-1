public class Main {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[2] = "Kolva";

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Petva");
        nameList.add("Anya");
        nameList.add("Olya");
        System.out.println(nameList);
        nameList.set(2, "Kolva");
        System.out.println(nameList);

        Collections.sort(nameList);
        System.out.println(nameList);
    }
}
