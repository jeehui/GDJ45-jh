package ex04_string;

public class Ex01_StringReview {

	public static void main(String[] args) {
		
		String str = "abcdefg123hj";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= '0' && c <= '9') {
				continue; // continue문은 반복문을 완전히 빠져나가지 않으면서 반복문 내의 작업문을 건너뛸 때 사용한다.
			}
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str2 = "hello";
		boolean res1 = str2.equals("hello");
		boolean res2 = str2.equals("Hello");
		boolean res3 = str2.equalsIgnoreCase("Hello");
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		String str3 = "안녕하세요";
		String res4 = str3.substring(2);
		String res5 = str3.substring(0, 2);
		System.out.println(res4);
		System.out.println(res5);
		
		String str4 = "abcdefghijka";
		
		int idx1 = str4.indexOf("d");
		int idx2 = str4.indexOf("b");
		int idx3 = str4.indexOf("z");
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		
		int idx4 = str4.lastIndexOf("a");
		
		System.out.println(idx4);
		
		String origin = "용기의 노래.mp4";
		int dotindex = origin.lastIndexOf(".");
		String song = origin.substring(0, dotindex);
		String exname = origin.substring(dotindex + 1);
		String uploadname = song + "_" + System.currentTimeMillis() + "." + exname;
		System.out.println(song);
		System.out.println(exname);
		System.out.println(uploadname);
		
		String[] songs = {
				"용기의 노래",
				"찬미",
				"조화의 노래",
				"태양의 노래"
		};
		
		for(int i = 0; i<songs.length; i++) {
			if(songs[i].endsWith("노래")) {
				System.out.println(songs[i]);
			}
		}
		
	}

}
