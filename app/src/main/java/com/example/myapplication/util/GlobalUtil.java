package com.example.myapplication.util;

import androidx.lifecycle.MutableLiveData;

public class GlobalUtil {
    /**
     * Permet la création de MutableLiveData et son initialisation
     */
    public static MutableLiveData<String> initMutableLiveData(String value){
        var result = new MutableLiveData<String>();
        result.setValue(value);
        return result;
    }
}
