package TheWork3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	Colors red = new PrimaryColor("Red", 1, true);
        Colors blue = new PrimaryColor("Blue", 2, false);
        Colors purple = new SecondaryColor("Purple", 3, 50);
        Colors green = new SecondaryColor("Green", 4, 75);

       
        List<Colors> colors = new ArrayList<>();
        colors.add(red);
        colors.add(blue);
        colors.add(purple);
        colors.add(green);

       
       
        ColorProcessor.processColors(colors);
	}

}
