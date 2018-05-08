package inf.unideb.hu.Database;

import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Model.Time;

import java.util.List;

public interface IDatabase {
    public void load();
    public void save();
    public void insertDBTime(Time time);
    public List<Time> getDatabaseListCurrentMonth();
    public String formatCSV();
    public String totalCurrentMonth();
    public List<Time> getList();
}
