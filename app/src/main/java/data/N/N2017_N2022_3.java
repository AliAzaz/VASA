package data.N;

public class N2017_N2022_3 {
    public static String TABLE_NAME = "N2017_N2022_3";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,    " +

                Global.N.N2017_N2022_3.sub_N2017_N2022_3.STUDYID + " INTEGER," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2017 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2018 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2019u + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2019h + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2019d + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2020 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2021 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2022 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2022_1 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2022_2 + " TEXT," +
                Global.N.N2017_N2022_3.sub_N2017_N2022_3.N2022_3 + " TEXT" +
                ')';

        return query;
    }
}
