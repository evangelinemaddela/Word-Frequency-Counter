import java.util.*;

public class wordfreq {
    public static void analyzeText(Scanner scanner){
        System.out.println("\n Enter a sentence or paragraph:");
        String input = scanner.nextLine();

        //Convert to lowercase so that it is readable
        input = input.toLowerCase();

        //Remove punctuation
        input = input.replaceAll("[^a-z\\s]", "");

        //Split words 
        String [] words = input.trim().split("\\s+");

        //HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word: words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+ 1);
            }
            else{
                wordCount.put(word, 1);
            }
        }

        System.out.println("\nWord Frequency: ");

        for(String word: wordCount.keySet()){
            System.out.println(word+":"+wordCount.get(word));
        }

    }
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int choice;

            do { 
                System.out.println("\n***WORD FREQUENCY COUNTER***");
                System.out.println("1 Analyze Text");
                System.out.println("2 Exit");
                System.out.println("Choose an option:");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice){

                    case 1:
                        analyzeText(scanner);
                        break;
                    case 2:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } while (choice !=2);
            scanner.close();
        }
    }