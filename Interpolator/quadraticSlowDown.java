package de.salzfrei.manager.ColorManager.Interpolator;

public class quadraticSlowDown implements Interpolator {
    @Override
    public double[] interpolate(double from, double to, int splits) {
        final double[] results = new double[splits];
        double a = (from - to) / (splits * splits);
        double b = - 2 * a * splits;
        for (int i = 0; i < results.length; i++) {
            results[i] = a * i * i + b * i + from;
        }
        return results;
    }
}
