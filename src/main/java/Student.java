import assessments.AssessmentFeed;

import java.util.ArrayList;
import java.util.List;

import static assessments.AssessmentFeed.*;

public class Student{
    private String cid;//should be list of cids
    private String StudentType;
    private String assessmentName;
    private String subassessmentName;
    private String name;


    public Student(String cid, String name, String StudentType){
        this.cid = cid;
        this.name = name;
        this.StudentType = StudentType;

    }
    //public calcUGweighted(cid){
  //      return 0.3*IPT+0.7*AAPP

 //   }
 //   public calcMScweighted(cid){
  //      return 0.25*IPT+0.45*AAPP+0.3*SDV
//
  //  }
    public calunweightedav(cid){
        return sum(cid)/size(cid)
    }
    public AIcheckug(cid){
        if (PROGRAM_MARK-20>AI_PROJECT);
        else return false

    }







}
