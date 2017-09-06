package org.openmrs.module.kenyaemrCharts.fragment.controller;

import org.openmrs.ui.framework.fragment.FragmentModel;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.ui.framework.SimpleObject;

/**
 * controller for pivotTableCharts fragment
 */
public class PivotTableChartsFragmentController {
    public void controller(FragmentModel model){
    	
    	List<SimpleObject> myList = new ArrayList<SimpleObject>();
    	
		// Nairobi object
    	SimpleObject objNairobi = new SimpleObject();
    	SimpleObject.create(
				"name", "Nairobi",
				"population", 2000000,
				"safety", "High",
				"averageAge" , 43 
		);
    	myList.add(objNairobi);
    	
		// Kisumu object
    	SimpleObject objKisumu = new SimpleObject();
    	SimpleObject.create(
				"name", "Kisumu",
				"population", 750000,
				"safety", "High",
				"averageAge" , 44 
		);
    	myList.add(objKisumu);
    	
		// Hauston object
    	SimpleObject objHauston = new SimpleObject();
    	SimpleObject.create(
				"name", "Hauston",
				"population", 4000000,
				"safety", "Low",
				"averageAge" , 52 
		);
    	myList.add(objHauston);
    	
		//Denver object
    	SimpleObject objDenver = new SimpleObject();
    	SimpleObject.create(
				"name", "Denver",
				"population", 500000,
				"safety", "High",
				"averageAge" , 56
		);
    	myList.add(objDenver);
    	
		//Addis Ababa
    	SimpleObject objAddisAbaba = new SimpleObject();
    	SimpleObject.create(
				"name", "Addis Ababa",
				"population", 1500000,
				"safety", "Low",
				"averageAge" , 41 
		);
    	myList.add(objAddisAbaba);
    	
    	model.addAttribute("CityObjects", myList);

    }
}
