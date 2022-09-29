package Assignment;



public class Student {
    private int id;
    private String fname;
    private Double cgpa;
    
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public Double getCgpa() {
        return cgpa;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
}
