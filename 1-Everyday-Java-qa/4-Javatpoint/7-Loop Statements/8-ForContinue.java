public class ForContinue {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;       // it says that when the value is 5 ignore the value and move ahead i.e 1 2 3 4 6 7 8 9 10
            } else{
                System.out.println(i);
            }
        }
    }
}
/*Output comes out as 
1
2
3
4
6
7
8
9
10
*/
