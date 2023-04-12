package sample02;

public class ExceptionApp1 {
	
	/**
	 *문자열을 전달받아서 정수로 변환해서 반환한다. 
	 * @param text 숫자로 구성된 문자열
	 * @return 정수값 
	 */
	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;
	}

	public static void main(String[] args) {
		
		try {
			int value = toInt("1234가");	// 예외 발생
			System.out.println(value);
		} catch (NumberFormatException ex) {
			String errorMessage = ex.getMessage();
			System.out.println("오류 메세지: " + errorMessage);
			
			String text = ex.toString();
			System.out.println("toString() -> " + text);
			
			ex.printStackTrace();	
		}

	}

}
