public class main{
    public static void main(String[] args){
        String a="Expert";          //here we have defined the string
        int level=0;
        switch(a){                  //switch control statement begins where we tend to find the case and accordingly assign the level to it
            case "Beginner": level=1;   
            break;
            case "Intermediate": level=2;
            break;
            case "Expert": level=3;
            break;
            default: level=0;
            break;
        }
        System.out.println("Hey mate you are an "+a+" having level as "+level);
    }
}
