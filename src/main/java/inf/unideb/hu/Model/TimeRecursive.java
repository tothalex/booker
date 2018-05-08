package inf.unideb.hu.Model;

import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import java.beans.Transient;
import java.time.Duration;
import java.time.LocalDateTime;

public class TimeRecursive extends RecursiveTreeObject<TimeRecursive> {

    private LocalDateTime Start;
    private LocalDateTime End;
    private String Comment = "";

    public TimeRecursive() { }

    public TimeRecursive(LocalDateTime start, LocalDateTime end, String comment) {
        Start = start;
        End = end;
        this.Comment = comment;
    }

    public TimeRecursive(Time time){
        this.Start = time.getStart();
        this.End = time.getEnd();
        this.Comment = time.getComment();
    }

    public LocalDateTime getStart() { return Start; }
    public void setStart(LocalDateTime start) { Start = start; }
    public LocalDateTime getEnd() { return End; }
    public void setEnd(LocalDateTime end) { End = end; }
    public void setComment(String comment) { Comment = comment; }
    public String getComment() { return Comment; }
    public long getDuration(){ return Duration.between(Start, End).toMillis(); }

}
