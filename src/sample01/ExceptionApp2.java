package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionApp2 {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("src/sample01/sample.txt");		// 오류가 있을 경우 (오류를 만나면 catch문으로 점프함)
//			FileReader reader = new FileReader("src/sample01/sample01.txt");	// 정상적으로 적었을 경우
			BufferedReader br = new BufferedReader(reader);
			String text = br.readLine();
			System.out.println(text);
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
		} catch (IOException ex) {
			System.out.println("읽기 작업 중 오류가 발생하였습니다.");
		}	
	}

}
