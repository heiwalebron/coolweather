package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/12/7/007.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public Wind wind;

    public class More{

        @SerializedName("txt")
        public String info;

    }
    public class Wind{

        @SerializedName("dir")
        public String info_a;

        @SerializedName("sc")
        public String info_b;

        @SerializedName("spd")
        public String info_c;
    }
}
