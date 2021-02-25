package com.company.io;


import com.company.models.InputData;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {

    File file;

    public Reader(String filename) {
        file = new File(Paths.get("").toAbsolutePath().toString() +
                "/src/com/company/input/" + filename);
    }

    public InputData read() {
        try {
            Scanner sc = new Scanner(file);
            InputData data = new InputData(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            data.fillData(sc);
            return data;
        } catch (Exception e) {
            System.out.println("error");
        }
        return null;
    }

}
