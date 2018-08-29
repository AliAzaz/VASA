package data.N;

public class N2311_N2317 {

    public static String TABLE_NAME = "N2311_N2317";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.N.N2311_N2317.N2311 + " TEXT," +
                Global.N.N2311_N2317.N2312 + " TEXT," +
                Global.N.N2311_N2317.N2313 + " TEXT," +
                Global.N.N2311_N2317.N2314 + " TEXT," +
                Global.N.N2311_N2317.N2315 + " TEXT," +
                Global.N.N2311_N2317.N2316 + " TEXT," +
                Global.N.N2311_N2317.N2317 + " TEXT" +

                ')';

        return query;
    }
}
