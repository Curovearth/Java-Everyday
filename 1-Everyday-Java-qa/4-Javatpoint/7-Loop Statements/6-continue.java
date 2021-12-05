public class main{
    public static void main(String[] args){
        for(int i=0;i<=2;i++){
            for(int j=0;j<=5;j++){
                if(j==4){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
//here instead of breaking the loop at the value of 4, we say that when the value reaches 4 just ignore it and continue to the next values