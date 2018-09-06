package data.N;

public class N2110_N2189a {

    public static String TABLE_NAME = "N2110_N2189a";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " +


                Global.N.N2110_N2189a.sub_N2110_N2189a.STUDYID + " INTEGER," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2110 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2110x + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2111 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2111x + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2112 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_1 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_2 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_3 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_4 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_OT + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_OTx + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2113_DK + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2114 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2115 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2116_1 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2116_2 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2116_3 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2117 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2118 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2119 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2120 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2121 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2122 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2123 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2124 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2125 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2126 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2127 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2127h + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2128 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2129 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2130 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2131 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2132 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2133 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2133d + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2133h + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2134 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_1 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_2 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_3 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_4 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_5 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_6 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_7 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_8 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_9 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_10 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_11 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2135_11x + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2136 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2137 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2138 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2139 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2140 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2141 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2142 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2143 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2144 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2145 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2146 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2147 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2148 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2149 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2150 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2151 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2152 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2153 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2154 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2155 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2156 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2157 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2158 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2159 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2160 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2161 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2162 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2163 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2164 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2165 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2166 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2166_1 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2167 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2168 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2169 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2170 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2171 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2172 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2173 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2174 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2175 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2176 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2177 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2177A + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2178 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2179 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2180 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2181 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2182 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2183 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2184 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2185 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2186 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2187 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2188 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2189 + " TEXT," +
                Global.N.N2110_N2189a.sub_N2110_N2189a.N2189A + " TEXT" +

                ')';

        return query;
    }
}
