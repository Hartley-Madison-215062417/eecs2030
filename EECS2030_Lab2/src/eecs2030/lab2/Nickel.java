package eecs2030.lab2;

public class Nickel implements Comparable<Nickel> {

	private int year;

	/**
	 * The monetary value of a nickel in cents.
	 */
	public final int CENTS = 5;

	public Nickel(int year) {
		if (year < 1858) {
			throw new IllegalArgumentException("Invalid year given");
		} else {
			this.year = year;
		}
	}

	public int issueYear() {
		return year;
	}

	public int compareTo(Nickel other) {
		int difference = this.year - other.year;
		return difference;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CENTS;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nickel other = (Nickel) obj;
		if (CENTS != other.CENTS)
			return false;
		return true;
	}

}
