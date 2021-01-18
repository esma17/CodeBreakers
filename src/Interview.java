import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Interview {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<String> codeBreakers = new ArrayList<>(Arrays.asList("Adnan", "Mayasa", "Dean", "Inci", "Jamila", "Aiperi", "Jair", "Esma", "Jeren", "Hasanjan", "Seyfi", "Haben"));

        ArrayList<String> questions = new ArrayList<>(Arrays.asList("Difference between Thread.sleep and implicit wait time in selenium",
                "Example for severity and priority", "How would you handle exception",
                "What is the difference between findElement and FindElements",
                "What are locators in Selenium", "What is abstraction in java",
                "What is Adhoc testing", "Explain the difference between method overriding and method overloading",
                "Difference between final and finally keywords", "Difference between Arrays and ArrayList",
                "What is difference between Verification and Validation",
                "Please give examples for high severity low priority and low severity high priority defect",
                "What is the difference between re testing and regression testing", "How to find all links in a webpage", "What is your biggest Accomplishment?",
                "Where do you see yourself 5 years from now?",
                "Why we test?","What is positive testing?", "Happy Path testing?"));
        System.out.println(questions.get(rnd.nextInt(questions.size())) + "===>" + codeBreakers.get(rnd.nextInt(codeBreakers.size())));

    }
}
