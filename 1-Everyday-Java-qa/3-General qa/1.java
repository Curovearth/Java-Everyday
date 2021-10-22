// an example to print the classloader name

class Loader {
    public static void main(String[] args){
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
        // System.out.println("Swarup tripathy this side");
    }
}
