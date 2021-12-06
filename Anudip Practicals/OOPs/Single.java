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



class Single{
	public static void main(String[] args) {
		Dog d = new Dog("dog", "step");
		System.out.println(d.name);
		d.makeSound();
		d.getName();
		d.getType();
	}
}