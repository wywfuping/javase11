
public class Text {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("程序开始");
		try {
			System.out.println(a/b);
			//return ;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch");
			//return ;
			//System.exit(1);
		} finally {
			System.out.println("sds");
		}
		System.out.println("程序结束");   
	}

}
