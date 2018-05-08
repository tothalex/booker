/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.Database;

import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Model.Time;

import java.util.List;

public interface IDatabase {
    public void load();
    public void save();
    public void insertDBTimer(Time time);
    public List<Time> getDatabaseListCurrentMonth();
    public String formatCSV();
    public String totalCurrentMonth();
}
