module org.example.game2048 {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens org.example.game2048 to javafx.fxml;
    exports org.example.game2048;
}