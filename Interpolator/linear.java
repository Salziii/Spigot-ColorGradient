package ...;

public class linear implements Interpolator {
    @Override
    public double[] interpolate(double from, double to, int splits) {
        final double[] res = new double[splits];
        for (int i = 0; i < splits; i++) {
            res[i] = from + i * ((to - from) / (splits - 1));
        }
        return res;
    }
}

