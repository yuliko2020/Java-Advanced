package ImageProcessor.service;

import ImageProcessor.entity.DownloadedImage;
import ImageProcessor.entity.ImageDescriptor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DownloadService {
    public List<DownloadedImage> downloadImages(List<ImageDescriptor> descriptors) {
        List<DownloadedImage> imageList = new ArrayList<>();
        for(ImageDescriptor descriptor: descriptors) {
            try {
                URL url = new URL(descriptor.getImageURL());
                BufferedImage image = ImageIO.read(url);
                imageList.add(new DownloadedImage(image, true, descriptor));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                imageList.add(new DownloadedImage(null, false, descriptor));
            }
        }
        return imageList;
    }
}

