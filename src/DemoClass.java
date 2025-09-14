class user {
    protected String name;
    protected String email;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void performRole(){
        System.out.println("No Specific role!");
    }
}


class students extends user {
    private final String[] enrollCourse = new String[15];
    private float[] grades= new float[15];
    private int coursecount = 0;
    private int gradecount = 0;

    public students(String name, String email) {
        super(name, email);
    }

    public void enrollCourse(String enrollcourse) {
        if (enrollCourse.length > coursecount) {
            enrollCourse[coursecount] = enrollcourse;
            coursecount++;
        }
    }
    public void getEnrollCourse(){
        for(String x:enrollCourse){
            System.out.println(x);
        }
    }

    public void setGrades(float grade) {
        if (grades.length > gradecount) {
            grades[gradecount] = grade;
            gradecount++;
        }
    }
    public void getGrades(){
        for(float x: grades){
            System.out.println(x);
        }
    }
    public void performRole(){
        System.out.println("Student Role!");
        for(String x:enrollCourse){
            System.out.println(x);
        }

    }

}

class teacher  extends user {
    private String[] Createcourse = new String[10];
    private int courselimit = 0;
    public teacher(String name, String email) {
        super(name, email);

    }

    public void getCreatecourse() {
        for(String x:Createcourse){
            System.out.println(x);
        }
    }

    public void setCreatecourse(String createcourse) {
        if (Createcourse.length > courselimit) {
            Createcourse[courselimit] = createcourse;
            courselimit++;
        }
    }

    @Override
    public void performRole() {
        System.out.println("Teacher Role!");
        for(String x:Createcourse){
            System.out.println(x);
        }
    }
}

class administrator extends user {
    private String[] UserData= new String[10];
    private int limit = 0;
    public administrator(String name, String email) {
        super(name, email);
    }

    public void getUserData() {
        for(String x:UserData){
            System.out.println(x);
        }
    }
    public void setUserData(String userdata) {
        if (UserData.length >= limit) {
            this.UserData[limit] = userdata;
            limit++;
        }
    }

    public void deleteUserData(String data) {

        for(int i=0;i<UserData.length;i++){
            if(UserData[i].equals(data)){
                for(int j=i;j<limit-1;j++){
                    UserData[j]=UserData[j+1];
                }
                UserData[limit-1]=null;
                limit--;
                System.out.println("Deleted UserData");
                return;
            }
        }
    }
    @Override
    public void performRole() {
        System.out.println("Admin Role!");
        for(String x:UserData){
            System.out.println(x);
        }
    }
}

public class DemoClass {
    public static void main(String[] args) {
        students s = new students("Salman", "Valid@gmail.com");
        teacher t = new teacher("Mahadi", "MahadiHasan@uiu.ac.bd");
        administrator ad = new administrator("CITS", "uiu.cits@gmail.com");
        s.setGrades(2.99f);
        s.setGrades(3.00f);
        s.setGrades(4f);

        s.enrollCourse("java");
        s.enrollCourse("c");

        t.setCreatecourse("History");
        t.setCreatecourse("Physics");

        // Administrator actions
        ad.setUserData("Alice");
        ad.setUserData("Mr. Bob");
        ad.deleteUserData("Alice");

        // Polymorphism demonstration
        user[] usr = {s,t,ad};
        for(user x:usr){
            x.performRole();
            System.out.println();
        }
    }
}