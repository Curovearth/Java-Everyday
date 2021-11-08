//Richie and Riya are participating in a game called "Lucky pairs" at the Annual Game Fair in their Company. 
//As per the rules of the contest, two members form a team and Richie initially has the number A and Riya has the number B. 
//There are a total of N turns in the game, and Richie and Riya alternatively take turns. 
//In each turn the player whose turn it is, multiplies his or her number by 2. 
//Richie has the first turn. 
//Suppose after the entire N turns, Richie's number has become C and Riya's number has become D. 
//The final score of the team will be the sum of the scores (C+D) of both the players after N turns.

//Write a program to facilitate the quiz organizers to find the final scores of the teams.

import java.util.*;
class LuckyPair 
{
    public static void main(String[] args) 
    {
        //first we take three inputs from the user: A (Richie's initial number), B (Riya's initial number), N (number of turns)
          Scanner scan = new Scanner(System.in);
          int A = scan.nextInt();
          int B = scan.nextInt();
          int N = scan.nextInt();
          scan.close();
          //initializing the sum to zero
          int sum = 0;
          int i;
          //the loop runs for N turns
          for (i=1;i<N;i++);
          {
              if (i%2!=0)
              {
                  //if the number of turn is odd then Richie multiplies
                  A = A*2;
              }
              else
              {
                  //if the number of turn is even then Riya multiplies
                  B = B*2;
              }
              sum = A+B;
          }
          System.out.print("Final Score: " + sum);
    }    
}
