package org.example;

import simulator.*;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.PointLight;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;


public class App extends Application {

   @Override
	public void start(Stage stage) {
		Airspace as = new Airspace();
		as.addAircraft(new Aircraft("737",50,105,50,10));
		as.addAircraft(new Aircraft("777",100,30,-10,100));
		Group grid = new Group();
		
		int size = 500;
		int spacing = 50;
		Box xAxis = new Box(size * 2, 3, 3);
		Box yAxis = new Box(3, size * 2, 3);
		Box zAxis = new Box(3, 3, size * 2);

		xAxis.setMaterial(new PhongMaterial(Color.RED));
		yAxis.setMaterial(new PhongMaterial(Color.GREEN));
		zAxis.setMaterial(new PhongMaterial(Color.BLUE));

		grid.getChildren().addAll(xAxis, yAxis, zAxis);
		PhongMaterial material = new PhongMaterial(Color.GRAY);

		
		
		Simulation sim = new Simulation(as);
		List<Sphere> models = new ArrayList<>();
		
		for(var a : sim.getAircraft()){
			Sphere sphere = new Sphere(30);
			sphere.setTranslateX(a.x());
			sphere.setTranslateY(a.y());
			sphere.setTranslateZ(a.z());
			models.add(sphere);
		}
		
		Group planes = new Group();
		
		for(var a : models){
			planes.getChildren().add(a);
		}
		
		
		
		
		
		
		Group root = new Group(grid,planes);
		Scene scene = new Scene(root, 800, 600, true);
		scene.setFill(Color.BLACK);
		
		PerspectiveCamera camera = new PerspectiveCamera(true);

		camera.setNearClip(0.1);
		camera.setFarClip(10000);
		camera.setFieldOfView(60);

		camera.setTranslateZ(-1200);
		camera.setTranslateY(-250);
		camera.setTranslateX(-250);

		Rotate pitch = new Rotate(0, Rotate.X_AXIS);
		Rotate yaw = new Rotate(10, Rotate.Y_AXIS);

		camera.getTransforms().addAll(yaw, pitch);
	
		scene.setCamera(camera);
		
		stage.setScene(scene);
		stage.show();
	}

    public static void main(String[] args) {
        launch(args);
    }
}