
public class HellVar_06 {
	
	public static void main(String[] args) {

		
		// float=실수형(소수점이하 6자리까지)
		// float로 선언된 변수에 숫자값을 대입할때에는
		// 끝에 영소문자 f를 붙여준다(붙이지않을때 문법오류가 날경우가 있음)
		float korScore = 90f;
		float engScore = 80f;
		float mathScore = 70f;

		engScore = 88f;
		float sum = korScore + engScore + mathScore;
		System.out.println("총점 : " + sum);
		
		float avg = sum / 3;
		System.out.println("평균 : " + avg);
	
	
	}

}
