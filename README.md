# G1 test road rule application
# Name : Kyle Mok

#Program description 
This program is for simulate a ontario G1 written test  on the ontario road rule and traffic sign. The user in the program will receive a greeting message first than it will have two option at the display menu, one is writing the G1 test and the other option is user can login as admin. If user choose to write the G1 test, the test contain two section of the test, one is the road rule test(Part A), and the other section is the traffic sign test(Part B), each section ask 6 multiple choice. To pass the test, user need to score atleast a 75%, and at least get 4 question correct for each section.

       # Variables and data structure used 
        Scanner input = new Scanner(System.in); : this use to receive input from the user
        ArrayList<String> QuestionA, QuestionB : Store QuestionA and QuestionB in a arraylist for part a and b
        ArrayList<String> optionAA, optionBA, optionCA, optionDA : this store the multiple choice in a arraylist for part a 
        ArrayList<String> optionAB, optionBB, optionCB, optionDB : this store the multiple choice in a arraylist for part b
        ArrayList<String> answerA, answerB : store all the answer in the arraylist for part a and b
        int scoreA, scoreB : keep track of the score each section
        int askedA, askedB : track hwo many question as been ask each section

        # Progam logic and structure 
        1. the program start with a greeting message to the user
        2. a display menu that have you option : 
             1) write the G1 test
             2) log in as admin
       3.if the user choose to log in as admin, it require the user to enter the passwork
       4. if user choose to write the G1 test, it have two section part a and part b :
            - the question are selected randomly.
            - the question are removed after being asked to prevent repetition
            - if the user are no longer pass, the test will end early 
       5. After both section, the final score and the result of pass or fail will displayed

       # Programming concept used 
       - variable 
       - if else statement
       - while loop
       - arraylist
       - string method 
       - math.random
