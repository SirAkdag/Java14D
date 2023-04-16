package zweiteAufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rechteck extends Application {
    @Override
    public void start(Stage meineStage) throws Exception {
        FlowPane rootNode = new FlowPane();

        Scene meineScene = new Scene(rootNode, 500, 500);
        meineStage.setScene(meineScene);
        meineStage.setResizable(false);

        Rectangle rechteck = new Rectangle(200, 200);
        rechteck.setStrokeWidth(5);
        rechteck.setStroke(Color.BLACK);
        rechteck.setFill(Color.YELLOW);
        rootNode.getChildren().add(rechteck);

        meineStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
