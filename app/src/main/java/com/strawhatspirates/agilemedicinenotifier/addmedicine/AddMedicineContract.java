package com.strawhatspirates.agilemedicinenotifier.addmedicine;

import com.strawhatspirates.agilemedicinenotifier.BasePresenter;
import com.strawhatspirates.agilemedicinenotifier.BaseView;
import com.strawhatspirates.agilemedicinenotifier.data.source.MedicineAlarm;
import com.strawhatspirates.agilemedicinenotifier.data.source.Pills;

import java.util.List;



public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
