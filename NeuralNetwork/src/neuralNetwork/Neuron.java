package neuralNetwork;

import java.util.ArrayList;
import java.util.Random;

public class Neuron {
	private double bias=0;
	private double netValue=0;
	private double outValue=0;
	private double sensibility=0;
	private ArrayList<Weight>outputWeights= new ArrayList<>();
	public Neuron(double value) {
		this.netValue=value;
	}
	public void printWeights() {
		for(Weight w :outputWeights) {
			System.out.println(w.getValue());
		}
	}
	public double getBias() {
		return bias;
	}
	public void setBias(double bias) {
		this.bias = bias;
	}
	public double getNetValue() {
		return netValue;
	}
	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}
	public double getOutValue() {
		return outValue;
	}
	public void setOutValue(double outValue) {
		this.outValue = outValue;
	}
	public ArrayList<Weight> getOutputWeights() {
		return outputWeights;
	}
	public void setOutputWeights(ArrayList<Weight> outputWeights) {
		this.outputWeights = outputWeights;
	}
	public double getSensibility() {
		return sensibility;
	}
	public void setSensibility(double sensibility) {
		this.sensibility = sensibility;
	}
	

}
