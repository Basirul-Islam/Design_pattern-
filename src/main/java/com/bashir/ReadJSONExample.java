package com.bashir;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

public class ReadJSONExample 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
	    //readTextFile();
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader("students.json"))
		{
			//Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray studentList = (JSONArray) obj;

            System.out.println(studentList);

            //Iterate over employee array
            studentList.forEach(new Consumer() {
				public void accept(Object std) {
                    System.out.println(std.toString());
					studentObject((JSONObject) std);

                    //Student s = (Student) std;

				}
			});

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}

	private static void studentObject(JSONObject student)
	{
		try{
            //Get employee object within list
            JSONObject studentObject = (JSONObject) student.get("student");

            //Get employee first name
            String Name = (String) studentObject.get("Name");
            System.out.println(Name);

            //Get employee Roll no
            String Roll = (String) studentObject.get("roll");
            System.out.println(Roll);

            //Get employee phoneNo
            Long phoneNo = (Long) studentObject.get("phoneNo");
            System.out.println(phoneNo);
            //Get employee website name
            String website = (String) studentObject.get("email");
            System.out.println(website);

        }catch (Exception e){
		    e.printStackTrace();

        }
	}
}
