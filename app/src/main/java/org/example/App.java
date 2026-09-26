package org.example;

import simulator.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.PointLight;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;


public class App extends Application {

   @Override
	public void start(Stage stage) {

		Box box = new Box(150, 150, 150);

		box.setTranslateX(400);
		box.setTranslateY(300);
		
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.BLUE);
		box.setMaterial(material);

		Group root = new Group(box);

		Scene scene = new Scene(root, 800, 600, true);
		scene.setFill(Color.GRAY);
		box.getTransforms().add(new Rotate(25, Rotate.X_AXIS));
		box.getTransforms().add(new Rotate(35, Rotate.Y_AXIS));
		PerspectiveCamera camera = new PerspectiveCamera(false);
		scene.setCamera(camera);
		
		stage.setScene(scene);
		stage.show();
	}

    public static void main(String[] args) {
        launch(args);
    }
}