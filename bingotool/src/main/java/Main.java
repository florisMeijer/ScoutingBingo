import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    List<BingoCard> bingoCards = new ArrayList<>();
    List<String> round1 = new ArrayList<>();
    List<String> round2 = new ArrayList<>();
    List<String> round3 = new ArrayList<>();
    List<String> round4 = new ArrayList<>();

    public static void main(String[] args) {

        //check bingo cards
        //write bingo cards
    }

    public void createFile(String fileName) {

        if(!fileName.contains(".csv")){
            throw new IllegalArgumentException();
        }

        try {
            File file = new File(fileName);
            if(file.exists()){
                System.out.println("file already exsists. will still make one");
            }

            file.createNewFile();
            System.out.println("Empty File Created:- " + file.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BingoCard> createBingoCards(int number){

        for(int i =0; i<number; i++){
            BingoCard card = new BingoCard();
            generateAndCheckCard(card);
            bingoCards.add(card);
        }

        return bingoCards;
    }

    private void generateAndCheckCard(BingoCard card){

        int[][] card1 = card.generateCard1();
        boolean cardIsCorrect = false;
        while(!cardIsCorrect){
            if(round1.contains(card1)){
                card1 = card.generateCard1();
            }else{
                round1.add(card.getHash(card1));
                cardIsCorrect = true;
            }
        }

        int[][] card2 = card.generateCard2();
        cardIsCorrect = false;
        while(!cardIsCorrect){
            if(round2.contains(card2)){
                card2 = card.generateCard2();
            }else{
                round2.add(card.getHash(card2));
                cardIsCorrect = true;
            }
        }

        int[][] card3 = card.generateCard3();
        cardIsCorrect = false;
        while(!cardIsCorrect){
            if(round3.contains(card3)){
                card3 = card.generateCard3();
            }else{
                round3.add(card.getHash(card3));
                cardIsCorrect = true;
            }
        }

        int[][] card4 = card.generateCard4();
        cardIsCorrect = false;
        while(!cardIsCorrect){
            if(round4.contains(card4)){
                card4 = card.generateCard4();
            }else{
                round4.add(card.getHash(card4));
                cardIsCorrect = true;
            }
        }
    }

    public void writeFile(String fileName, List<BingoCard> cards) throws IOException {

        final FileWriter sw = new FileWriter(fileName);
        final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);


        for (BingoCard card : cards) {
            printer.printRecord(card.getLine());
        }


        printer.flush();
        printer.close();
    }
}