class Student{
    public static void main(String args[]){
        String city="Delhi";

        if(city=="Mumbai"){
            System.out.println("The city is Mumbai");
        } else if(city=="Noida"){
            System.out.println("The city is Noida");
        } else if(city=="Agra"){
            System.out.println("The city is Agra");
        } else{
            System.out.println("You live somewhere else i.e., the city is " + city); 
        }
    }
}