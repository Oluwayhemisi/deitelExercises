package ChapterEight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Entries {
    private String title;
    private String body;
    private String  theDate;

    public Entries(String title, String body) {
       LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
        theDate = dateTimeFormatter.format(localDateTime);
        this.title = title;
        this.body = body;

    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getTheDate() {
        return theDate;
    }
}
