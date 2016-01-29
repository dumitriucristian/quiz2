package mathQuiz;

public class MathQuiz {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition quiz = new Addition();
		int result = quiz.validResult(15, 25);
		System.out.println(result);
		System.out.println(quiz.finalFailedMessage(result));
		
		
	}
	
	

}
