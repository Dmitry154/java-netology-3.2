public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
            double height = 187; //cm
            double weight = 87; //kg
            double bmi = service.calculate(height, weight);
        System.out.println(bmi);

    }
}

