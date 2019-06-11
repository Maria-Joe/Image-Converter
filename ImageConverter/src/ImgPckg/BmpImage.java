package ImgPckg;

public class BmpImage extends Formats implements ImageFormat{ //bmp format

    //Implementing abstract function of interface ImageFormat
    @Override
    public void format(){
        // Calls function present in extended class Formats
        commonFormat();
    }
}
