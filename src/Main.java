public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

            double bmi = service.calculate(187, 87);
        System.out.println(bmi);

    }
}

