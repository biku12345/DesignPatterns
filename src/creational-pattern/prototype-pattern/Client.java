public class Client {

    public static void main(String[] args) {
        Student student = new Student("Gaurav","122","A");
        Student cloneObj = (Student) student.getClone();
    }
}