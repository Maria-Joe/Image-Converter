package ImgPckg;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;




// Uses inheritance to extend Application class

public class JavaFXProj extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {



            Button LoadBtn = new Button("Select");
            LoadBtn.setStyle("-fx-text-fill: #000fff");
           // LoadBtn.setStyle("-fx-font-size: 20; ");
            LoadBtn.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
            LoadBtn.setStyle("-fx-background-color: #ffaadd");

            LoadBtn.setMaxSize(100, 10);
            // Creating a VBox layout(vbox)
            VBox vbox = new VBox();
            // Setting center alignment for LoadBtn
            vbox.setAlignment(Pos.TOP_RIGHT);
            // Adding LoadBtn to vbox
            vbox.getChildren().addAll(LoadBtn);
            // Button LoadBtn = new Button("Home", imageView);

            // Setting button action( calls the function chooseImage present in class openImage )
            LoadBtn.setOnAction(e -> OpenImage.chooseImage(primaryStage));


            

            BackgroundImage background= new BackgroundImage(new Image("background.jpg",400,500,false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);


            VBox myvbox = new VBox();
            myvbox.setBackground(new Background(background));

            myvbox.getChildren().addAll(vbox);
            // Creating scene with specified width and height
            Scene scene = new Scene(myvbox, 450, 500);
            // Adding title to stage
            primaryStage.setTitle("Welcome to Image Converter");
            // Adding Scene to stage
            primaryStage.setScene(scene);
            // Display stage
            primaryStage.show();

        }
        catch (Exception e){
            e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting JAVA FX Image Processing Project");
        launch(args);

    }

}
