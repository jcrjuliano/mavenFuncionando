package br.com.fatec.my_app;


public class TesteRest {
	
	public static void main(String[] args) {
		REST rotasRest = new REST(new Model());
		rotasRest.getQuestionByNumber();
		rotasRest.getStudentCompetencies();
	}

}
