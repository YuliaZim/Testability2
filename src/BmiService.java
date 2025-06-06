public class BmiService {
    public int calculate(double m, int kg) {
        double index = kg / (m * m);

        return (int) index;
    }
}
