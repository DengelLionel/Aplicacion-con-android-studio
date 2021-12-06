package com.dengel.appeducativo.ui.ciencia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CienciaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CienciaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ciencia fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}