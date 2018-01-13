package com.peng.tinyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by peng on 2018/1/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
