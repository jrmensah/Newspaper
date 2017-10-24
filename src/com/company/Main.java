package com.company;

import com.company.newspapers.Newspaper;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 String title = "";
	 String brand = "";
	 String answer= "";
	 String date;

	 Newspaper newspaper = new Newspaper();

	 ArrayList<Newspaper> articles = new ArrayList<Newspaper>();
	 Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("Please enter the name of the newspaper:");
            title = keyboard.nextLine();
            System.out.println("Please enter the brand of the newspaper:");
            brand = keyboard.nextLine();
            System.out.println("Please enter the title of the article:");
            title = keyboard.nextLine();
            System.out.println("Please enter the date of the article:");
            date = keyboard.nextLine();

            System.out.println("Would you like to add another record for the newspaper? (Y/N)");
            answer = keyboard.nextLine();
          }while(answer.equalsIgnoreCase("y")|| !answer.equalsIgnoreCase("n"));

            if(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
            {
                System.out.println("Invalid entry. Please enter 'Y' or 'N");
                answer = keyboard.nextLine();
            }
          }
//            for(Newspaper newspaper: articles)
//            {
//                System.out.println(articles.getTitle);
//                System.out.println(articles.getDate);
//            }

         

}
