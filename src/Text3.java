import java.io.File;
import java.io.IOException;

public class Text3 {

	public static void main(String[] args) throws IOException {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int sum=0;
		int n;
		for (n=1; n <=50; n++) {
			System.out.print("输入n值：");
			n = sc.nextInt();
			System.out.println("结果为：" + sum(n));
		}
		
	}
	static int sum(int n){
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			return sum(n-1) + sum(n-2);
		}
	}

}
