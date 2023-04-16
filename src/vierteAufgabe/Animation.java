package vierteAufgabe;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;

public class Animation extends Application {
    @Override
    public void start(Stage meineStage) throws Exception {
        FlowPane rootNode = new FlowPane(150,150);
        Scene meineScene = new Scene(rootNode,600,400);
        meineStage.setTitle("Animation");
        meineStage.setScene(meineScene);


        Rectangle rechteck = new Rectangle(60,60);

        rechteck.setStroke(Color.BLACK);
        rechteck.setStrokeWidth(4);
        rechteck.setFill(Color.GRAY);


        Circle kreis = new Circle(50);
        kreis.setStroke(Color.YELLOW);
        kreis.setStrokeWidth(4);


        rootNode.getChildren().add(kreis);
        rootNode.getChildren().add(rechteck);

        ScaleTransition zoomRechteck = new ScaleTransition(Duration.millis(3000),rechteck);
        zoomRechteck.setByY(1);
        zoomRechteck.setByX(1);
        zoomRechteck.setCycleCount(10);
        zoomRechteck.setAutoReverse(true);
        zoomRechteck.play();

        ScaleTransition zoomKreis = new ScaleTransition(Duration.millis(3000),kreis);
        zoomKreis.setByX(1);
        zoomKreis.setByY(1);
        zoomKreis.setCycleCount(10);
        zoomKreis.setAutoReverse(true);
        zoomKreis.play();
        meineStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
