package inf.unideb.hu.Model;

import com.google.gson.annotations.Expose;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.collections.ObservableList;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.beans.Transient;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Start.equals(time.getStart()) &&
                End.equals(time.getEnd()) &&
                Comment.equals(time.getComment());
    }
    @Override
    public int hashCode() {

        return Objects.hash(Start, End, Comment);
    }
}
