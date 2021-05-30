import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabyrinthReader implements Reader {
    @Override
    public List<List<Character>> read(String address) {
        List<List<Character>> labyrinth = new ArrayList<>(new ArrayList<>());
        try(BufferedReader objReader = new BufferedReader(new FileReader(address))) {
            String currentLine=objReader.readLine();
            while ((currentLine = objReader.readLine()) != null) {
                List<Character> listOfLine = new ArrayList<>();
                for (int i = 0; i < currentLine.length(); i++) {
                    listOfLine.add(currentLine.charAt(i));
                }
                labyrinth.add(listOfLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return labyrinth;
    }
}
