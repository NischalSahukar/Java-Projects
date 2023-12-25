package proj0;
import java.util.Scanner;
public class javaquiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the Java Quiz Game");
System.out.println("Instructions to be noted:");
System.out.println("The test contains 10 questions and there is no time limit.");
System.out.println("The test is not official, it's just a nice way to see how much you know, or don't know, about Java.");
System.out.println("You will get 1 point for each correct answer. At the end of the Quiz, your total score will be displayed. Maximum score is 10 points.");
Scanner scanner = new Scanner(System.in);
int score = 0;

    System.out.println("What is JDK stands for?");
    System.out.println("a. Java Deployment Kit");
    System.out.println("b. Java Develop Kotlin");
    System.out.println("c. Java Development Kit");
    String answer1 = scanner.nextLine().toLowerCase(); 
    if (answer1.equals("c")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Who is credited with creating Java?");
    System.out.println("a. Steve Jobs");
    System.out.println("b. James Gosling");
    System.out.println("c. Bjarne Stroustrup");
    String answer2 = scanner.nextLine().toLowerCase(); 
    if (answer2.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Number of primitive data types in Java are?");
    System.out.println("a. 8");
    System.out.println("b. 6");
    System.out.println("c. 7");
    String answer3 = scanner.nextLine().toLowerCase(); 
    if (answer3.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Select the valid statement");
    System.out.println("a. char[] ch= new char[]");
    System.out.println("b. char() ch= new char()");
    System.out.println("c. char[] ch= new char[6]");
    String answer4 = scanner.nextLine().toLowerCase(); 
    if (answer4.equals("c")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Arrays in java are-");
    System.out.println("a. Object References");
    System.out.println("b. Primitive Datatype");
    System.out.println("c. Objects");
    String answer5 = scanner.nextLine().toLowerCase(); 
    if (answer5.equals("c")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Which of these cannot be used for a variable name in Java?");
    System.out.println("a. Identifier");
    System.out.println("b. Keyword");
    System.out.println("c. Both");
    String answer6 = scanner.nextLine().toLowerCase(); 
    if (answer6.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("What is the extension of java code files?");
    System.out.println("a. .java");
    System.out.println("b. .class");
    System.out.println("c. .js");
    String answer7 = scanner.nextLine().toLowerCase(); 
    if (answer7.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("class output {\r\n"
    		+ "        public static void main(String args[]) \r\n"
    		+ "        {\r\n"
    		+ "            double a, b,c;\r\n"
    		+ "            a = 3.0/0;\r\n"
    		+ "            b = 0/4.0;\r\n"
    		+ "            c=0/0.0;\r\n"
    		+ " \r\n"
    		+ "	    System.out.println(a);\r\n"
    		+ "            System.out.println(b);\r\n"
    		+ "            System.out.println(c);\r\n"
    		+ "        } \r\n"
    		+ "    }");
    System.out.println("a. Infinity");
    System.out.println("b. 0.0");
    System.out.println("c. Both");
    String answer8 = scanner.nextLine().toLowerCase(); 
    if (answer8.equals("c")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println(" class variable_scope \r\n"
    		+ "    {\r\n"
    		+ "        public static void main(String args[]) \r\n"
    		+ "        {\r\n"
    		+ "            int x;\r\n"
    		+ "            x = 5;\r\n"
    		+ "            {\r\n"
    		+ "	        int y = 6;\r\n"
    		+ "	        System.out.print(x + \" \" + y);\r\n"
    		+ "            }\r\n"
    		+ "            System.out.println(x + \" \" + y);\r\n"
    		+ "        } \r\n"
    		+ "    }");
    System.out.println("a. Compilation error");
    System.out.println("b. Runtime error");
    System.out.println("c. 5 6 5 6");
    String answer9 = scanner.nextLine().toLowerCase(); 
    if (answer9.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    
    System.out.println("Which of these are selection statements in Java?");
    System.out.println("a. for()");
    System.out.println("b. if()");
    System.out.println("c. while()");
    String answer10 = scanner.nextLine().toLowerCase(); 
    if (answer10.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    }
    System.out.println("Your final score is: " + score); 
	}

}
