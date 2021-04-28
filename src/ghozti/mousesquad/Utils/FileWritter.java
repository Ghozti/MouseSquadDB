package ghozti.mousesquad.Utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWritter {

    public void writeToPeople(String content) throws IOException {
        File people = new File("D:/javaPrograms2/MouseSquadDB/src/ghozti/mousesquad/DB/files/PeopleAssisted.txt");
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(people), StandardCharsets.UTF_8))){
            writer.write(content);
        }
    }
}
