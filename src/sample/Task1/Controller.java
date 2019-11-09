package sample.Task1;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    AnchorPane pane;

    @FXML
    void figure() {
        double f = Math.floor(Math.random() * 4);
        Canvas canvas = new Canvas(500, 350);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        if (f == 0) {
            gc.setStroke(Color.BLUE);
            gc.setLineWidth(1);
            gc.strokeLine(Math.random() * 500, Math.random() * 350, Math.random() * 500, Math.random() * 350);
        } else if (f == 1) {
            double k = Math.round(Math.random());
            double a = Math.random() * 500;
            double b = Math.random() * 350;
            if (k == 0) {
                gc.setFill(Color.RED);
                gc.fillOval(Math.random() * (500 - a), Math.random() * (350 - b), a, b);
            } else {
                gc.setStroke(Color.RED);
                gc.strokeOval(Math.random() * (500 - a), Math.random() * (350 - b), a, b);
            }
        } else if (f == 2) {
            double k = Math.round(Math.random());
            double a = Math.random() * 500;
            double b = Math.random() * 350;
            if (k == 0) {
                gc.setFill(Color.GREEN);
                gc.fillRect(Math.random() * (500 - a), Math.random() * (350 - b), a, b);
            } else {
                gc.setStroke(Color.GREEN);
                gc.strokeRect(Math.random() * (500 - a), Math.random() * (350 - b), a, b);
            }
        } else {
            double k = Math.round(Math.random());
            if (k == 0) {
                gc.setFill(Color.YELLOW);
                gc.fillPolygon(
                        new double[]{Math.random() * 500, Math.random() * 500, Math.random() * 500},
                        new double[]{Math.random() * 350, Math.random() * 350, Math.random() * 500}, 3);
            } else {
                gc.setStroke(Color.YELLOW);
                gc.strokePolygon(
                        new double[]{Math.random() * 500, Math.random() * 500, Math.random() * 500},
                        new double[]{Math.random() * 350, Math.random() * 350, Math.random() * 350}, 3);
            }
        }
        pane.getChildren().add(canvas);
    }
}
