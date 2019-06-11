package ImgPckg;


public class ImageFilterFactory {
    public ImageFilter getFilter(String item) {
        // Creates and return an object of type GrayScale
        if (item.equalsIgnoreCase("GrayScale")) {

            return new GrayScale();
        }

        // Creates and return an object of type LogColorScale
        if (item.equalsIgnoreCase("LogColorScale")) {

            return new LogColorScale();
        }

        // Creates and return an object of type CharcoalScale
        if (item.equalsIgnoreCase("CharcoalScale")) {

            return new CharcoalScale();
        }

        // Creates and return an object of type OriginalImageFilter
        if (item.equalsIgnoreCase("OriginalScale")) {

            return new OriginalImageFilter();
        }

        // Creates and return an object of type ImplodeFilter
        if (item.equalsIgnoreCase("ImplodeScale")) {

            return new ImplodeFilter();
        }

        return null;
    }
}
