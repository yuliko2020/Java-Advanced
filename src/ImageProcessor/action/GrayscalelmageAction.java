package ImageProcessor.action;
import java.awt.image.BufferedImage;

 public class GrayscalelmageAction implements ImageAction {
    @Override
    public String getName() {
        return "GRAYSCALE";
    }

    @Override
    public BufferedImage doAction(BufferedImage image) throws Exception {
        System.out.println("Grayscaling an image");
        //tranformation
        return null;
    }
}

