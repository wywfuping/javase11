
public class Text2 {

	public static void main(String[] args){
		System.out.println("����ʼ");
		try {
			//int i = 10/0;
			String str = null;
			str.length();
			//int[] num = new int[2];
			//System.out.println(num[2]);
			System.out.println("1111");
		} catch (ArithmeticException e) {
			System.out.println("���������쳣");
		}catch (NullPointerException e) {
			System.out.println("������ָ���쳣");
		} catch (Exception e) {
			System.out.println("����û���쳣");
		} finally {
			System.out.println("finally");
		}
		System.out.println("�������");	
	}
}

