//Demonstrating nested switch example
//The program deals with college subject allotment on the basis of your branch and year at college.

public class NestedSwitch {
    public static void main(String[] args){
        // here branches refer to the different engineering branches where we present CSE with C, Electrical with E and Mechanical with M
        char branch='C';   
        // year represents the year of study at your college     
        int year=3;
        switch(year){
            case 1: // representing the students in their first year
                System.out.println("Subjects remain common which are English, Calculus and 12th basics of PCM");
                break;
            case 2: // representing the students in their second year
                switch(branch){
                    case 'C':
                        System.out.println("Subjects are Operating System and Data Structure");
                        break;
                    case 'E':
                        System.out.println("Subjects are Basics of Electrical and electronics and Calculus");
                        break;
                    case 'M':
                        System.out.println("Subjects are Engineering drawing and calculus.");
                        break;
                }
                break;
            case 3:
                switch(branch){
                    case 'C':
                        System.out.println("Subjects are Computer Org and multimedia");
                        break;
                    case 'E':
                        System.out.println("Subjects are network theory and Semiconductors");
                        break;
                    case 'M':
                        System.out.println("Subjects are robotics and renewable energy");
                        break;
                }
                break;
            case 4:
                switch(branch){
                    case 'C':
                        System.out.println("Subjects are Data communication and Networks");
                        break;
                    case 'E':
                        System.out.println("Subjects are Digital signal processing and Microcontrollers");
                        break;
                    case 'M':
                        System.out.println("Subjects are basics of avionics and electric vehicles.");
                        break;
                }
                break;
        }
    }
}
