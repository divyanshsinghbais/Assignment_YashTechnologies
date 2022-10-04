package com.yash.ftp.solutions.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class City {
	private int id;
	private String name;
	private State stateObj;
	private float pollutionIndex;
	private int population;
	private int area_of_city;
	
	public City(int id, String name, State stateObj, float pollutionIndex, int population, int area_of_city) {
		super();
		this.id = id;
		this.name = name;
		this.stateObj = stateObj;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getStateObj() {
		return stateObj;
	}
	public void setStateObj(State stateObj) {
		this.stateObj = stateObj;
	}
	public float getPollutionIndex() {
		return pollutionIndex;
	}
	public void setPollutionIndex(float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea_of_city() {
		return area_of_city;
	}
	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", stateObj=" + stateObj + ", pollutionIndex=" + pollutionIndex
				+ ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}
}

class State {
	private int Stated;
	private String statename;

	public State(int stated, String statename) {
		super();
		Stated = stated;
		this.statename = statename;
	}

	public int getStated() {
		return Stated;
	}

	public void setStated(int stated) {
		Stated = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "State [Stated=" + Stated + ", statename=" + statename + "]";
	}

}

public class Problem12 {

	public static void main( String[] args) {

		ArrayList<City> list = new ArrayList<>();
		list.add(new City(101, "Gwalior", new State(1, "Mp"), 15f, 100000, 1000000));
		list.add(new City(102, "Indore", new State(1, "Mp"), 25f, 50000, 1000));
		list.add(new City(103, "Pune", new State(3, "Maharastra"), 35, 200000, 2000000));

		System.out.println("City with less area and highest population");
		Stream<City> lessArea =  list.stream().sorted(Comparator.comparing(City::getArea_of_city).thenComparing(City::getPopulation));
		lessArea.forEach(System.out::println);

		System.out.println("\nCity with high pollution_index and high city area");
		Stream<City> higherPopultaion =  list.stream().sorted(Comparator.comparing(City::getPollutionIndex).reversed().thenComparing(City::getArea_of_city));
		higherPopultaion.forEach(System.out::println);

		System.out.println("\nCity details on the basis of lowest pollution_index first");
		Stream<City> lowestPollutionIndex =  list.stream().sorted(Comparator.comparing(City::getPollutionIndex));
		lowestPollutionIndex.forEach(System.out::println);

		System.out.println("\nCity with lowest pollution index and lowest area of city");
		Stream<City> lowestPollutionIndexlowestArea =  list.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city));
		lowestPollutionIndexlowestArea.forEach(System.out::println);	

		System.out.println("\nCount of cities in every state");
		Map<City, Long> counted = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(counted);
	}

}