package br.ufrpe.bcc.ip2.utils;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static String readFile(String filename) {
        StringBuffer sb = new StringBuffer();
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                sb.append(input.nextLine() + "\n");
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
