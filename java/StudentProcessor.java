import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentProcessor {
    
    public static ArrayList<Student> readFile(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                String[] places = line.split("\\s+");
                
                if (places.length == 3) {
                    String surname = places[0];
                    String name = places[1];
                    double score = Double.parseDouble(places[2]);
                    
                    Student student = new Student(name, surname, score);
                    students.add(student);
                }
            }
            
            reader.close();
            
        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
        
        return students;
    }
    
    public static void main(String[] args) {
        ArrayList<Student> allStudents = readFile("studentsGroup1.txt");
        
        System.out.println("\t=== STUDENT REPORT ===\n");
        System.out.println("1. Students with score 5:");
        System.out.println("----------------------------------");
        allStudents.stream().filter(s -> s.getScore() == 5).forEach(s -> System.out.println("  " + s));
        System.out.println();

        System.out.println("2. Average score:");
        System.out.println("----------------------------------");
        double sum = 0;

        for (Student s : allStudents) {
            sum += s.getScore();
        }

        double average = sum / allStudents.size();
        System.out.printf("Average: %.1f%n ", average);
        System.out.println();

        System.out.println("3. Count of students with score 5:");
        System.out.println("----------------------------------");
        long count = allStudents.stream().filter(s -> s.getScore() == 5).count();
        System.out.println("Count: " + count);
    }
}