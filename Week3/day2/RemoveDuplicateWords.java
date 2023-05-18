package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
String textchange = text.toLowerCase();
System.out.println("Original String with duplicate Words: "+textchange);
String[] allwords = textchange.split(" ");
String remove ="";
for(int i=0; i<allwords.length; i++) {

			
			for(int j=i+1; j<allwords.length; j++) {

				
				if(allwords[i].equals(allwords[j])) {

					
					allwords[j] = remove;
				}
			}
		}

		
		String result ="";

		
		Set<String> h = new LinkedHashSet<String>();


		for(String word: allwords) {

			if(word != remove) {

				result = result + word + " ";

			}
		}
		h.add(result);

		System.out.println("\nSentence after removing duplicate words: " + h);

	}

	}


