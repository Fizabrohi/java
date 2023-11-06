public class StudentDataProcessor {
    public static void main(String[] args) {
        // Step a: Declare and initialize studentData string
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
	
        // Step b: Split studentData into an array of individual student records
        String[] studentRecords = studentData.split(", ");

        // Step c: Create arrays to store student names and scores
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];

        // Step d: Populate arrays with data from split records using type casting
        for (int i = 0; i < studentRecords.length; i++) {
            String[] recordParts = studentRecords[i].split(":");
            studentNames[i] = recordParts[0];
            studentScores[i] = Integer.parseInt(recordParts[1]);
        }

        // Step e: Calculate and display the total number of students
        int totalStudents = studentNames.length;
        System.out.println("Total number of students: " + totalStudents);

        // Step f: Calculate and display the average score of all students
        int totalScore = 0;
        for (int score : studentScores) {
            totalScore += score;
        }
        double averageScore = (double) totalScore / totalStudents;
        System.out.println("Average score of all students: " + averageScore);

        // Step g: Find and display the highest score and the student who achieved it
        int highestScore = Integer.MIN_VALUE;
        String studentWithHighestScore = "";
        for (int i = 0; i < totalStudents; i++) {
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                studentWithHighestScore = studentNames[i];
            }
        }
        System.out.println("Highest score: " + highestScore + " achieved by " + studentWithHighestScore);

        // Step h: Find and display the lowest score and the student who achieved it
        int lowestScore = Integer.MAX_VALUE;
        String studentWithLowestScore = "";
        for (int i = 0; i < totalStudents; i++) {
            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                studentWithLowestScore = studentNames[i];
            }
        }
        System.out.println("Lowest score: " + lowestScore + " achieved by " + studentWithLowestScore);
    }
}
