//Following example includes the syntax
//for(data_type var: array_name/collection_name)

class Calculate{
    public static void main(String[] args){
        String[] names={"Java","C","C++","Python","Javascript"};
        System.out.println("Printing the content of the array names:\n");

        for(String name: names){
            System.out.println(name);
        }
    }

}
//the output comes out to be
/*Java
C
C++
Python
Javascript */