import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MainTest {

    @Test
    public void testCreateCsvFile() throws IOException {

        Main main = new Main();
        String fileName = System.getProperty("user.dir") +'\\' +"bingokaart.csv";

        main.createFile(fileName);
        List<BingoCard> list = main.createBingoCards(1000);
        main.writeFile(fileName, list);
    }

}