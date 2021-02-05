package govno.zalupa;

import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		DownloadFile a = new DownloadFile();
		a.DownloadMain(args);
		
		
		DeleteDirectory.main(args);
		
		UnzipUtilityTest.main(args);
		
		DeleteZip.deletezip(args);
	}
}