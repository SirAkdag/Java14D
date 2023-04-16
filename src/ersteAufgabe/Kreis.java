package ersteAufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Kreis extends Application {
    @Override
    public void start(Stage meineStage) throws Exception {
        FlowPane rootNode = new FlowPane();
        Canvas meinCanvas = new Canvas(400,400);
        GraphicsContext gc = meinCanvas.getGraphicsContext2D();
        rootNode.getChildren().add(meinCanvas);
        gc.strokeOval(0,0,200,200);
        Scene meineScene = new Scene(rootNode,400,400);
        meineStage.setScene(meineScene);
        meineStage.setResizable(false);
        meineStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
