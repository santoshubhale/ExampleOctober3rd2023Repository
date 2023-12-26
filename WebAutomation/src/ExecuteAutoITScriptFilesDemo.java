
public class ExecuteAutoITScriptFilesDemo {

	public static void main(String[] args) {
		ececuteFile();

	}
	private static void ececuteFile() {
		try {
		//	Runtime.getRuntime().exec("C:/GitRepository/AutoIT/DisplayMessageWindow..exe");
			Runtime obj = Runtime.getRuntime();
			obj.exec("C:/GitRepository/AutoIT/DisplayMessageWindow..exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
