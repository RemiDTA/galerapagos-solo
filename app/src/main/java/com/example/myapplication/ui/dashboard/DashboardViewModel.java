package com.example.myapplication.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.util.GlobalUtil;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private final MutableLiveData<String> waterValue;

    private final MutableLiveData<String> foodValue;

    public DashboardViewModel() {
        mText = GlobalUtil.initMutableLiveData("This is dashboard fragment");
        waterValue  = GlobalUtil.initMutableLiveData("4");
        foodValue = GlobalUtil.initMutableLiveData("3");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getWaterValue() {
        return waterValue;
    }

    public LiveData<String> getFoodValue() {
        return foodValue;
    }
}