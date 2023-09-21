import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(27));
    }
}
