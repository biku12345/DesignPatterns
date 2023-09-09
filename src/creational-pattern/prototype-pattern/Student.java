public class Student implements Prototype{

    private String name;
    private String rollId;
    private String section;

    public Student(String name, String rollId, String section) {
        this.name = name;
        this.rollId = rollId;
        this.section = section;
    }

    @Override
    public Prototype getClone() {
        return new Student(name,rollId,section);
    }
}