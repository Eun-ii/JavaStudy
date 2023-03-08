package mypack;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("3.6.9 게임 박수자리엔 a 입력");
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;
		int seq = 1;
		while(istrue) {
			String str = sc.nextLine();
			istrue = Istrue(seq, str);
			seq++;
		}
		System.out.println("땡! 3.6.9 게임 끝!");
		
		sc.close();
	}
	
	static boolean Istrue(int seq, String item){
		String strSeq = String.valueOf(seq);
		int countseq = count369(strSeq);
		String strseq = "";
		
		//3/6/9순서 인지 확인
		if(countseq > 0) {
			for(int i = 0; i < countseq; i++) {
				strseq += 'a';
			}
			System.out.println(strseq + " " + item);
			if(strseq == item) {
				return true;
			}
		} else {
			if(seq == Integer.valueOf(item)) {
				return true;
			}
		}

		return false;
	}
	static int count369(String strSeq) {
		int count = 0;
		for (int i = 0; i < strSeq.length(); i++) {
            if (strSeq.charAt(i) == '3') {
                count++;
            }
            else if (strSeq.charAt(i) == '6') {
                count++;
            }
            else if (strSeq.charAt(i) == '9') {
                count++;
            }
        }
		return count;
	}
}