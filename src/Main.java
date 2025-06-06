public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.66;
        int kg = 64;
        int index = service.calculate(m, kg);

        System.out.println(index);

    }
}
