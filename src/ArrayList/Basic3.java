package ArrayList;

import java.util.Comparator;

class st{
    int id;
    double cgpa;
    String name;

    public st(int id, double cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }
}




class Numcomp implements Comparator<st> {
    @Override
    public int compare(st a,st b) {
        if(a.cgpa > b.cgpa)return -1;
        else if(a.cgpa < b.cgpa) return 1;
        else return 0;
    }

}




public class Basic3 {

}
