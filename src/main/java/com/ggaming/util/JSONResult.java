package com.ggaming.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JSONResult {
    private boolean success = true;
    private String msg;

    public JSONResult(String msg) {
        this.msg = msg;
    }

    public JSONResult(boolean success, String msg) {
        this.msg = msg;
        this.success = success;
    }

}
