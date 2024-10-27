package TheWork3;

public class PrimaryColor extends Colors {
        boolean isBright;

	public PrimaryColor(String colorName, int colorID, boolean isBright) {
		      super(colorName, colorID);
		this.isBright = isBright;
	}

	@Override
	public void PrintColor() {
   String brightness = isBright ? "bright" : "dull";
		System.out.println("Primary Color: " + colorName + " with ID: " + colorID + " is " + brightness);
	}

	@Override
    public void adjustProperties() {
        if (isBright) {
            System.out.println(colorName + " appears vibrant.");
        } else {
            System.out.println(colorName + " appears muted.");
        }
    }

}
