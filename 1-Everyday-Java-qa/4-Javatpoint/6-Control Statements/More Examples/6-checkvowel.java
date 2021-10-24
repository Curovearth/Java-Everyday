// If the character is A,E,I,O,U it is a vowel else it's a consonant.

public class checkvowel {
    public static void main(String[] args){
        char ch='O';
        switch(ch){
            case 'a': System.out.println("Vowel");
            break;
            case 'e': System.out.println("Vowel");
            break;
            case 'i': System.out.println("Vowel");
            break;
            case 'o': System.out.println("Vowel");
            break;
            case 'u': System.out.println("Vowel");
            break;
            case 'A': System.out.println("Vowel");
            break;
            case 'E': System.out.println("Vowel");
            break;
            case 'I': System.out.println("Vowel");
            break;
            case 'O': System.out.println("Vowel");
            break;
            case 'U': System.out.println("Vowel");
            break;
            default: System.out.println("It's a consonant.");
            break;
        }
        System.out.println(ch);
    }
}
