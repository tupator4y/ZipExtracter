package govno.zalupa;

import java.io.File;

public class UnzipUtilityTest {
    public static void main(String[] args) {
        String zipFilePath = "ServerFiles_1.2.zip";
        String userDir = System.getProperty("user.home");
        String destDirectory = userDir + File.separator + "AppData\\Roaming\\.minecraft";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }
}