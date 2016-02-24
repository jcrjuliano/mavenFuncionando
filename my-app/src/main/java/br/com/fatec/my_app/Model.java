package br.com.fatec.my_app;
import java.util.LinkedList;
import java.util.List;



public class Model{
	
	//ObjectContainer students = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "../competencies.db4o");
	//ObjectContainer questions = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "../questions.db4o");
	private List<Student> students = new LinkedList<Student>(); 
	private List<Question> questions = new LinkedList<Question>(); 
	
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void addQuestion(Question question){
		questions.add(question);
	}
	
	
	public Student searchStudentByRA(int ra){
		
		
		/*Query query = students.query();
		query.constrain(Student.class);
	    ObjectSet<Student> allStudents = query.execute();*/
		
	    for(Student student: students){
	    	if(student.getRa()==ra){
	    		return student;
	    	}
	    	
	    }
	    
	    return null;

		
	}
	
	public Question searchQuestionByCode(int code){
		/*
		Query query = questions.query();
		query.constrain(Question.class);
	    ObjectSet<Question> allQuestions = query.execute();*/
		
	    for(Question question: questions){
	    	if(question.getNumber() == code){
	    		return question;
	    	}
	    	
	    }
	    
	    return null;
		
	}
	

}
