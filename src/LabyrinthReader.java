import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabyrinthReader implements Reader {
    @Override
    public List<List<Character>> read(String address) {
        List<List<Character>> listOfLabyrinth = new ArrayList<>(new ArrayList<>());
        try (BufferedReader objReader = new BufferedReader(new FileReader(address))) {
            String currentLine;
            objReader.readLine();
            while ((currentLine = objReader.readLine()) != null) {
                List<Character> listOfLine = new ArrayList<>();
                for (int i = 0; i < currentLine.length(); i++) {
                    listOfLine.add(currentLine.charAt(i));
                }
                listOfLabyrinth.add(listOfLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLabyrinth;
    }
}
