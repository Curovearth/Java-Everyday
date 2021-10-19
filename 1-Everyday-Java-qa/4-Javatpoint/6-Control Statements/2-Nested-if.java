class main{
    public static void main(String args[]){
        String address= "Tokyo, Japan";

        if(address.endsWith("India")){
            if(address.contains("Meerut")){
                System.out.println("Ohh you live in Meerut");
            } else if(address.contains("Agra")){
                System.out.println("Ohh you live in Agra");
            } else{
                System.out.println("Hey, you live in" + address.split(",")[0]);
            }
        }else{
            System.out.println("Hey, Hey you don't live in India, you live in "+address.split(",")[1]);
        }
    
}