package sukkiri17;

public class Rensyu17_1 {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());	//例外が発生する（NullPointerException）
		}catch(NullPointerException e) {//NullPointerExceptionをcatchする
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();	//スタックトレースを表示
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
		
	}
}
