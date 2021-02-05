package govno.zalupa;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DeleteDirectory {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    File directory = new File(System.getProperty("user.home") + "/" + "AppData\\Roaming\\.minecraft\\config");
    File directory2 = new File(System.getProperty("user.home") + "/" + "AppData\\Roaming\\.minecraft\\mods");
    File directory3 = new File(System.getProperty("user.home") + "/" + "AppData\\Roaming\\.minecraft\\scripts");
    
    //Deletes all files and folders in this directory.
    FileUtils.deleteDirectory(directory);
    FileUtils.deleteDirectory(directory2);
    FileUtils.deleteDirectory(directory3);

    System.out.println("Directory cleared successfully");
  }
}