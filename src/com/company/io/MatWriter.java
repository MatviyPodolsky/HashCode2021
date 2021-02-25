package com.company.io;

import com.company.models.OutputData;

import java.io.File;
import java.io.FileWriter;

public class MatWriter {

    File file;

    public MatWriter(String filename) {
        file = new File("src/com/company/matviy/output/" + filename);
    }

    public void write(OutputData data) {
        StringBuilder sb = new StringBuilder();
        sb.append(data.getPizzaCount());
        sb.append("\n");
        for (int i = 0; i < data.getPizzaCount(); i++) {
            sb.append(data.getPizzas()[i]);
            sb.append(" ");
        }

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(sb.toString());
            writer.flush();
            writer.close();
        } catch (Exception exp) {
        }
    }

}
