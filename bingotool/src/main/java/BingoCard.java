import java.util.ArrayList;
import java.util.List;

public class BingoCard {

    int[][] card1;
    int[][] card2;
    int[][] card3;
    int[][] card4;

    /*
    Kolom 1 bevat 5 getallen uit de reeks 1 t/m 15
    Kolom 2 bevat 5 getallen uit de reeks 16 t/m 30
    Kolom 3 bevat 4 getallen uit de reeks 31 t/m 45
    Kolom 4 bevat 5 getallen uit de reeks 46 t/m 60
    Kolom 5 bevat 5 getallen uit de reeks 61 t/m 75

    Dus eerst: 5 random getallen uit 1t/m15, dan 5 random getallen uit 16t/m30.

    4 kaarten per a4:
        2 gewone (24 getallen, 1-99)
        1 gewone maar dan van 2-99
        1 gewone van 1-75? over alle vakjes?? geen idee moet aan BJ vragen
     */

    public BingoCard(){}

    private List<Integer> generateUniqueNumbers(int min, int max, int count){

        List<Integer> numbers = new ArrayList<>();

        int range = max - min + 1;

        int rand;
        while(numbers.size() < count){
            rand = (int)(Math.random() * range) + min;
            if(!numbers.contains(rand)){
                numbers.add(rand);
            }
        }
        return numbers;
    }

    public int[][] generateCard1(){
        card1 = new int[5][5];

        List<Integer> numbers = generateUniqueNumbers(1,15,5);
        card1[0][0] = numbers.get(0);
        card1[0][1] = numbers.get(1);
        card1[0][2] = numbers.get(2);
        card1[0][3] = numbers.get(3);
        card1[0][4] = numbers.get(4);

        numbers = generateUniqueNumbers(16,30,5);
        card1[1][0] = numbers.get(0);
        card1[1][1] = numbers.get(1);
        card1[1][2] = numbers.get(2);
        card1[1][3] = numbers.get(3);
        card1[1][4] = numbers.get(4);

        numbers = generateUniqueNumbers(31,45,4);
        card1[2][0] = numbers.get(0);
        card1[2][1] = numbers.get(1);
        card1[2][2] = 0;
        card1[2][3] = numbers.get(2);
        card1[2][4] = numbers.get(3);

        numbers = generateUniqueNumbers(46,60,5);
        card1[3][0] = numbers.get(0);
        card1[3][1] = numbers.get(1);
        card1[3][2] = numbers.get(2);
        card1[3][3] = numbers.get(3);
        card1[3][4] = numbers.get(4);

        numbers = generateUniqueNumbers(61,75,5);
        card1[4][0] = numbers.get(0);
        card1[4][1] = numbers.get(1);
        card1[4][2] = numbers.get(2);
        card1[4][3] = numbers.get(3);
        card1[4][4] = numbers.get(4);

        return card1;
    }

    public int[][] generateCard2(){
        card2 = new int[5][5];

        List<Integer> numbers = generateUniqueNumbers(1,15,5);
        card2[0][0] = numbers.get(0);
        card2[0][1] = numbers.get(1);
        card2[0][2] = numbers.get(2);
        card2[0][3] = numbers.get(3);
        card2[0][4] = numbers.get(4);

        numbers = generateUniqueNumbers(16,30,5);
        card2[1][0] = numbers.get(0);
        card2[1][1] = numbers.get(1);
        card2[1][2] = numbers.get(2);
        card2[1][3] = numbers.get(3);
        card2[1][4] = numbers.get(4);

        numbers = generateUniqueNumbers(31,45,4);
        card2[2][0] = numbers.get(0);
        card2[2][1] = numbers.get(1);
        card2[2][2] = 0;
        card2[2][3] = numbers.get(2);
        card2[2][4] = numbers.get(3);

        numbers = generateUniqueNumbers(46,60,5);
        card2[3][0] = numbers.get(0);
        card2[3][1] = numbers.get(1);
        card2[3][2] = numbers.get(2);
        card2[3][3] = numbers.get(3);
        card2[3][4] = numbers.get(4);

        numbers = generateUniqueNumbers(61,75,5);
        card2[4][0] = numbers.get(0);
        card2[4][1] = numbers.get(1);
        card2[4][2] = numbers.get(2);
        card2[4][3] = numbers.get(3);
        card2[4][4] = numbers.get(4);

        return card2;
    }

