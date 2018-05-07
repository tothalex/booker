package inf.unideb.hu.Database;

import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Model.Time;

import java.util.List;

public interface IDatabase {
    public void load();
    public void save();
    public void insertDBTimer(Time time);
    public List<Time> getDatabaseArray();
}
