package hi.style;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class BakgrunnurController {

    public Region content;

    public void initialize()
    {
        DoubleProperty xPosition = new SimpleDoubleProperty(0);
        xPosition.addListener((observable, oldValue, newValue) -> setBackgroundPositions(content, xPosition.get()));
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(xPosition, 0)),
                new KeyFrame(Duration.seconds(200), new KeyValue(xPosition, -15000))
        );
        timeline.play();
    }

    private void setBackgroundPositions(Region region, double xPosition) {
        String style = "-fx-background-position: " +
                "left " + xPosition/6 + "px center," +
                "left " + xPosition/5 + "px bottom," +
                "left " + xPosition/4 + "px center," +
                "left " + xPosition/3 + "px top," +
                "left " + xPosition/2 + "px bottom," +
                "left " + xPosition + "px center;";
        region.setStyle(style);
    }


}