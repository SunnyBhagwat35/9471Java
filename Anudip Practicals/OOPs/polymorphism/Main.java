class Animal{
	void makeSound(){
		System.out.println("making sound!");
	}
}
class Dog{
	void makeSound(){
		System.out.println("Barking..!");
	}
}
class cat{
	void makeSound(){
		System.out.println("Meow..!");
	}
}
class Main{
	public static void main(String a[]){
		Dog d = new Dog();
		d.makeSound();
		cat c = new cat();
		c.makeSound();
		Animal an = new Animal();
		an.makeSound();
	}
}