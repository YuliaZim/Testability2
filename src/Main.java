public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.66;
        int kg = 64;
        double index = service.calculate(m, kg);
        int index1 = (int) index;

        System.out.println(index1);

    }
}
