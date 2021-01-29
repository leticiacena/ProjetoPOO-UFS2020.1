module org.openjfx.ProjetoPOO_Leticia_Igor {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.ProjetoPOO_Leticia_Igor to javafx.fxml;
    exports org.openjfx.ProjetoPOO_Leticia_Igor;
}