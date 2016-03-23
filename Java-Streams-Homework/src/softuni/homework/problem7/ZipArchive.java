package softuni.homework.problem7;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;


public class ZipArchive {
    public static void main(String[] args) {
        File dirToArch = new File("resources/ZipArchive");
        String zipFile = "resources/text-files.zip";
        byte[] buffer = new byte[1024];
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream
                (new FileOutputStream(zipFile)))) {
            if (!dirToArch.isDirectory()) {
                System.out.println(dirToArch + " is not a directory!");
            } else {
                File[] files = dirToArch.listFiles();
                for (int i = 0; i < files.length; i++) {
                    FileInputStream fis = new FileInputStream(files[i]);
                    zos.putNextEntry(new ZipEntry(files[i].getName()));
                    int lenght;
                    while ((lenght = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, lenght);
                    }
                    zos.closeEntry();
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
