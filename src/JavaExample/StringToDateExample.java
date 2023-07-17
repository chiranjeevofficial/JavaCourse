import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args) throws Exception {
        String dateString = "2022-05-10";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(dateString);
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
