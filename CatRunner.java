import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		blake.setName();
        blake.setAge(45);
        blake.setOwner();
        blake.eat("rocks");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
	}
}