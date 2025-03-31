import java.util.*;

// Base User class
class User {
    String userId, name, email;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}

// Student class inheriting from User
class Student extends User {
    List<Job> appliedJobs = new ArrayList<>();

    public Student(String userId, String name, String email) {
        super(userId, name, email);
    }

    public void applyForJob(Job job) {
        if (appliedJobs.size() >= 5) {
            throw new ApplicationLimitExceededException("You cannot apply for more than 5 jobs.");
        }
        appliedJobs.add(job);
        System.out.println(name + " applied for " + job.title);
    }
}

// Company class inheriting from User
class Company extends User {
    List<Job> postedJobs = new ArrayList<>();

    public Company(String userId, String name, String email) {
        super(userId, name, email);
    }

    public void postJob(Job job) {
        postedJobs.add(job);
        System.out.println(name + " posted job: " + job.title);
    }
}

// Job class
class Job {
    String jobId, title, description;
    boolean isFilled;

    public Job(String jobId, String title, String description) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.isFilled = false;
    }
}

// Custom Exceptions
class JobNotFoundException extends RuntimeException {
    public JobNotFoundException(String message) {
        super(message);
    }
}

class ApplicationLimitExceededException extends RuntimeException {
    public ApplicationLimitExceededException(String message) {
        super(message);
    }
}

// Placement Portal class handling job applications
class PlacementPortal {
    List<Job> jobListings = new ArrayList<>();
    Map<Student, List<Job>> applications = new HashMap<>();
    Queue<String> interviewQueue = new LinkedList<>();

    public void addJob(Job job) {
        jobListings.add(job);
    }

    public Job findJobById(String jobId) {
        return jobListings.stream()
                .filter(job -> job.jobId.equals(jobId))
                .findFirst()
                .orElseThrow(() -> new JobNotFoundException("Job ID not found!"));
    }

    public void apply(Student student, String jobId) {
        Job job = findJobById(jobId);
        student.applyForJob(job);
        applications.putIfAbsent(student, new ArrayList<>());
        applications.get(student).add(job);
    }

    public void shortlistStudent(Student student) {
        interviewQueue.add(student.name + " has been shortlisted for an interview!");
    }

    public void processNotifications() {
        while (!interviewQueue.isEmpty()) {
            System.out.println(interviewQueue.poll());
        }
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        PlacementPortal portal = new PlacementPortal();

        // Creating a company and posting jobs
        Company company = new Company("C001", "TechCorp", "hr@techcorp.com");
        Job job1 = new Job("J001", "Software Engineer", "Develop applications.");
        Job job2 = new Job("J002", "Data Analyst", "Analyze data.");
        company.postJob(job1);
        company.postJob(job2);

        portal.addJob(job1);
        portal.addJob(job2);

        // Creating a student and applying for a job
        Student student = new Student("S001", "Alice", "alice@gmail.com");
        portal.apply(student, "J001");

        // Shortlisting student for an interview
        portal.shortlistStudent(student);
        portal.processNotifications();
    }
}
