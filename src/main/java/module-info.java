module com.example.javabasicejerciciotema2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicejerciciotema2 to javafx.fxml;
    exports com.example.javabasicejerciciotema2;
}