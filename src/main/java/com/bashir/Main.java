package com.bashir;

import org.json.JSONArray;
import java.util.Scanner;
import static java.lang.System.exit;
public class Main
{
	public static void main( String[] args )
    {
    	JSONArray studentList = ReadTextFile.generateJasonArray();
		System.out.println("--------choice List-------");
		System.out.println(" 1.CSV\n 2.Jason\n 3.XML\n 4.exit");
		Scanner sc = new Scanner(System.in);
		while (true){
			String choice = sc.nextLine();
			if(choice.equals("1")){
				CreateCsvFile c = new CreateCsvFile();
				c.convert(studentList);
			}
			else if(choice.equals("2")){
				CreateJsonFile c = new CreateJsonFile();
				c.convert(studentList);
			}
			else if(choice.equals("3")){
				CreateXmlFile c = new CreateXmlFile();
				c.convert(studentList);
			}
			else if(choice.equals("4")){
				exit(0);
			}
			else System.out.println("u have entered a wrong choice");
		}
    }

}

