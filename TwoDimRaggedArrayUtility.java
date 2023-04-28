package pack1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Manipulates a two-dimensional ragged array of doubles. 
 * This utility class will be used to create
 * a Sales Report for Retail District. 
 * 
 * @author Dagmawi Delelegne
 *
 */
public class TwoDimRaggedArrayUtility {
	
	 /**
	   * Returns the average of the elements in the two dimensional array
	   * @param data the two dimensional array 
	   * @return the average of the elements in the two dimensional array 
	   */
	public static double getAverage(double [][] data) {
		double total = 0, count = 0;
		for(int i = 0; i < data.length; i++ ) {
			for(int j = 0; j < data[i].length; j++) {
				count++;
				total += data[i][j];
			}
		}
		return total/count;
	}
	/**
	 * gets the total of the array
	 * @param data two dimensional array
	 * @return total 
	 * */
	public static double getTotal(double [][] data) {
		double total = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				total += data[i][j];
			}
			
		}
		return total;
	}
	
	/**
	 * return the highest value in the array
	 * @param data two dimensional array
	 * @param temp holds temporarily the a specific sales value
	 * @return the highest value
	 * 
	 * */
	public static double getHighestInArray(double [][] data) {
		double temp=0,highest=0;
		for(int i = 0; i < data.length; i++ ) {
			for(int j = 0; j < data[i].length; j++) {
				temp = data[i][j];
				if(highest < temp) {
					highest = temp;
				}
			}
		}
		return highest;
	}
	
	/**
	 * returns the highest value in a column 
	 * @param col column that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param highest double variable that holds the highest value
	 * @return highest the highest value in a column
	 * */
	public static double getHighestInColumn(double [][]data, int col) {
		double temp=0,highest=0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length <= col|| col< 0)
				continue;
			temp = data[i][col];
			if((highest < temp) ) {
				highest = temp;
			} 
		}
		return highest;
	}
	/**
	 * returns the index of the highest value in a column 
	 * @param col column that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param highest double variable that holds the highest value
	 * @return j the highest value in a column
	 * */
	public static int getHighestInColumnIndex(double [][]data, int col) {
		double temp=0,highest=0;
		int j=0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length <= col|| col < 0)
				continue;
			temp = data[i][col];
			if(highest < temp) {
				highest = temp;
				j = i;
			}
		}
		return j;
	}
	/**
	 * returns the highest value in a column 
	 * @param row row that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param highest double variable that holds the highest value
	 * @return highest the highest value in a row
	 * */
	public static double getHighestInRow(double [][] data, int row){
		double temp = 0, highest = 0;
			for(int j = 0; j < data[row].length; j++) {
				temp = data[row][j];
				if(highest < temp) {
					highest = temp;
				}
		}
			return highest;
	}
	/**
	 * returns the index of highest value in a row 
	 * @param row column that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param i int variable that holds the index of the highest value
	 * @return the highest value in a column
	 * */
	public static int getHighestInRowIndex(double [][]data, int row) {
		double temp = 0, highest = 0;
		int i = 0;
		for(int j = 0; j < data[row].length; j++) {
			temp = data[row][j];
			if(highest < temp) {
				highest = temp;
				i = j;
			}
	}
		return i;
}
	/**
	 * 
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param highest double variable that holds the highest value
	 * @return the highest value in a column
	 * */
	public static double getLowestInArray(double [][]data) {
		double temp=0,lowest=0;
		for(int i = 0; i < data.length; i++ ) {
			for(int j = 0; j < data[i].length; j++) {
				temp = data[i][j];
				if((lowest > temp) || lowest == 0) {
					lowest = temp;
				}
			}
		}
		return lowest;
	}
	/**
	 * returns the lowest value in a column 
	 * @param col column that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param lowest double variable that holds the highest value
	 * @return lowest the lowest value in a column
	 * */
	public static double getLowestInColumn(double [][]data,int  col) {
		double temp=0,lowest=0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length <= col || col < 0)
				continue;
			temp = data[i][col];
			if((lowest > temp) || lowest == 0) {
				lowest = temp;
			}
		}
		return lowest;
	}
	/**
	 * returns the index lowest value in a column 
	 * @param col column that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param lowest double variable that holds the highest value
	 * @return j the highest value in a column
	 * */
	public static int getLowestInColumnIndex(double [][] data, int col) {
		double temp=0,lowest=0;
		int j=0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length <= col || col < 0) {continue;}
			temp = data[i][col];
			if((lowest > temp) || lowest == 0) { 
				lowest = temp;
				j = i;
			}
		}
		return j;
	}
	/**
	 * returns the lowest value in a row 
	 * @param row row  that is looked into
	 * @param temp holds temporarily the a specific sales value
	 * @param data two dimensional array
	 * @param lowest double variable that holds the highest value
	 * @return lowest the lowest value in a column
	 * */
	public static double getLowestInRow(double [][] data, int row) {
		double temp = 0, lowest = 0;
		for(int j = 0; j < data[row].length; j++) {
			temp = data[row][j];
			if((lowest > temp) || (lowest == 0)) {
				lowest = temp;
			}
	}
		return lowest;
	}
	/**
	 * finds the total of a row
	 *@param data the array
	 *@param row the row looked into
	 *@param total holds the total value of a row
	 *@return total
	 * */
