package ghozti.mousesquad;

import ghozti.mousesquad.Utils.FileWritter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWritter writter = new FileWritter();
        writter.writeToPeople("lol");
    }
}
