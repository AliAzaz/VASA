package data.N;

public class N2321_N2322 {

    public static String TABLE_NAME = "N2321_N2322";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.N.N2321_N2322.N2321 + " TEXT," +
                Global.N.N2321_N2322.N2322 + " TEXT" +

                ')';

        return query;
    }
}
