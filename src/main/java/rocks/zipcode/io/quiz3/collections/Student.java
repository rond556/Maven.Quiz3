package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        for(Lab l : labs){
            if(l.getName().equals(labName)){
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus){
        Lab lab = getLab(labName);
        try{
        lab.setStatus(labStatus);
        } catch (Exception e){
            throw new UnsupportedOperationException(e);
        }

    }

    public void forkLab(Lab lab){
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab l : labs){
            if(l.getName().equals(labName)){
                return l.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = labs.size() - 1; i >= 0; i--) {
            sb.append(labs.get(i).getName() + " > " + getLabStatus(labs.get(i).getName()) + "\n");
        }
        String result = sb.toString();
        return result.trim();
    }
}
