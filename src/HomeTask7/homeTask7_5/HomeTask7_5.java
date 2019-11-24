package HomeTask7.homeTask7_5;

import java.io.*;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class HomeTask7_5 {
    public static void main(String[] args) {
        File catalog = new File("E://HomeTasks//src//HomeTask7//homeTask7_5//task7_5");
        if (catalog.mkdir()) {
            System.out.println("Folder is created");
        }
        File file1 = new File(catalog, "file1.txt");
        File file2 = new File(catalog, "file2.txt");
        File file3 = new File(catalog, "file3.txt");
        try (FileOutputStream fos1 = new FileOutputStream(file1); PrintStream printStream1 = new PrintStream(fos1);
             FileOutputStream fos2 = new FileOutputStream(file2); PrintStream printStream2 = new PrintStream(fos2);
             FileOutputStream fos3 = new FileOutputStream(file3); PrintStream printStream3 = new PrintStream(fos3)) {
            printStream1.println("file1");
            printStream2.println("file2");
            printStream3.println("file3");
        } catch (IOException ex) {
            System.out.println("File is not found");
        }
        if (file1.exists() && file2.exists() && file3.exists()) {
            System.out.println("Files are created");
        }
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("E://HomeTasks//src//HomeTask7//homeTask7_5//task7_5//task7_5_zip.zip"));
             FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file1);
             FileInputStream fis3 = new FileInputStream(file1)) {
            ZipEntry entry1 = new ZipEntry("file1.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis1.available()];
            zout.write(buffer);
            zout.closeEntry();
            ZipEntry entry2 = new ZipEntry("file2.txt");
            zout.putNextEntry(entry2);
            buffer = new byte[fis2.available()];
            zout.write(buffer);
            zout.closeEntry();
            ZipEntry entry3 = new ZipEntry("file3.txt");
            zout.putNextEntry(entry3);
            buffer = new byte[fis3.available()];
            zout.write(buffer);
            zout.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }
        File catalog2 = new File("E://HomeTasks//src//HomeTask7//homeTask7_5//task7_5_2");
        boolean renamed = catalog.renameTo(catalog2);
        System.out.println("Renamed: " + renamed);
        System.out.println(Arrays.toString(catalog2.listFiles()));
        for (File file : catalog2.listFiles()){
            file.delete();
        }
        boolean deleted = catalog2.delete();
        System.out.println("Deleted: " + deleted);
    }
}
