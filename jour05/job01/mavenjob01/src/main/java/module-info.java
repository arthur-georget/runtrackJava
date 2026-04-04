module job01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens job01 to javafx.fxml;
    exports job01;
}
