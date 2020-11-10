package ImageProcessor;

import ImageProcessor.entity.DownloadedImage;
import ImageProcessor.entity.ImageDescriptor;
import ImageProcessor.service.DownloadService;
import ImageProcessor.service.FileService;

import java.util.List;
import java.util.stream.Collectors;

public class ImageProcessor {
    private FileService fileService;
    private DownloadService downloadService;

    public static void main(String[] args) {
        String csvFile = args[0];

        FileService fs = new FileService();
        DownloadService ds =  new DownloadService();
        ImageProcessor processor = new ImageProcessor(fs, ds);
        processor.process(csvFile);

    }

    public ImageProcessor(FileService fileService, DownloadService downloadService) {
        this.fileService = fileService;
        this.downloadService = downloadService;
    }

    public void process(String fileName) {
        //main logic is here

        List<ImageDescriptor> imageDescriptors = fileService.readImageDescriptors(fileName);

        List<String> imageUrls = imageDescriptors.stream().map(d -> d.getImageURL()).collect(Collectors.toList());

        List<DownloadedImage> downloadedImages = downloadService.downloadImages(imageUrls);



        /*try {
          DownloadService ds = new Downloadservice();
          List<DownloadedImage> downloadedImages = ds.downloadImages(images);
        }*/


    }
}
