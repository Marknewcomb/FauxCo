module com.newcomb.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.newcomb.javafx to javafx.fxml;
    exports com.newcomb.javafx;
}
