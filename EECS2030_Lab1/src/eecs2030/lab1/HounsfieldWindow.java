package eecs2030.lab1;

/**
 * A class that represents a windowed view of Hounsfield units. A Hounsfield
 * window is defined by two values: (1) the window level, and (2) the window
 * width. The window level is the Hounsfield unit value that the window is
 * centered on. The window width is the range of Hounsfield unit values that the
 * window is focused on.
 * 
 * <p>
 * A window has a lower and upper bound. The lower bound is defined as the
 * window level minus half the window width:
 * 
 * <p>
 * lo = level - (width / 2)
 * 
 * <p>
 * The upper bound is defined as the window level plus half the window width:
 * 
 * <p>
 * hi = level + (width / 2)
 * 
 * <p>
 * Hounsfield units are mapped by the window to a real number in the range of
 * {@code 0} to {@code 1}. A Hounsfield unit with a value less than lo is mapped
 * to the value {@code 0}. A Hounsfield unit with a value greater than hi is
 * mapped to the value {@code 1}. A Hounsfield unit with a value v between lo
 * and hi is mapped to the value:
 * 
 * <p>
 * (v - lo) / width
 * 
 *
 */
public class HounsfieldWindow {

	private int level;
	private int width;

	public HounsfieldWindow() {

		this.level = 0;
		this.width = 400;

	}

	public HounsfieldWindow(int level, int width) {

		checkLevelValue(level);
		checkWidthValue(width);

		this.level = level;
		this.width = width;

	}

	// getLevel
	public int getLevel() {

		return level;
	}

	// getWidth
	public int getWidth() {

		return width;
	}

	// setLevel
	public int setLevel(int level) {

		checkLevelValue(level);
		int oldLevel = this.level;
		this.level = level;
		return oldLevel;
	}

	// setWidth
	public int setWidth(int width) {

		checkWidthValue(width);
		int oldWidth = this.width;
		this.width = width;
		return oldWidth;
	}

	// checkValue
	private static void checkLevelValue(int value) {
		if (value < Hounsfield.MIN_VALUE || value > Hounsfield.MAX_VALUE) {
			throw new IllegalArgumentException("Value is either too small or too large");
		}
	}

	private static void checkWidthValue(int value) {

		if (value < 1) {
			throw new IllegalArgumentException("Value is too small");
		}
	}

	// map
	public double map(Hounsfield h) {
		double result;

		int v = h.get();

		double lo = this.level - (this.width / 2.0);
		double hi = this.level + (this.width / 2.0);

		if (v < lo) {
			result = 0;
		} else if (v > hi) {
			result = 1;
		} else {
			result = (v - lo) / this.width;
		}
		return result;
	}

}
