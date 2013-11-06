/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.IOException;

/**
 *
 * @author gerrygj
 */
public class WordList {

    public String[] makeList() throws IOException {
        FileArrayProvider fap = new FileArrayProvider();
        String[] wordList = fap
                .readLines("src/hangman/words.txt");
        /*for (String line : wordList) { //display the list (array) of words - use for testing only
            System.out.println(line);
        }*/
        return wordList;
    }
    
    // Lorna & Gerald, L6 Paired Assignment
    public String[] sortList(String[] words) {
        String tmpWord;
        boolean notDone = true;
        
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < words.length-1; i++) {
                if (words[i].length() > words[i+1].length()) {
                    // swap words
                    tmpWord = words[i];
                    words[i] = words[i+1];
                    words[i+1] = tmpWord;
                    notDone = true;
                } 
            }
        }

        return words;
    }
    
    // Lorna & Gerald, L6 Paired Assignment
    // this function is just for the assignment
    public void displayWordList(String[] words) {
        System.out.println("\n\t===============================================================");
        System.out.println("\tHere is the sorted list of words:");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                break;
            }
                
            System.out.println("\t    " + words[i]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
