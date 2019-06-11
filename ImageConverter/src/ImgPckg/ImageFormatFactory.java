package ImgPckg;


public class ImageFormatFactory {

    public ImageFormat getFormat(String item) {

        // Creates and return an object of type JpgImage
        if (item.equalsIgnoreCase("jpg")) {

            return new JpgImage();
        }
        // Creates and return an object of type PngImage
        if (item.equalsIgnoreCase("png")) {

            return new PngImage();
        }
        // Creates and return an object of type BmpImage
        if (item.equalsIgnoreCase("bmp")) {

            return new BmpImage();
        }
        // Creates and return an object of type GifImage
        if (item.equalsIgnoreCase("gif")) {

            return  new GifImage();
        }
        return null;
    }
}
