package govno.zalupa;

import java.io.File;

public class DeleteZip {

    /**
     * This class shows how to delete a File in Java
     * @param args
     */
    public static void deletezip(String[] args) {
        //absolute file name with path
        File file = new File("ServerFiles_1.2.zip");
        if(file.delete()){
            System.out.println("deleted");
        }else System.out.println("nothing");
    }
}