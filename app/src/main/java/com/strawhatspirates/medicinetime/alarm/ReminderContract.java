package com.strawhatspirates.medicinetime.alarm;

import com.strawhatspirates.medicinetime.BasePresenter;
import com.strawhatspirates.medicinetime.BaseView;
import com.strawhatspirates.medicinetime.data.source.History;
import com.strawhatspirates.medicinetime.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
