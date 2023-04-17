package vierteAufgabe;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Animation extends Application {
    @Override
    public void start(Stage meineStage) {
        //hier wurde Pane erstellt.
        Pane rootNode = new Pane();
        Scene meineScene = new Scene(rootNode, 500, 400);
        meineStage.setTitle("Animation");
        meineStage.setScene(meineScene);

        //hier wurde ein Rechteck der Größe 150x150 mit den Koordinaten 300 x 150 erstellt.
        Rectangle rechteck = new Rectangle(300, 150, 150, 150);
        //hier wurde die Randfarbe auf schwarz gesetzt.
        rechteck.setStroke(Color.BLACK);
        //hier wurde die Randbreite auf 4 eingestellt
        rechteck.setStrokeWidth(4);
        //das Innere des Rechtecks wurde mit Grau gefüllt
        rechteck.setFill(Color.GRAY);

        //hier wurde ein Kreis der Größe 30 mit den Koordinaten 120x120 erstellt.
        Circle kreis = new Circle(120, 120, 30);
        //das Innere des Kreises wurde mit Schwarz gefüllt
        kreis.setFill(Color.BLACK);
        //hier wurde die Randfarbe auf Gelb gesetzt
        kreis.setStroke(Color.YELLOW);
        //hier wurde die Randbreite auf 4 eingesetllt
        kreis.setStrokeWidth(4);

        //die Shapes wurden hinzugefügt.
        rootNode.getChildren().add(kreis);
        rootNode.getChildren().add(rechteck);

        //Animation dauert 4 Sekunden
        ScaleTransition zoomRechteck = new ScaleTransition(Duration.millis(4000), rechteck);
        //Jede Sekunde schrumpft das Rechteck um -0,7.
        zoomRechteck.setByY(-0.7);
        zoomRechteck.setByX(-0.7);
        //Animation wiederholt 10-mal
        zoomRechteck.setCycleCount(10);
        //Animation läuft automatisch rückwärts
        zoomRechteck.setAutoReverse(true);
        zoomRechteck.play();

        //Animation dauert 4 Sekunden
        ScaleTransition zoomKreis = new ScaleTransition(Duration.millis(4000), kreis);
        //Jede Sekunde wächst das Kreis um 1.
        zoomKreis.setByX(1);
        zoomKreis.setByY(1);
        //Animation wiederholt 10-mal
        zoomKreis.setCycleCount(10);
        //Animation läuft automatisch rückwärts
        zoomKreis.setAutoReverse(true);
        zoomKreis.play();


        meineStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
