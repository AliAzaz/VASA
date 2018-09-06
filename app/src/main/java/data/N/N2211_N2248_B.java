package data.N;

public class N2211_N2248_B {

    public static String TABLE_NAME = "N2211_N2248_B";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                Global.N.N2211_N2248_B.sub_N2211_N2248_B.STUDYID + " INTEGER," +
                Global.N.N2211_N2248_B.sub_N2211_N2248_B.ACT_COUNT + " TEXT," +
                Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213 + " TEXT," +
                Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_2A + " TEXT," +
                Global.N.N2211_N2248_B.sub_N2211_N2248_B.N2213_4 + " TEXT" +

                ')';

        return query;
    }
}
