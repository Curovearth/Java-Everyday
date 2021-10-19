/*Do-while checks the condition at the end of the loop after executing the loop statements. */

class main{
    public static void main(String[] args){
        int i=2;
        System.out.println("Printing the list of first 10 even numbers:\n");
        do{
            System.out.println(i);
            i+=2;
        } while(i<=10);
    }
}

//When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.