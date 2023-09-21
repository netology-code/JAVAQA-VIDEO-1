public class Main {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[2] = "Kolva";

        ArrayList<Integer> nameList = new ArrayList<>();
        nameList.add(3);
        nameList.add(5);
        nameList.add(11);
        boolean has = nameList.contains("Olya");
        System.out.println(nameList);
        //nameList.set(2, "Kolva");
        System.out.println(nameList);

        //Collections.sort(nameList);
        System.out.println(nameList);
    }
}