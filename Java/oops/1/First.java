import java.io.File;
import java.io.FileNotFoundException;


class First {
	public static void main(String[] arg) {
		Second second = new Second();
		System.out.println(second.getData());

		File testFile = new File("testFile.txt");
		String absoulutePath = testFile.getAbsolutePath();
		System.out.println(absoulutePath);
	}
}
