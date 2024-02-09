package com.lib1;

import java.time.LocalDateTime;

public class Lib1 {
    public String getCurrentTimestamp() {
        return LocalDateTime.now().toString();
    }
}
