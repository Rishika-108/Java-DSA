public class Variable {
    public static void main(String[] args) {
        int age;
        String name;
        double height;
        char StartLetter;
        boolean isStudent;
        name =  "Rishika";
        age = 20;
        height = 5.5;
        StartLetter =  'R';
        isStudent = true; 
        System.out.println ( "My name is :  " + name +  " Age : " + age +  " Height : " + height +
                             " Starting Letter : " + StartLetter +  " Is She is a Student : " + isStudent
        ) ;
        int [] marks = new int[2];
        marks [0] = 85;
        marks[1] = 90;
        System.out.println ( "Marks in subjects are :  " + marks[0] +  " and " + marks[1]);

        final int constant = 24; //Final is used to declare a variable as constant
        System.out.println (constant);

    }
}
