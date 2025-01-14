package neuralNetwork;

import java.util.Random;

public class Weight {
	private double value;
	public static double MAX_VALUE=0.1f;
	public static Random random = new Random();

	public Weight() {
		initialize();
	}

	public void initialize() {
		value = Weight.random.nextGaussian() * MAX_VALUE;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}