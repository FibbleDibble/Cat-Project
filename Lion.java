import java.awt.Color;

public class Lion
{
    private String name;
    private Color manecolor;
    
    public void setName(String xname)
    {
        name = xname;
    }
    
    public void setManeColor(Color xmanecolor)
    {
        manecolor = xmanecolor;
    }

    public String getName()
    {
        return name;
    }
    
    public Color getManeColor()
    {
        return manecolor;
    }

    public void roar()
    {
        System.out.println( name + " just roared!");
    }
}