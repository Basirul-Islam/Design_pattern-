package com.bashir;

import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJsonFile implements Convertion {
    @Override
    public void convert(JSONArray studentList) {
        try {
            FileWriter file = new FileWriter("students.json");
            file.write(studentList.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
