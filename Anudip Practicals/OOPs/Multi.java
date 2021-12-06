class Animal{
	public String type;
}

class Dog extends Animal{
	public String name;
	Dog(String type, String name){
		this.name = name;
		super.type = type;
		
	}
	public void makeSound(){
		System.out.println("Barking..");
	}
	public void getName(){
		System.out.println("name is: "+name);
	}
	public void getType(){
		System.out.println("name is: "+type);
	}
}

class BabyDog extends Dog{
	BabyDog(String type, String name){
		super(type, name);
	}
	
	void wheep(){
		System.out.println("Our baby dog "+name+" is Wheeping");
	}
}

class Multi{
	public static void main(String[] args) {
		BabyDog dog = new BabyDog("dog", "step");
		dog.makeSound();
		dog.getName();
		dog.getType();
		dog.wheep();
	}
}