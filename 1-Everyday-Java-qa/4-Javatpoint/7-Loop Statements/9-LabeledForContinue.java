public class LabeledForContinue {
    public static void main(String[] args){
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
/*Output comes out as
1 1
1 2
1 3
2 1
3 1
3 2
3 3
*/