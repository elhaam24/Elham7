package TheWork3;

public class SecondaryColor extends Colors {
	           int transparencyLevel;

	public SecondaryColor(String colorName, int colorID, int transparencyLevel) {
	super(colorName, colorID);
		          this.transparencyLevel = transparencyLevel;
	}

	@Override
	public void PrintColor() {
		System.out.println("Secondary Color: " + colorName + " the ID is: " + colorID + " with transparency level: " + transparencyLevel + "%");
		
	}

	@Override
    public void adjustProperties() {
                               System.out.println(colorName + " has a transparency level of " + transparencyLevel + "%.");
    }


	
}
