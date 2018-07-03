/*
 *  문자열 테스트~!
 */

public class Main {
	public static void main(String[] args) {
		System.out.println("hello\n");
		
		StringBuffer sb = new StringBuffer();
		String str1 = "{ name: 메타몽, email: a@a.com , phone: 010-1234-5678 }";
		sb.append(str1);
		
//		int idx1 = str1.indexOf(":");
		int idx1 = sb.indexOf(":");
		System.out.println(" : 의 위치 >> " + idx1);
//		int end1 = str1.indexOf(",");
		int end1 = sb.indexOf(",");
		System.out.println(", 의 위치 >> " + end1 + "\n");
		
//		String ret1 = str1.substring(idx1 + 1, end1); // ret = return
		String ret1 = sb.substring(idx1 + 1, end1); // ret = return
		System.out.println("1. 찾은 문자열 >> " + ret1);
		
//		String str2 = str1.substring(end1 + 1, str1.length());
		sb.delete(0,  end1 + 1);
//		System.out.println(" 첫번째 문자열 찾은 다음 >> " + str2 + "\n");
		System.out.println(" 첫번째 문자열 찾은 다음 >> " + sb + "\n");
		
//		int idx2 = str2.indexOf(":");
		int idx2 = sb.indexOf(":");
//		int end2 = str2.indexOf(",");
		int end2 = sb.indexOf(",");
//		String ret2 = str2.substring(idx2 + 1, end2);
		System.out.println(" : 의 위치 >> " + idx2);
		System.out.println(", 의 위치 >> " + end2);
		String ret2 = sb.substring(idx2 + 1, end2);
		System.out.println("2.  찾은 문자열 >> " + ret2 + "\n");
		
//		String str3 = str2.substring(end2 + 1, str2.length());
		
		String str3 = sb.substring(end2 + 1, sb.length());
		System.out.println("두번째 문자열 찾은 다음 >> " + str3 + "\n");
		
		sb.delete(0,  end2 + 1);
		int idx3 = str3.indexOf(":");
		int end3 = str3.indexOf(",");
//		String ret3 = str3.substring(idx3 + 1, end3);
//		String ret3 = str3.substring(idx3 + 1, sb.length());
		String ret3 = sb.substring(idx3 + 1, sb.length() - 1);
		System.out.println("3. 찾은 문자열 >> " + ret3 + "\n");
	}
}
