package inf.unideb.hu.Model;

import org.apache.commons.lang3.time.DurationFormatUtils;

import java.beans.Transient;
import java.time.Duration;
import java.time.LocalDateTime;
import org.pmw.tinylog.*;

public class Time {

    private LocalDateTime Start;
    private LocalDateTime End;
    private String Comment = "";

    public Time() { }

    public Time(LocalDateTime start, LocalDateTime end, String comment) {
        Start = start;
        End = end;
        this.Comment = comment;
    }

    public LocalDateTime getStart() { return Start; }
    public void setStart(LocalDateTime start) { Start = start; }
    public LocalDateTime getEnd() { return End; }
    public void setEnd(LocalDateTime end) { End = end; }
    public void setComment(String comment) { Comment = comment; }
    public String getComment() { return Comment; }
    @Transient
    public long getDuration(){ return Duration.between(Start, End).toMillis(); }
}
