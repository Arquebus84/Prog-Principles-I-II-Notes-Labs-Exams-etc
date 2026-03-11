package StaticVarsConstTest;

public class Habitat {

	final static int SMALL_POPULATION = 6;
	final static int MEDIUM_POPULATION = 12;
	final static int BIG_POPULATION = 18;
	final static char SMALL_ANIMAL = 'S';
	final static char MEDIUM_ANIMAL = 'M';
	final static char BIG_ANIMAL = 'B';
	final static char HERBIVORE = 'h';
	final static char OMNIVORE = 'o';
	final static char CARNIVORE = 'c';
	
	public int maxPopulation;
	public int animalSize;
	public char animalDiet;
	public double surfaceArea;
	
	// Define public constant, DEFAULT_POPULATION_SIZE, initialized to MEDIUM_POPULATION
	public static final int DEFAULT_POPULATION_SIZE = MEDIUM_POPULATION;
	// Define public constant, DEFAULT_ANIMAL_SIZE, initialized to SMALL_ANIMAL
	public static final char DEFAULT_ANIMAL_SIZE = SMALL_ANIMAL;
	// Define public constant, DEFAULT_ANIMAL_DIET, initialized to HERBIVORE
	public static final char DEFAULT_ANIMAL_DIET = HERBIVORE;
	// Write the public no-arg constructor that assigns to maxPopulation the DEFAULT_POPULATION_SIZE, to animalSize the DEFAULT_ANIMAL_SIZE, 
	//	and to animalDiet the DEFAULT_ANIMAL_DIET.
	public Habitat() {
	// Write your code here
	    maxPopulation = DEFAULT_POPULATION_SIZE;
	    animalSize = DEFAULT_ANIMAL_SIZE;
	    animalDiet = DEFAULT_ANIMAL_DIET;
	}
	
	public void reset() {
		// Write the code to reset the values for maxPopulation, animalSize, and animalDiet to their default values.
		maxPopulation = DEFAULT_POPULATION_SIZE;
		animalSize = DEFAULT_ANIMAL_SIZE;
		animalDiet = DEFAULT_ANIMAL_DIET;
		// Write the code to set surfaceArea to maxPopulation * Habitat.computeMinimumArea(animalSize, animalDiet).
		surfaceArea = Habitat.computeMinimumArea(animalSize, animalDiet) * maxPopulation;
	}
	
	public static double computeMinimumArea(int size, char diet) {
		//For now it returns the size of the animal
		return 1.0;
	}

	private Habitat(int newMaxPopulation, char newAnimalSize, char newAnimalDiet, double newsurfaceArea) {
		// Write your code to assign these parameters to maxPopulation, animalSize, animalDiet, and surfaceArea.
		maxPopulation = newMaxPopulation;
		animalSize = newAnimalSize;
		animalDiet = newAnimalDiet;
		surfaceArea = newsurfaceArea;
	}

	// Then implement the public static method like this:
	public static Habitat provisionHabitat(String animal) {
		if (animal.equalsIgnoreCase("gray wolf")) {
			return new Habitat(9, MEDIUM_ANIMAL, CARNIVORE, 130000000);
		} else if (animal.equalsIgnoreCase("bison")) {
			return new Habitat(30, BIG_ANIMAL, HERBIVORE, 121500);
		} else if (animal.equalsIgnoreCase("grizzly bear")) {
			return new Habitat(2, MEDIUM_ANIMAL, OMNIVORE, 10000);
		} else {
			return new Habitat();
		}
	}
	
	//Print the bison category	
	public static void main(String[] args) {
		//This bisonHabitat is a static (reference) variable, and can access other static methods
		Habitat bisonHabitat = Habitat.provisionHabitat("bison");
		
	    System.out.print(bisonHabitat.maxPopulation + "\n");
	    System.out.print(bisonHabitat.animalSize + "\n");
	    System.out.print(bisonHabitat.animalDiet + "\n\n");
	    
	    System.out.println(Habitat.DEFAULT_POPULATION_SIZE + ", "); /**Correct Indentation*/
	    System.out.print(DEFAULT_ANIMAL_SIZE + ", and ");
	    System.out.print(DEFAULT_ANIMAL_DIET + "\n");
	    
	}
	
	
}
