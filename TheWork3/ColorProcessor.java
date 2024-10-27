package TheWork3;

import java.util.List;

public class ColorProcessor {
     
	public static void processColors(List<Colors> colorList) {
           for (Colors color : colorList) {
            color.PrintColor();  
                          color.adjustProperties();  
        }
    }
}
