package day3;

public class AnimalMain{
	public void speak() 
	{
	System.out.println("i can speak");	
	}
	public static void main(String[] args) {
		AnimalMain myDog = new AnimalMain();
		Dog dog = new Dog();
        dog.speak();
	}

	}


