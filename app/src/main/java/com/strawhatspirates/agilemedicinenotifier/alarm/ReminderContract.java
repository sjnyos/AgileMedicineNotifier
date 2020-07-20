package com.strawhatspirates.agilemedicinenotifier.alarm;

import com.strawhatspirates.agilemedicinenotifier.BasePresenter;
import com.strawhatspirates.agilemedicinenotifier.BaseView;
import com.strawhatspirates.agilemedicinenotifier.data.source.History;
import com.strawhatspirates.agilemedicinenotifier.data.source.MedicineAlarm;


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
