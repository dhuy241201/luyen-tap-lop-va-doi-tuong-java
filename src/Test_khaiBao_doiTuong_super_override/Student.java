package Test_khaiBao_doiTuong_super_override;

class Student {
    private String name;
    private int id;
    public Student(){}
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void sayMyName(){
        System.out.println("1234");
    }
}

class Superstudent extends Student{
    private int level;
    public Superstudent(){}
    public Superstudent(String name, int id, int level){
        super(name, id);
        this.level = level;
    }
    @Override
    public void sayMyName(){
        System.out.println("5678");
        super.sayMyName();
    }
}



class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Codegym",123);
        System.out.println(student1.getName());
        student1.sayMyName();


        Superstudent superstudent1 = new Superstudent("Beast",111,999);
        System.out.println(superstudent1.getName());
        superstudent1.sayMyName();
    }
}



