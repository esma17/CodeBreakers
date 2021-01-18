import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Interview {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<String> codeBreakers = new ArrayList<>(Arrays.asList("Adnan", "Mayasa", "Dean", "Inci", "Jamila", "Aiperi", "Jair", "Esma", "Jeren", "Hasanjan", "Seyfi", "Haben"));

        ArrayList<String> questions = new ArrayList<>(Arrays.asList("1.Difference between Thread.sleep and implicit wait time in selenium",
                "2.Example for severity and priority", "3.How would you handle exception",
                "4.What is the difference between findElement and FindElements",
                "5.What are locators in Selenium", "6.What is abstraction in java",
                "7.What is Adhoc testing", "8.Explain the difference between method overriding and method overloading",
                "9.Difference between final and finally keywords", "10.Difference between Arrays and ArrayList",
                "11.What is difference between Verification and Validation",
                "12.Please give examples for high severity low priority and low severity high priority defect",
                "13.What is the difference between re testing and regression testing", "14.How to find all links in a webpage", "What is your biggest Accomplishment?",
                "15.Where do you see yourself 5 years from now?",
                "16.Why we test?","17.What is positive testing?", "18.Happy Path testing?"));
        System.out.println(questions.get(rnd.nextInt(questions.size())) + "===>" + codeBreakers.get(rnd.nextInt(codeBreakers.size())));

    }
}
