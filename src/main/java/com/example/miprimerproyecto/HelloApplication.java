package com.example.miprimerproyecto;

import javafx.application.Application;

import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Numbers");
        System.out.println("Please, read a number");
        int read = let.nextInt();
        System.out.println("Please, read another number");
        int read2 = let.nextInt();
        int SumBetweenFnS = read + read2;
        double div = (double) read/read2;
        System.out.println("The Result of First num + Second num= " + SumBetweenFnS);
        System.out.println("The Result of First num / Second num= " + div);
    }
}