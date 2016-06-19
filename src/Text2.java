
public class Text2 {

	public static void main(String[] args){
		System.out.println("程序开始");
		try {
			//int i = 10/0;
			String str = null;
			str.length();
			//int[] num = new int[2];
			//System.out.println(num[2]);
			System.out.println("1111");
		} catch (ArithmeticException e) {
			System.out.println("发生计算异常");
		}catch (NullPointerException e) {
			System.out.println("发生空指针异常");
		} catch (Exception e) {
			System.out.println("上面没有异常");
		} finally {
			System.out.println("finally");
		}
		System.out.println("程序结束");	
	}
}

