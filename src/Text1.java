
public class Text1 {

	public static void main(String[] args) {
		String str = "123a";
		int n ;
		System.out.println("����ʼ");
		try {
			n = new Integer(str);
			//return ;
		} catch (Exception e) {
			e.printStackTrace();
			n = 0 ;
		}
		System.out.println(str + ":" + n);
		System.out.println("�������");

	}

}
