package StaticVarsConstTest;

public class TestHabitat {

	public static void main(String[] args) {
		Habitat bisonHabitat = Habitat.provisionHabitat("bison");

		System.out.println(Habitat.DEFAULT_POPULATION_SIZE);
		System.out.println(Habitat.DEFAULT_ANIMAL_SIZE);
		System.out.println(Habitat.DEFAULT_ANIMAL_DIET);
		
		bisonHabitat.getClass();
	}

}
