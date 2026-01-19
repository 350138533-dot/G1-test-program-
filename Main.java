//Kyle Mok
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //greeting to the user
        System.out.println("heloo user, welcome to G1 test");

        //Display of the menu
        System.out.println("1)write the G1 test");
        System.out.println("2) log as admin");
        System.out.println("Choose a option");

        //user chocie from the display menu
        int choice = input.nextInt();

        //user login as admin
        if (choice == 2) {
            System.out.println("Enter admin password");
            String password = input.next();
            if (password.equals("admin67")) {
                System.out.println("admin access granted");
                System.out.println("Feature not fully implemented (Grade 11 demo)");
            }
            //user chocie to do the G1 test
        } else if (choice == 1) {
            ArrayList<String> QuestionA = new ArrayList<>();
            ArrayList<String> optionAA = new ArrayList<>();
            ArrayList<String> optionBA = new ArrayList<>();
            ArrayList<String> optionCA = new ArrayList<>();
            ArrayList<String> optionDA = new ArrayList<>();
            ArrayList<String> answerA = new ArrayList<>();

            //Add the question, option and answer to each separate arraylist
            QuestionA.add("What must you do at a red traffic light?");
            optionAA.add("stop");
            optionBA.add("slow down");
            optionCA.add("Jump off the car");
            optionDA.add("Honk");
            answerA.add("A");

            QuestionA.add("What is the legal blood alcohol level for a G2 driver?");
            optionAA.add("0.2%");
            optionBA.add("0%");
            optionCA.add("0.03");
            optionDA.add("0.5");
            answerA.add("B");

            QuestionA.add("What does a flashing red light mean?");
            optionAA.add("keep going");
            optionBA.add("Slow down");
            optionCA.add("stop completely ");
            optionDA.add("Yield");
            answerA.add("C");

            QuestionA.add("What most you yield to pedestrian?");
            optionAA.add("only on highway");
            optionBA.add("only at night");
            optionCA.add("Never");
            optionDA.add("At corsswalks");
            answerA.add("D");

            QuestionA.add("What does yellow light mean?");
            optionAA.add("Go faster");
            optionBA.add("prepare to stop");
            optionCA.add("stop immediately");
            optionDA.add("pedestrian crossing");
            answerA.add("B");

            QuestionA.add("who has a right of way at a 4 way stop?");
            optionAA.add("First vehicle to stop");
            optionBA.add("fastest vehicle");
            optionCA.add("smallest vehicle");
            optionDA.add("vehicle on the left");
            answerA.add("A");

          //adding the question, option and answer for part b in a separate arryalist
            ArrayList<String> QuestionB = new ArrayList<>();
            ArrayList<String> optionAB = new ArrayList<>();
            ArrayList<String> optionBB = new ArrayList<>();
            ArrayList<String> optionCB = new ArrayList<>();
            ArrayList<String> optionDB = new ArrayList<>();
            ArrayList<String> answerB = new ArrayList<>();

            QuestionB.add("What does a stop sign look like?");
            optionAB.add("Red octagon");
            optionBB.add("Yellow triangle");
            optionCB.add("Blue circle");
            optionDB.add("White square");
            answerB.add("A");

            QuestionB.add("What does a yield sign mean?");
            optionAB.add("Slow down and give right of way");
            optionBB.add("Stop always");
            optionCB.add("Speed up");
            optionDB.add("No enrty");
            answerB.add("A");

            QuestionB.add("What does a school zone sign mean?");
            optionAB.add("slow down and watch the children");
            optionBB.add("Parking allow");
            optionCB.add("No stopping");
            optionDB.add("Hospital ahead");
            answerB.add("A");

            QuestionB.add("what does a no entry sign mean?");
            optionAB.add("Do not enter");
            optionBB.add("One way road");
            optionCB.add("yield");
            optionDB.add("Stop");
            answerB.add("A");

            QuestionB.add("What does a green light mean?");
            optionAB.add("Go if intersection is clear");
            optionBB.add("Stop");
            optionCB.add("Yield");
            optionDB.add("Slow down");
            answerB.add("A");

            QuestionB.add("what does a pedestrian crossing sign warn you about?");
            optionAB.add("construction");
            optionBB.add("Animal only");
            optionCB.add("Railway crossing");
            optionDB.add("people crossing the road");
            answerB.add("D");

            int scoreA = 0;
            int askedA = 0;

            System.out.println("Part A : Road rule");

            //A loop to ask 6 question
            while (askedA < 6) {
                int index = (int) (Math.random() * QuestionA.size());

                System.out.println(QuestionA.get(index));
                System.out.println("A)" + optionAA.get(index));
                System.out.println("B)" + optionBA.get(index));
                System.out.println("C)" + optionCA.get(index));
                System.out.println("D)" + optionDA.get(index));

                System.out.println("Your answer");
                String userAnswer = input.next().toUpperCase();

                if (userAnswer.equals(answerA.get(index))) {
                    System.out.println("Coreect");
                    scoreA++;
                } else {
                    System.out.println("Incorrect");
                }

                QuestionA.remove(index);
                optionAA.remove(index);
                optionBA.remove(index);
                optionCA.remove(index);
                optionDA.remove(index);
                answerA.remove(index);
                askedA++;

                //determine is the user pass Part A
                if (askedA - scoreA > 2) {
                    System.out.println("You cannot pass Part A");
                    System.out.println("test terminated");
                    return;
                }
            }
            int scoreB = 0;
            int askedB = 0;

            System.out.println("Part B : Traffic sign");

            while (askedB < 6) {
                int index = (int) (Math.random() * QuestionB.size());

                System.out.println(QuestionB.get(index));
                System.out.println("A)" + optionAB.get(index));
                System.out.println("B)" + optionBB.get(index));
                System.out.println("C)" + optionCB.get(index));
                System.out.println("D)" + optionDB.get(index));

                System.out.println("Your answer");
                String userAnswer = input.next().toUpperCase();

                if (userAnswer.equals(answerB.get(index))) {
                    System.out.println("Coreect");
                    scoreB++;
                } else {
                    System.out.println("Incorrect");
                }

                QuestionB.remove(index);
                optionAB.remove(index);
                optionBB.remove(index);
                optionCB.remove(index);
                optionDB.remove(index);
                answerB.remove(index);
                askedB++;

                if (askedB - scoreB > 2) {
                    System.out.println("You cannot pass Part B");
                    System.out.println("test terminated");
                    return;
                }
            }


            //determine did the user pass the G1 test
            int totalScore = scoreA + scoreB;
            double percent = (totalScore / 12.0) * 100;

            System.out.println("Result");
            System.out.println("Part A" + scoreA + "/6");
            System.out.println("Part B" + scoreB + "/6");
            System.out.println("Final score : " + percent + "%");

            if (percent >= 75 && scoreA >= 4 && scoreB >= 4) {
                System.out.println("Pass congratulation");
            } else {
                System.out.println("Fail, try again");
            }



        }else{
            System.out.println("Invalid menu choice");
        }

    }
}
