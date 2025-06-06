public class BmiService {
    public double calculate(double m, int kg) {
        double index = kg / (m * m);

        return index;
    }
}
