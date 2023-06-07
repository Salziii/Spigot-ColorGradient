package de.salzfrei.manager.ColorManager.Interpolator;

public interface Interpolator {
    double[] interpolate(double from, double to, int splits);
}
