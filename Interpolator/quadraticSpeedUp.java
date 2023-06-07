package ...;

public class quadraticSpeedUp implements Interpolator {
    @Override
    public double[] interpolate(double from, double to, int splits) {
        final double[] results = new double[splits];
        double a = (to - from) / (splits * splits);
        for (int i = 0; i < results.length; i++) {
            results[i] = a * i * i + from;
        }
        return results;
    }
}
