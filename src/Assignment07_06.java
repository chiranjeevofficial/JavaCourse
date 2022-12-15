//6.	Define a class Question with fields queNo, que, optionA, optionB, optionC, optionD, answer.
//      Provide methods to set question and display question.
class Question{
    int queNo;
    String que, optA, optB, optC, optD, ans;
    void SetQuestion(int QuestionNo, String Question, String OptionA, String OptionB, String OptionC, String OptionD, String Answer){
        queNo=QuestionNo;
        que=Question;
        optA=OptionA;
        optB=OptionB;
        optC=OptionC;
        optD=OptionD;
        ans=Answer;
    }
    void displayQuestion(){
        System.out.println("Ques"+queNo+" "+que);
        System.out.println("(A) "+optA);
        System.out.println("(B) "+optB);
        System.out.println("(C) "+optC);
        System.out.println("(D) "+optD);
        System.out.println("Ans: "+ans);
    }
}
public class Assignment07_06 {
    public static void main(String []args){
        Question q1=new Question();
        q1.SetQuestion(1,"Which company does Java belong to?","Sun Micro","Google","Amazon","Oracle","Oracle");
        q1.displayQuestion();
    }
}
