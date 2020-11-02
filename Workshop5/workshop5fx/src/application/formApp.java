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
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import java.io.*;

public class formApp extends Application {
	
	public static void main(String[] args) {
		launch();
	}
	protected AppFormpane pane = new AppFormpane();
	final int TEMPFNAME = 32; 
	final int TEMPLNAME = 32;  
	final int TEMPCITY = 20; 
	final int TEMPPROV = 2; 
	final int TEMPPOST = 7; 
	protected int i = 0;

	@Override 
	public void start(Stage primaryStage) {
	
		pane.Add.setOnAction(e -> add());
		pane.First.setOnAction(e -> first());
		pane.Next.setOnAction(e -> next());
		pane.Previous.setOnAction(e -> previous());
		pane.Last.setOnAction(e -> last());
		pane.Update.setOnAction(e -> update());


		Scene scene = new Scene(pane, 360, 130);
		primaryStage.setTitle(" WorkShop5"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	/** Write an address to file */
	private void add() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
			inout.seek(inout.length());
		 	write(inout);
		}
		catch (FileNotFoundException ex) {}
		catch (IOException ex) {}
		catch (IndexOutOfBoundsException ex) {}
	}
	private void first() {
		try (
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
			if (inout.length() > 0) {
				inout.seek(0);
				read(inout);
				System.out.println("Reading address #1");
				i = 1;
			}
			else {
				System.out.println("Address is empty!");
			}
		}
		catch (IOException ex) {
			
		}
	}
	/** Read the next Address from the file */
	private void next() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
			if (i * 93 < inout.length()) {
				inout.seek(i * 93);
				read(inout);
				i++;
				System.out.println("Reading" + i);
			}
			else {
				System.out.println("End of file!");
			}
		}
		catch (IOException ex) {
			
		}
	}
	private void previous() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
			if (i > 1) 
				i--;
			else
				i = 1;
			inout.seek((i * 93) - 93);
			read(inout);
			System.out.println("Reading address #" + i);
		}
		catch (IOException ex) {
			
		}
	}
	private void last() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
			i = ((int)inout.length()) / 93;
			inout.seek((i * 93) - 93);
			read(inout);
			System.out.println("Reading address #" + i);
		}
		catch (IOException ex) {}
	}
	private void update() {
		try ( 
			RandomAccessFile inout = 
				new RandomAccessFile("Application.dat", "rw");
		) {
		 	inout.seek(i * 93 - 93);
		 	write(inout);
		}
		catch (FileNotFoundException ex) {}
		catch (IOException ex) {}
	}
	private void write(RandomAccessFile inout) throws IOException {
		
		inout.write(fixedLength(pane.FName.getText().getBytes(), TEMPFNAME)); 
		inout.write(fixedLength(pane.LName.getText().getBytes(), TEMPLNAME));
		inout.write(fixedLength(pane.City.getText().getBytes(), TEMPCITY));
		inout.write(fixedLength(pane.Prov.getText().getBytes(), TEMPPROV));
		inout.write(fixedLength(pane.Post.getText().getBytes(), TEMPPOST));
		
		System.out.println("Address #" + i + " saved!");
	}

	
	private void read(RandomAccessFile inout) throws IOException {
		int pos;
		
		byte[] fname = new byte[TEMPFNAME];	
		pos = inout.read(fname);
		pane.FName.setText(new String(fname));
		byte[] lname = new byte[TEMPLNAME];	
		pos = inout.read(lname);
		pane.LName.setText(new String(lname));
		byte[] city = new byte[TEMPCITY];	
		pos += inout.read(city);
		pane.City.setText(new String(city));
		byte[] prov = new byte[TEMPPROV];	
		pos += inout.read(prov);
		pane.Prov.setText(new String(prov));
		byte[] zip = new byte[TEMPPOST];	
		pos += inout.read(zip);
		pane.Post.setText(new String(zip));
	}
	private byte[] fixedLength(byte[] x, int n) {
		byte[] b = new byte[n];
		for (int i = 0; i < x.length; i++) {
			b[i] = x[i];
		}
		return b;
	}
	
}
