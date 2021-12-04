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
        System.out.println(str);  
        char s = str.charAt(2);
        char s2 =str.charAt(6);
        String s1 = Character.toString(s);
        System.out.println(s1);
        if (str.length()==9 && Character.isUpperCase(s) && s2=='-' && str.contains("0")!=true)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
