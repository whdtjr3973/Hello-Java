// Varriable : Var
public class HelloVar {
	
	public static void main(String[] args) {
		
		// 숫자 30을 기억장치에 저장을 하고 기억장치에 num라는 이름표를 부착
		int num = 30;
		
		// 1. 30+40의 계산식을 기억장치에 저장을 하고 
		// 2. 기억장치에 sum이라는 이름표를 부착
		
		// 실제로는 
		// 가. 30을 임의의 기억장치에 저장하고
		// 나. 40을 임의이 기억장치에 저장한 후
		// 다. +기호를 만나
		// 라. 30과 40을 각각 연산장치로 이동
		// 마. 두 수를 덧셈 수행한 후
		// 바. 결과 값을 기억장치에 저장을 한 후
		// 사. 결과 값이 저장된 기억장치에 sum이라는 이름표를 부착
		int sum = 30 + 40;
		
		System.out.println(num + sum);
		
		
	}

}
