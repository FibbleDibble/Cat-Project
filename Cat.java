public class Cat
{
    private String name;
    private Integer age;
    private String owner;
    
    public String setName()
    {
        return name = "Blake";
    }
    public Integer setAge(int b)
    {
        return age = b;
    }
    public String setOwner()
    {
        return owner = "Bob";
    }
    
    public String getName()
    {
        return name;
    }
    public Integer getAge()
    {
        return age;
    }
    public String getOwner()
    {
        return owner;
    }
    
    public void eat(String food)
    {
        System.out.println( name + " just ate " + food + " he now weighs 20 more pounds. =c");
        System.out.println( );
    }
}