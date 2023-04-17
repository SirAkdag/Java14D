package zweiteAufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rechteck extends Application {
    @Override
    public void start(Stage meineStage) {
        Pane rootNode = new Pane();

        Scene meineScene = new Scene(rootNode, 400, 400);
        meineStage.setScene(meineScene);
        meineStage.setResizable(false);

        Rectangle rechteck = new Rectangle(100, 100, 200, 200);
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
