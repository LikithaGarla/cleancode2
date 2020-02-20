package com.epam.clean_code_2.clean_code_2;


//to calculate house construction cost
public class Application {

	//standard materials are treated as equal to 1 
	//above standard materials are treated as greater than 1 and less than 5
	//above 5 for highly standard materials
	
 public int calculateCost(int standardmaterials, int area, boolean automated){
 		if(standardmaterials == 1 )
 				return 1200;
 		else if(standardmaterials > 1 && standardmaterials < 5)
 				return 1500;
 		//automated is considered as boolean
 		else if(standardmaterials > 5 && (automated == true))
 				return 2500;
 		else if( standardmaterials > 5 )
 				return 1800;
 		else
 			return 0;
 	
 }

}