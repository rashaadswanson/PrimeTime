module jf1 {
	requires javafx.controls;
	
	opens client_application to javafx.graphics, javafx.fxml;
}
