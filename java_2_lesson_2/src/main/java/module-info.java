module ru.gb.java_2.java_2_lesson_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.java_2.java_2_lesson_2 to javafx.fxml;
    exports ru.gb.java_2.java_2_lesson_2;
}