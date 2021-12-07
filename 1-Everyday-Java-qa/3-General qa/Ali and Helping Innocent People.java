/*Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. 
Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. 
He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. 
Determine if the tag of the truck is valid or not.
We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format:
The first line contains a string of length 9. 
The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format:
Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)
*/

class validity
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();  
        char[] ch = str.toCharArray(); //Converting the string to a character array
        String[] arr = {"A","E","I","O","U","Y"}; //Creating a string array to store the given invalid string elements
        int flag = 0; //Initializing the flag conditon to work as a valid/invalid condition
        //In the if condition that follows we will check if the string length is 9, check if the character is in upper case, check if the character at index position at 6 contains '-', check if the string doesn't contain "0" and check if the sum of consecutive number yields an even number. If the condition satidfies we move inside the condition. 
        if (str.length()==9 && Character.isUpperCase(ch[2]) && ch[6]=='-' && str.contains("0")!=true && (ch[0]+ch[1])%2==0 && (ch[3]+ch[4])%2==0 && (ch[4]+ch[5])%2==0 && (ch[7]+ch[8])%2==0)
        {            
            for(int i=0;i<6;i++) //Intializing the for loop for checking the string array
            {
                if (str.contains(arr[i])) //Checking if the string contains values from arr
                {
                    flag = 1; //When the if conditon is met it changes the flag value
                    break; //Breaks the loop 
                }
                else
                {
                    flag = 0; //Continues with the same value and the loop continues
                }
            }
            if (flag==1)
            {
                System.out.println("invalid");
            }
            else
            {
                System.out.println("valid");
            }
        }
        else 
        {
            System.out.println("invalid");
        }
        
    }
}
