package data.N;

public class N2192_N2202 {

    public static String TABLE_NAME = "N2192_N2202";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                Global.N.N2192_N2202.N2192 + " TEXT," +
                Global.N.N2192_N2202.N2193 + " TEXT," +
                Global.N.N2192_N2202.N2194 + " TEXT," +
                Global.N.N2192_N2202.N2195 + " TEXT," +
                Global.N.N2192_N2202.N2196 + " TEXT," +
                Global.N.N2192_N2202.N2197 + " TEXT," +
                Global.N.N2192_N2202.N2198 + " TEXT," +
                Global.N.N2192_N2202.N2199 + " TEXT," +
                Global.N.N2192_N2202.N2200 + " TEXT," +
                Global.N.N2192_N2202.N2201 + " TEXT," +
                Global.N.N2192_N2202.N2202 + " TEXT" +

                ')';

        return query;
    }
}
