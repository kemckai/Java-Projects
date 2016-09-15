package Spellchecker;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;


public class SpellChecker {

	
	public static void main(String[] args) {
		
		Collection<String> dictionary = new HashSet<>();
		
		System.out.println("Choose dictionary file.\n");
		dictionary = createDictionary();
		
		if (dictionary.size() == 0) {
			System.out.println("No dictionary to perform spell "
				+ "checking operations.  Try Again.");
			System.exit(0);
		}
		
		System.out.println("Choose the file to spellcheck.\n");
		
		File file = getInputFileNameFromUser("Select File to spellcheck");
		
		if (file != null) {
			System.out.println("Here is the list of misspelled "
				+ "words and some possible correct spellings:\n");
			spellCheckWordsFromFile(file, dictionary);
		} else {
			System.out.println("No file selected to spell check.  Try Again");
		}
	}
	
	/**
	 * Obtains a user-selected file to be implemented as a dictionary.
	 * The words in the dictionary file should be separated by one or more
	 * non-letter characters.
	 * 
	 * @return The dictionary that has been filled with words
	 *     from the user's selected file.
	 */
	private static Collection<String> createDictionary()  {
		
		Collection<String> dict = new HashSet<>();
		
		File file = getInputFileNameFromUser("Select Dictionary File");
		
		if (file != null) {
			try {
				Scanner filein = new Scanner(file);
				
				while (filein.hasNext()) {
					String word = filein.next();
					word = word.toLowerCase();
					dict.add(word);
				}		
				filein.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("Can't find dictionary file.  No words "
					+ "added to dictionary.");
			}
		}
		
		return dict;
	}
	
	
	private static void spellCheckWordsFromFile(File f, Collection<String> dict) {
		
	
		Collection<String> wordsToOutput = new HashSet<>();
		
		try {
			Scanner in = new Scanner(f);
			in.useDelimiter("[^a-zA-Z]+");
			
			while (in.hasNext()) {
				String word = in.next();
				word = word.toLowerCase();
				
				if (!dict.contains(word)) {
					if (!wordsToOutput.contains(word)) {
						outputSuggestions(word, dict);
						wordsToOutput.add(word);
					}
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file to spell check words.");
		}
	}
	
	
	private static void outputSuggestions(String badWord, Collection<String> dict) {
		
		
		TreeSet<String> suggestions = new TreeSet<>();
		
		
		suggestions.addAll(corrections(badWord, dict));
		
		if (suggestions.size() == 0) {
			System.out.println(badWord + ": (no suggestions)");
		} else {
			
			/*
			 * Adapted Eck's code snippet from 10.4.2 to properly
			 * print elements separated with commas from a TreeSet
			 * of Strings.
			 */
			System.out.print(badWord + ": ");
			String firstWord = suggestions.first();  
			System.out.print(firstWord);
			for (String word : suggestions.tailSet(firstWord, false)) {
				System.out.print(", " + word);
			}
			System.out.println();
		}
	}
	
	
	private static Collection<String> corrections(String badWord, Collection<String> dict) {
		
		Collection<String> corrections = new TreeSet<>();
		
		// Variables to hold corrections the program considers.
		String deletedLetters;
		String changedLetters;
		String insertedLetters;
		String swappedLetters;
		String spaceInserted;
		
		for (int i = 0; i < badWord.length(); i++) {
			
			
			if (i < badWord.length() - 1) {
				char[] c = badWord.toCharArray();
				char temp = c[i];
				c[i] = c[i + 1];
				c[i + 1] = temp;
				
				swappedLetters = new String(c);
				
				if (dict.contains(swappedLetters)) {
					corrections.add(swappedLetters);
				}
			}
			
			
			if (dict.contains(badWord.substring(0,  i)) && dict.contains(badWord.substring(i))) {
				spaceInserted = badWord.substring(0, i) + ' ' + badWord.substring(i);
				corrections.add(spaceInserted);
			}
			
			
			for (char ch = 'a'; ch <= 'z'; ch++) {
				
				deletedLetters = badWord.substring(0, i) + badWord.substring(i + 1);
				if (dict.contains(deletedLetters)) {
					corrections.add(deletedLetters);
				}
				
				changedLetters = badWord.substring(0, i) + ch + badWord.substring(i + 1);
				if (dict.contains(changedLetters)) {
					corrections.add(changedLetters);
				}
				
				insertedLetters = badWord.substring(0, i) + ch + badWord.substring(i);
				if (dict.contains(insertedLetters)) {
					corrections.add(insertedLetters);
					
				// check adding each letter to end of badWord.
				} else if (dict.contains(badWord + ch)) {
					corrections.add(badWord + ch);
				}
			}
		}
		
		return corrections;
	}
	
   
    private static File getInputFileNameFromUser(String title) {
       JFileChooser fileDialog = new JFileChooser();
       fileDialog.setDialogTitle(title);
       int option = fileDialog.showOpenDialog(null);
       if (option != JFileChooser.APPROVE_OPTION)
          return null;
       else
          return fileDialog.getSelectedFile();
    }
}

