package com.strawhatspirates.agilemedicinenotifier.medicine;

import android.content.Context;

import com.strawhatspirates.agilemedicinenotifier.BasePresenter;
import com.strawhatspirates.agilemedicinenotifier.BaseView;
import com.strawhatspirates.agilemedicinenotifier.data.source.MedicineAlarm;

import java.util.List;


public interface MedicineContract {

    interface View extends BaseView<Presenter>{

        void showLoadingIndicator(boolean active);

        void showMedicineList(List<MedicineAlarm> medicineAlarmList);

        void showAddMedicine();

        void showMedicineDetails(long medId, String medName);

        void showLoadingMedicineError();

        void showNoMedicine();

        void showSuccessfullySavedMessage();

        void  showMedicineDeletedSuccessfully();

        boolean isActive();


    }

    interface Presenter extends BasePresenter{

        void onStart(int day);

        void reload(int day);

        void result(int requestCode, int resultCode);

        void loadMedicinesByDay(int day, boolean showIndicator);

        void deleteMedicineAlarm(MedicineAlarm medicineAlarm, Context context);

        void addNewMedicine();

    }
}
