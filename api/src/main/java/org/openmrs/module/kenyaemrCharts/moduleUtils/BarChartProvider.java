/**
 * 
 */
package org.openmrs.module.kenyaemrCharts.moduleUtils;

/**
 * @author Koyowe
 * This is a concrete class that does not contain any abstract method
 * and implements all abstract methods inherited from its abstract class.
 */
public class BarChartProvider extends AbstractChartProvider {

	/**
	 * 
	 */
	public BarChartProvider() {
		System.out.println("Creating charts in our own way");
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.kenyaemrCharts.moduleUtils.AbstractChartProvider#cityWithHighestPopulation()
	 */
	@Override
	public String cityWithHighestPopulation() {
		// has the highest number of people
		return "Hauston";
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.kenyaemrCharts.moduleUtils.AbstractChartProvider#safestCity()
	 */
	@Override
	public String safestCity() {
		// has high safety
		// has high average age
		// has fewest population
		return "Denver";
	}

	/* (non-Javadoc)
	 * @see org.openmrs.module.kenyaemrCharts.moduleUtils.AbstractChartProvider#cityWithHighestLifeExpectancy()
	 */
	@Override
	public String cityWithHighestLifeExpectancy() {
		// has highest average age
		return "Denver";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// generate chart from functions :)
		
		BarChartProvider barChart = new BarChartProvider();
		System.out.println(barChart.cityWithHighestPopulation());
		System.out.println(barChart.safestCity());
		System.out.println(barChart.cityWithHighestLifeExpectancy());

	}

}
