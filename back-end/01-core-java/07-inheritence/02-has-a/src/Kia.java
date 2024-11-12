class Design
{
	String color;

	String engineVarient;

	void engine()
	{
		System.out.println("Design-engine()");
	}
}
class Kia
{
	Design ref1;

	Kia(Design ref2)
	{
		this.ref1 = ref2;
	}

	void sonet()
	{
		System.out.println("Kia-sonet()");
		ref1.color = "White";
		System.out.print(ref1.color + ", ");
		ref1.engineVarient = "Turbo 1.0";
		System.out.print(ref1.engineVarient + ", ");
		ref1.engine();
	}

	public static void main(String[] args) 
	{
		Design designObj = new Design();
		Kia kiaModel = new Kia(designObj);
		kiaModel.sonet();
		System.out.println("done");
	}
}
