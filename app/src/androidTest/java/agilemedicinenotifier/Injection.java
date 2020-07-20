package com.strawhatspirates.agilemedicinenotifier;

import android.content.Context;

import androidx.annotation.NonNull;

import com.strawhatspirates.agilemedicinenotifier.data.source.MedicineRepository;
import com.strawhatspirates.agilemedicinenotifier.data.source.local.MedicinesLocalDataSource;


public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
