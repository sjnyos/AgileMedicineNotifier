package com.strawhatspirates.medicinetime.addmedicine;

import com.strawhatspirates.medicinetime.BasePresenter;
import com.strawhatspirates.medicinetime.BaseView;
import com.strawhatspirates.medicinetime.data.source.MedicineAlarm;
import com.strawhatspirates.medicinetime.data.source.Pills;

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