    public int[][] generateCard3(){
        card3 = new int[5][5];

        List<Integer> numbers = generateUniqueNumbers(2,15,5);
        card3[0][0] = numbers.get(0);
        card3[0][1] = numbers.get(1);
        card3[0][2] = numbers.get(2);
        card3[0][3] = numbers.get(3);
        card3[0][4] = numbers.get(4);

        numbers = generateUniqueNumbers(16,30,5);
        card3[1][0] = numbers.get(0);
        card3[1][1] = numbers.get(1);
        card3[1][2] = numbers.get(2);
        card3[1][3] = numbers.get(3);
        card3[1][4] = numbers.get(4);

        numbers = generateUniqueNumbers(31,45,4);
        card3[2][0] = numbers.get(0);
        card3[2][1] = numbers.get(1);
        card3[2][2] = 0;
        card3[2][3] = numbers.get(2);
        card3[2][4] = numbers.get(3);

        numbers = generateUniqueNumbers(46,60,5);
        card3[3][0] = numbers.get(0);
        card3[3][1] = numbers.get(1);
        card3[3][2] = numbers.get(2);
        card3[3][3] = numbers.get(3);
        card3[3][4] = numbers.get(4);

        numbers = generateUniqueNumbers(61,75,5);
        card3[4][0] = numbers.get(0);
        card3[4][1] = numbers.get(1);
        card3[4][2] = numbers.get(2);
        card3[4][3] = numbers.get(3);
        card3[4][4] = numbers.get(4);

        return card3;
    }

    public int[][] generateCard4(){
        card4 = new int[5][5];

        List<Integer> numbers = generateUniqueNumbers(1,15,5);
        card4[0][0] = numbers.get(0);
        card4[0][1] = numbers.get(1);
        card4[0][2] = numbers.get(2);
        card4[0][3] = numbers.get(3);
        card4[0][4] = numbers.get(4);

        numbers = generateUniqueNumbers(16,30,5);
        card4[1][0] = numbers.get(0);
        card4[1][1] = numbers.get(1);
        card4[1][2] = numbers.get(2);
        card4[1][3] = numbers.get(3);
        card4[1][4] = numbers.get(4);

        numbers = generateUniqueNumbers(31,45,4);
        card4[2][0] = numbers.get(0);
        card4[2][1] = numbers.get(1);
        card4[2][2] = 0;
        card4[2][3] = numbers.get(2);
        card4[2][4] = numbers.get(3);

        numbers = generateUniqueNumbers(46,60,5);
        card4[3][0] = numbers.get(0);
        card4[3][1] = numbers.get(1);
        card4[3][2] = numbers.get(2);
        card4[3][3] = numbers.get(3);
        card4[3][4] = numbers.get(4);

        numbers = generateUniqueNumbers(61,75,5);
        card4[4][0] = numbers.get(0);
        card4[4][1] = numbers.get(1);
        card4[4][2] = numbers.get(2);
        card4[4][3] = numbers.get(3);
        card4[4][4] = numbers.get(4);

        return card4;
    }

    private String getLine(int[][] card){
        StringBuilder result = new StringBuilder();
        for(int[] line : card){
            for(int i : line){
                result.append(i + ",");
            }
        }
        return result.toString();
    }

    public String getLine(){
        StringBuilder result = new StringBuilder();

        result.append(getLine(card1));
        result.append(getLine(card2));
        result.append(getLine(card3));
        result.append(getLine(card4));

        return result.substring(0,result.toString().length()-1);
    }

    public String getHash(int[][] card){
        return getLine(card);
    }
}
