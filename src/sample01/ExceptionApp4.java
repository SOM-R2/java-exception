package sample01;

//import java.io.FileWriter;
//import java.io.IOException;

public class ExceptionApp4 {
	
	// Unchecked Exception 상황에선 예외처리(throws자동으로 이뤄짐 메인에서 한번만 예외처리하면됨)
	public static void test2(String str) {
		test1(str);  	// 2. 예외 전달 -> 예외처리 안함 -> 자동으로 예외 전달 
	}
	
	public static void test1(String str) {
		int number = Integer.parseInt(str);		// 1. 예외발생
		System.out.println("number -> " + number);
	}
	
	public static void main(String[] args) {
		try {
			test2("1234");
			test2("1234오");  // 3. main인 여기서 예외 위임받아서 예외처리한 후 catch를 출력 (예외 한번에 일괄처리) 
		} catch (NumberFormatException ex) {
			System.out.println("유효한 숫자형식의 문자열이 아닙니다.");
		}
		
	}
	
	// Checked Exception 상황에선 무조건 예외처리를 해줘야해서 귀찮음.. 
//	public static void test1() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test2();
//	}
//	
//	public static void test2() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test3();
//	}
//	
//	public static void test3() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test4();
//		
//		Class.forName("java.io.String");
//	}
//	
//	public static void test4() throws IOException {
//		FileWriter writer = new FileWriter("src/sample01/sample04.txt");
//		writer.write("파일쓰기 연습");
//		writer.close();
//	}
//	
//	public static void main(String[] args) {
//		
//		
//	}

}
