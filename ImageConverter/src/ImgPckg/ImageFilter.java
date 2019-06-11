package ImgPckg;

import javafx.scene.image.ImageView;

import java.io.File;
// Interface ImageFilter is implemented by concrete class LogColorSpace, GrayScale, CharcoalScale
// ImplodeFilter, and OriginalImageFilter
public interface ImageFilter {

    //abstract function
    ImageView filter(File SelectedFile);
}
