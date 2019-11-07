package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Controller {
    @FXML
    AnchorPane pane;
    @FXML
    void figure(){
        double f = Math.floor(Math.random()*4);
        if(f==0){
            Line line = addLine();
            pane.getChildren().add(line);
        }
        else if(f==1){
            Circle circle = addCircle();
            pane.getChildren().add(circle);
        }
        else if(f==2){

        }
    }
    Line addLine(){
        Line line = new Line();
        double x = Math.random()*500;
        line.setStartX(x);
        x = Math.random()*500;
        line.setEndX(x);
        double y = Math.random()*350;
        line.setStartY(y);
        y = Math.random()*350;
        line.setEndY(y);
        line.setFill(Color.RED);
        return line;
    }
    Circle addCircle(){
        Circle circle = new Circle();
        double r = Math.random()*50;
        circle.setRadius(r);
        double x = Math.random()*(500-2*r)+r;
        circle.setCenterX(x);
        double y = Math.random()*(350-2*r)+r;
        circle.setCenterY(y);
        double check = Math.round(Math.random());
        if(check==1){
            circle.setFill(Color.BLUE);
        }
        else {
            circle.setFill(Color.WHITE);
            circle.setStrokeWidth(1);
            circle.setStroke(Color.BLUE);
        }
        return circle;
    }
}
