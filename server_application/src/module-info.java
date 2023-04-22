module server_application {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
