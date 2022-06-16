package Diarypackage.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime theDate = LocalDateTime.now();



    public Entry(String title, String body){

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
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");

        return dateTimeFormatter.format(theDate);
    }
    public String toString(){
      return   String.format("""
                Title: title || Body: body %s %s""",getTitle(),getBody());

    }
}