public static double getRowTotal(double [][] data, int row ) {
	double total = 0;
	for(int i = 0; i < data[row].length; i++) {
		total += data[row][i];
	}
	return total;
}
/**
 * gets the total of a column
 * @param total holds the total
 * @param data the two dim array
 * @param col the column looked into
 * @return total the total
 * */
public static double getColumnTotal(double [][]data, int col) {
	double total = 0;
	for(int i = 0; i < data.length; i++) {
		if(data[i].length <= col || col <0) {
			continue;
		}
		total += data[i][col];
	}
	return total;
}
/**
 * returns the lowest value in a row
 * @param row row that is looked into
 * @param temp holds temporarily the a specific sales value
 * @param data two dimensional array
 * @param lowest double variable that holds the lowest value
 * @return the lowst value in a row
 * */
	public static int getLowestInRowIndex(double [][]data,int row) {
		double temp = 0, lowest = 0;
		int i = 0;
		for(int j = 0; j < data[row].length; j++) {
			temp = data[row][j];
			if((lowest > temp) || (lowest == 0)) {
				lowest = temp;
				i = j;
			}
	}
		return i;
	}
	/**
	 * @param file file to read
	 * @return result returns a ragged array of the result
	 * @throws FileNotFoundException*/
	static double[][] readFile(File file) throws FileNotFoundException {
	    // Variables
	    double[][] result = null;
	    ArrayList<double[]> rows = new ArrayList<>();
	    Scanner scanner1, scanner2;
	    int rowCount = 0;
	    int currentRow = 0;

	    // Create scanner
	    scanner1 = new Scanner(file);

	    // Count Rows
	    while (scanner1.hasNextLine()) {
	        rowCount++;
	        scanner1.nextLine();
	    }
	    scanner1.close();

	    // Initialize Rows
	    result = new double[rowCount][];
	    scanner2 = new Scanner(file);

	    // Fetch Row Data
	    while (scanner2.hasNextLine()) {
	        // Variables
	        String line = scanner2.nextLine();
	        String[] columns = line.trim().split(" ");
	        result[currentRow] = new double[columns.length];

	        // Loop (Row => Column Values)
	        for (int i = 0; i < columns.length; i++) {
	            result[currentRow][i] = Double.parseDouble(columns[i]);
	        }
	        currentRow++;
	    }

	    // Close scanner
	    scanner2.close();

	    return result;
	}

/**
	 * @param data ragged array
	 * @param outputFile file that is written to
	 * @throws FileNotFoundException
	 * */
	public static void writeToFile(double[][] data, File outputFile) throws IOException {
	    FileWriter writer = new FileWriter(outputFile);
	    for (int i = 0; i < data.length; i++) {
	        for (int j = 0; j < data[i].length; j++) {
	            writer.write(String.valueOf(data[i][j]));
	            if (j < data[i].length - 1) {
	                writer.write(" ");
	            }
	        }
	        writer.write("\n");
	    }
	    writer.close();
	}
	
	
	
	
	
	}

	
