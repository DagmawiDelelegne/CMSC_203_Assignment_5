package pack1;
/*
 * Assignment 5: a program that calculates the bonus for stores based on their sales amount
 * instructor: Ahmed Tarek
 * programmer: Dagmawi Delelegne
 * Due date: 4/11/2023
/*
	 * This method calculates holiday bonuses based on a two-dimensional
	 * ragged array of sales figures for each store in each category.
	 * It also takes in three bonus amounts: one for the store with the 
	 * highest sales in a category, another for the store with the lowest
	 * sales in a category, and a third for all other stores. 
	 * 
	 * @author Dagamawi Delelegne
	 * 
	 * */
public class HolidayBonus {
	/**
		 * @param salesData two dimensional array of stores sales
		 * @param highBonusAmount bonus for the highest store in a category
		 * @param lowBonusAmount bonus for the lowest store in a category
		 * @param double otherBonusAmount bonus for all other stores in a category
		 * @return an array of the bonus for each store
   */
		 
	public static double[] calculateHolidayBonus(double[][] salesData, double highBonusAmount, double lowBonusAmount, double otherBonusAmount) {
	    
		
		
		double[] bonuses = new double[salesData.length];
	    
	    // find max number of categories
	    int maxNumOfCategories = 0;
	    for (int i = 0; i < salesData.length; i++) {
	      if (maxNumOfCategories < salesData[i].length) {
	        maxNumOfCategories = salesData[i].length;
	      }
	    }
	    
	    
	    
	    for (int j = 0; j < maxNumOfCategories; j++) {
	      // add bonus for highest and lowest sales in each category
	      int highestSalesIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(salesData, j);
	      int lowestSalesIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(salesData, j);
	      
	      
	      
	      // sales must be positive to get high bonus
	      if (TwoDimRaggedArrayUtility.getHighestInColumn(salesData, j) > 0) {  
	        bonuses[highestSalesIndex] += highBonusAmount;
	      }
	      
	      // sales must be positive and different from high to get low bonus
	      if (TwoDimRaggedArrayUtility.getLowestInColumn(salesData, j) > 0 && highestSalesIndex != lowestSalesIndex) {
	        bonuses[lowestSalesIndex] += lowBonusAmount;
	      }
	      
	      
	      
	      // add OTHER bonus to the other stores unless no category is available if sales are positive 
	      for (int i = 0; i < salesData.length; i++) {
	        if (j >= salesData[i].length || i == highestSalesIndex || i == lowestSalesIndex || salesData[i][j] <= 0) {
	          continue;
	        } else {
	          bonuses[i] += otherBonusAmount;
	        } 
	      }
	    }   
	    return bonuses;
	}
	
	/**
	 * @param salesData two dimensional array of stores sales
	 * @param highBonusAmount bonus for the highest store in a category
	 * @param lowBonusAmount bonus for the lowest store in a category
	 * @param double otherBonusAmount bonus for all other stores in a category
	 * @return total total of all bonuses 
*/
	
	 public static double calculateTotalHolidayBonus(double[][] data, double high, double low,
		      double other) {
		    
		    double[] Arr = calculateHolidayBonus(data, high, low, other);
		    double total = 0;
		    
		    for (double bonus:Arr) {
		      total+=bonus;
		    }
		    return total;
		  }
}

