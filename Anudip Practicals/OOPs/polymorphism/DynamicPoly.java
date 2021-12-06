class Franchise{
	void franchName(){
		System.out.println("Demo");
	}
}
class Dominos{
	void franchName(){
		System.out.println("Dominos here!");
	}
}
class Pizzahut{
	void franchName(){
		System.out.println("PizzaHut here!");
	}
}
class OvenStory{
	void franchName(){
		System.out.println("OvenStory here!");
	}
}

class DynamicPoly{
	public static void main(String a[]){
		Dominos d = new Dominos();
		Pizzahut p = new Pizzahut();
		OvenStory o = new OvenStory();

		d.franchName();
		p.franchName();
		o.franchName();
	}
}