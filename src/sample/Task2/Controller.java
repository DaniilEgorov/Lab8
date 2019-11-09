package sample.Task2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    TextField x1,y1,x2,y2,
              x3,y3,w,h,
              x4,y4,a,b,
              x5,y5,x6,y6,x7,y7;
    @FXML
    AnchorPane line,ellipse,rect,triangle;
    @FXML
    CheckBox checkEllipse, checkRect, checkTriangle;
    @FXML
    void drawLine(){
        Canvas canvas = new Canvas(450,340);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLUE);
        double x1,x2,y1,y2;
        x1 = Double.parseDouble(this.x1.getText());
        x2 = Double.parseDouble(this.x2.getText());
        y1 = Double.parseDouble(this.y1.getText());
        y2 = Double.parseDouble(this.y2.getText());
        gc.strokeLine(x1,y1,x2,y2);
        line.getChildren().remove(line.getChildren().size()-1);
        line.getChildren().add(canvas);
    }
    @FXML
    void drawRect(){
        Canvas canvas = new Canvas(450,340);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double x,y,w,h;
        x = Double.parseDouble(this.x3.getText());
        y = Double.parseDouble(this.y3.getText());
        w = Double.parseDouble(this.w.getText());
        h = Double.parseDouble(this.h.getText());
        if(checkRect.isSelected()){
            gc.setFill(Color.RED);
            gc.fillRect(x,y,w,h);
        }
        else {
            gc.setStroke(Color.RED);
            gc.strokeRect(x,y,w,h);
        }
        rect.getChildren().remove(rect.getChildren().size()-1);
        rect.getChildren().add(canvas);
    }
    @FXML
    void drawEllipse(){
        Canvas canvas = new Canvas(450,340);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double x,y,a,b;
        x = Double.parseDouble(this.x4.getText());
        y = Double.parseDouble(this.y4.getText());
        a = Double.parseDouble(this.a.getText());
        b = Double.parseDouble(this.b.getText());
        if(checkEllipse.isSelected()){
            gc.setFill(Color.GREEN);
            gc.fillOval(x-a/2,y-b/2,a,b);
        }
        else {
            gc.setStroke(Color.GREEN);
            gc.strokeOval(x-a/2,y-b/2,a,b);
        }
        ellipse.getChildren().remove(ellipse.getChildren().size()-1);
        ellipse.getChildren().add(canvas);
    }
    @FXML
    void drawTriangle(){
        Canvas canvas = new Canvas(450,340);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double[] x = new double[3],y = new double[3];
        x[0] = Double.parseDouble(this.x5.getText());
        x[1] = Double.parseDouble(this.x6.getText());
        x[2] = Double.parseDouble(this.x7.getText());
        y[0] = Double.parseDouble(this.y5.getText());
        y[1] = Double.parseDouble(this.y6.getText());
        y[2] = Double.parseDouble(this.y7.getText());
        if(checkTriangle.isSelected()){
            gc.setFill(Color.YELLOW);
            gc.fillPolygon(x,y,3);
        }
        else {
            gc.setStroke(Color.YELLOW);
            gc.strokePolygon(x,y,3);
        }
        triangle.getChildren().remove(triangle.getChildren().size()-1);
        triangle.getChildren().add(canvas);
    }
}
