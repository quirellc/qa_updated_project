import Quire_POM.BaseClass;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import okhttp3.*;

import java.io.IOException;

public class Regression4 extends ReusableAnnotations {
 public static String encodeFileToBase64(String filePath) throws IOException {
  File file = new File(filePath);
  byte[] fileBytes = Files.readAllBytes(file.toPath());
  return Base64.getEncoder().encodeToString(fileBytes);
 }
}


