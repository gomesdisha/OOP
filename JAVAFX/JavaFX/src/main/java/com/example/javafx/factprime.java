package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.scene.control.ComboBox;


public class factprime extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 public void start(Stage primaryStage) {
primaryStage.setTitle("Fact_Prime");
 GridPane grid = new GridPane();
 grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));
    ComboBox<String> comboBox = new ComboBox<>();
    comboBox.getItems().addAll("fact", "prime");
    comboBox.setValue("fact");
    grid.add(comboBox, 0, 1);
    Label i = new Label("Int val:");
    grid.add(i, 0, 2);
    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 2);
    Label r = new Label("res:");
    grid.add(r, 0, 4);
    Button btn = new Button("compute");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 0,3);
    TextField p= new TextField();
    grid.add(p, 1, 4);
    btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e) {
          String selectedItem = comboBox.getSelectionModel().getSelectedItem();
          if(selectedItem=="fact")
          {
            int a=Integer.parseInt(userTextField.getText());
            Fact f=new Fact();
            int fact=f.call1(a);
            String s=Integer.toString(fact);
            p.setText(s);
          }
          else
 {
int a=Integer.parseInt(userTextField.getText());
 Prime pr=new Prime();
String s=pr.call2(a);
 p.setText(s);
 }
}
});
Scene scene = new Scene(grid, 300, 300);
 primaryStage.setScene(scene);
 primaryStage.show();
 }
}

class Fact extends Thread
{
  static int n;
  static int Fa=1;
  public void run()
  {
    for(int j=1;j<=n;j++)
    {Fa*=j;}
  }
  public int call1(int A)
  {
    this.n=A;
    Fact F=new Fact();
    Fa=1;
    Thread t1=new Thread(F);
    t1.start();
    try{t1.join();}catch(Exception e){}
    return Fa;
  }
}

class Prime extends Thread
{
  static int n;
  static String temp="";
  public void run()
  {
    int c=1;
    for(int j=2;j<=n;j++)
    {
     for(int k=2;k<j;k++)
     {
       if(j%k==0)
       {c=0;}
     }
     if(c==1)
     {
        temp=temp+Integer.toString(j)+", ";
     }
     c=1;
     System.out.println("q");
    }
  }
  public String call2(int A)
  {
    this.n=A;
    Prime P=new Prime();
    Thread t1=new Thread(P);
    temp="";
    t1.start();
    try{
      t1.join();
    }catch(Exception e){}
    System.out.println("2");
    return temp;
  }
}

