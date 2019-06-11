package ImgPckg;

public class JpgImage extends Formats implements ImageFormat {

    //Implementing abstract function of interface ImageFormat
    @Override
    public void format(){
        // Calls function present in extended class Formats
        commonFormat();
    }
}