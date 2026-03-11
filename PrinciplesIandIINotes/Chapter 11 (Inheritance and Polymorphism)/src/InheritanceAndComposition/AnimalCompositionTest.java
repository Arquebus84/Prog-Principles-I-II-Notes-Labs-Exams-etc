package InheritanceAndComposition;

//Composition is shown in Dog class
public class AnimalCompositionTest {
	public static void main(String[] args) {
		
		/**The Dog class inherits everything from the Animal and Mammal class (can use the getter and setters)*/
		
		Animal[] animals = new Animal[3];
		try {
			
			animals[0] = new Dog("Labrador", "Gold", new Collar("Medium", "Red")); //Born in 2020 (Current date: 3/6/2025)
			animals[0].setAge(5);
			
			animals[1] = new Dog("Bulldog", "Brown", new Collar("Large", "Blue")); //Born in 2021 (Current date: 3/6/2025)
			animals[1].setAge(4);
			
			animals[2] = new Mammal(); //Born in 2022 (Current date: 3/6/2025)
			animals[2].setAge(3);
			
			((Dog)animals[0]).setBreed("A");
			
		}catch(InvalidBreedException ex) {
			System.out.println(ex.getMessage());
		}
		
		for(Animal i: animals) {
			System.out.print(i + "\n");
		}
		
		
		/**
		java.util.ArrayList<Animal> animals = new java.util.ArrayList<>();
		animals.add(new Dog("Labrador", "Gold", new Collar("Medium", "Red"))); //Born in 2020 (Current date: 3/6/2025)
		animals.get(0).setAge(5);
		
		animals.add(new Dog("Bulldog", "Brown", new Collar("Large", "Blue"))); //Born in 2021 (Current date: 3/6/2025)
		animals.get(1).setAge(4);
		
		animals.add(new Mammal()); //Born in 2022 (Current date: 3/6/2025)
		animals.get(2).setAge(3);
		
		((Dog)animals.get(0).setBreed("A"));
		*/
		
		
		//System.out.println(dog1.toString());
	}
}

class Animal{
	
	private String species;
	private boolean domesticated;
	private int age;
	
	//Default Constructor
	public Animal() {
		
	}

	//Convenience Constructor
	public Animal(String species, boolean domesticated, int age) {
		this.species = species;
		this.domesticated = domesticated;
		this.age = age;
	}
	
	//Accessor and Mutator: Species
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	//Accessor and Mutator: Domesticated
	public boolean isDomesticated() {
		return domesticated;
	}
	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;
	}

	//Accessor and Mutator: Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [species = " + getSpecies() + ", domesticated = " + domesticated + ", age = " + getAge() + "]";
	}
}

class Mammal extends Animal{
	
	private String furColor;
	private boolean warmBlooded = true;
	
	//Default Constructor
	public Mammal() {
		super();
	}
	
	//Convenience Constructors
	public Mammal(String furColor, boolean warmBlooded) {
		setFurColor(furColor);
		setWarmBlooded(warmBlooded);
	}
	
	public Mammal(String species, boolean domesticated, int age, String furColor, boolean warmBlooded) {
		super(species, domesticated, age);
		setFurColor(furColor);
		setWarmBlooded(warmBlooded);
	}

	//Accessor and Mutator: Fur Color
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	//Accessor and Mutator: warmBlooded
	public boolean isWarmBlooded() {
		return warmBlooded;
	}
	public void setWarmBlooded(boolean warmBlooded) {
		this.warmBlooded = warmBlooded;
	}
	
	@Override
	public String toString() {
		return "Mammal [furColor = " + getFurColor() + ", warmBlooded = " + isWarmBlooded() + "]";
	}
		
}

class Collar{
	
	private String size; //"Small", "Medium", "Large"
	private String color;
	
	//Convenience Constructor
	public Collar(String size, String color) {
		setSize(size);
		setColor(color);
	}
	
	//Accessor and Mutator: Size
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	
	//Accessor and Mutator: Color
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return String.format("that is a size %s and a %s colored", size, color);
	}	
}

class Dog extends Mammal{
	
	private String breed;
	private Collar collar;		/**When you create a property that is an instance of another class, it's called composition*/
	
	//Default Constructor
	public Dog() {
		super("Canine", true, 0, null, true);
		this.breed = "Unknown";
		setCollar(null);
	}
	
	//Convenience Constructor
	public Dog(String breed, String furColor, Collar collar) {
		this();
		this.breed = breed;
		super.setAge(1);
		super.setFurColor(furColor);
		setCollar(collar);
	}

	//Accessor and Mutator: Breed
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) throws InvalidBreedException{
		try {
			if(breed.length() < 3) {
				throw new InvalidBreedException("Less than 3 characters long: Invalid Breed");	//New subclass of Exception (Custom Exception is Created)
			}else {
				this.breed = breed;
			}
						
		}catch(InvalidBreedException ex) {
			System.out.println(ex.toString());
		}
	}
	
	//Accessor and Mutator: Collar
	public Collar getCollar() {
		return collar;
	}
	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	
	@Override
	public String toString() {
		return String.format("Breed: %s %nFur Color: %s %nCollar %s%n", getBreed(), getFurColor(), collar.toString());
	}
}

@SuppressWarnings({"serial"})
class InvalidBreedException extends Exception{
	private String message;
	
	public InvalidBreedException(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}

