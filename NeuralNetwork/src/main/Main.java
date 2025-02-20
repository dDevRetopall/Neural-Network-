package main;

import java.util.ArrayList;

import neuralNetwork.DataSet;
import neuralNetwork.NeuralNetwork;

public class Main {

	public static void main(String[] args) {
		int[]neuronsStructure= {2,2,2,2};
		double[]values= {0,0};
		double[]right= {0,1};
		double[]values2= {0,1};
		double[]right2= {1,1};
		NeuralNetwork nn = new NeuralNetwork(neuronsStructure);
		nn.setMaxEpochs(10000);
		nn.setLearningRate(0.1f);
		double[]outValues=nn.feedForward(values);
		printValues(outValues);
		DataSet set =new DataSet(values, right);
		DataSet set2 =new DataSet(values2, right2);
		ArrayList<DataSet>datasets = new ArrayList<>();
		datasets.add(set);
//		datasets.add(set2);
		nn.train(datasets);
		double[]outValues2=nn.feedForward(values);
		printValues(outValues2);
	
	}
	public static void printValues(double[]values) {
		System.out.println();
		System.out.println("*********Output values*********");
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		System.out.println();
	}

}
