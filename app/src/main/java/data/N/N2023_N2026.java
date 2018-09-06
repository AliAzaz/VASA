package data.N;

public class N2023_N2026 {

    public static String TABLE_NAME = "N2023_N2026";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,   " +

                Global.N.N2023_N2026.sub_N2023_N2026.STUDYID + " INTEGER," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2023 + " TEXT," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2024 + " TEXT," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2024_1 + " TEXT," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2025U + " TEXT," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2025D + " TEXT," +
                Global.N.N2023_N2026.sub_N2023_N2026.N2026 + " TEXT" +
                ')';

        return query;
    }
}
