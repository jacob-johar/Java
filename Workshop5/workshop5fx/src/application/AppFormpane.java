/**********************************************
Workshop 5
Course: JAC444 - Semester 4
Last Name: Johar
First Name: Jacob
ID: 102204195
Section: NCC
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:31 October 2020
**********************************************/
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class AppFormpane extends BorderPane {
	protected TextField FName = new TextField();
	protected TextField LName = new TextField();
	protected TextField City = new TextField(); 
	protected TextField Prov = new TextField(); 
	protected TextField Post = new TextField(); 
	protected Button Add = new Button("Add");
	protected Button First = new Button("First");
	protected Button Next = new Button("Next");
	protected Button Previous = new Button("Previous");
	protected Button Last = new Button("Last");
	protected Button Update = new Button("Update");
	private FlowPane paneForInfo = new FlowPane(5, 5);
	private HBox paneForButtons = new HBox(5);
	public AppFormpane() {
		drawAddressBook();
	}
	private void drawAddressBook() {	
		FName.setPrefColumnCount(23);
		LName.setPrefColumnCount(23);
		City.setPrefColumnCount(8);
		Prov.setPrefColumnCount(2);
		Post.setPrefColumnCount(6);
		paneForInfo.setPadding(new Insets(10, 10, 10, 10));
		paneForInfo.getChildren().addAll(new Label("First Name"), FName,new Label("Last Name"), LName, new Label("City   "), City, new Label("Province"), Prov, new Label("Postal Code"), Post);
		paneForButtons.getChildren().addAll(Add, First, Next, Previous, Last, Update);
		paneForButtons.setAlignment(Pos.CENTER);

		setCenter(paneForInfo);
		setBottom(paneForButtons);
	}
}