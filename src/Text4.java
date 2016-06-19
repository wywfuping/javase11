import java.io.IOException;
import java.io.File;
public class Text4 {

	public static void main(String[] args) throws IOException {
		File f = new File("f:/text");
		deleteFile(f);
	}
	static void deleteFile(File f){
		if(f.isFile() || f.listFiles().length == 0){
			f.delete();
		}else {
			File[] fs = f.listFiles();
			for (File file : fs) {
				deleteFile(file);
			}
			f.delete();
		}
	}

}
