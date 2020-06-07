//package com.strawhatspirates.medicinetime;
//
//import android.app.Instrumentation;
//import android.provider.Telephony;
//import android.util.Log;
//
//import com.strawhatspirates.medicinetime.data.source.History;
//import com.strawhatspirates.medicinetime.data.source.MedicineAlarm;
//import com.strawhatspirates.medicinetime.data.source.MedicineDataSource;
//import com.strawhatspirates.medicinetime.data.source.Pills;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import java.util.List;
//
//import javax.security.auth.callback.Callback;
//
//import static junit.framework.Assert.assertNotNull;
//import static junit.framework.Assert.assertTrue;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
////
////@RunWith(AndroidJUnit4.class)
////@LargeTest
//public class SQLiteTest {
//
//    private MedicineDataSource mDataSource;
//    private Instrumentation InstrumentationRegistry;
//
//    @Before
//    public void setUp(){
//        mDataSource = new MedicineDataSource() {
//            @Override
//            public void getMedicineHistory(LoadHistoryCallbacks loadHistoryCallbacks) {
//
//            }
//
//            @Override
//            public void getMedicineAlarmById(long id, GetTaskCallback callback) {
//
//            }
//
//            @Override
//            public void saveMedicine(MedicineAlarm medicineAlarm, Pills pills) {
//
//            }
//
//            @Override
//            public void getMedicineListByDay(int day, LoadMedicineCallbacks callbacks) {
//
//            }
//
//            @Override
//            public boolean medicineExits(String pillName) {
//                return false;
//            }
//
//            @Override
//            public List<Long> tempIds() {
//                return null;
//            }
//
//            @Override
//            public void deleteAlarm(long alarmId) {
//
//            }
//
//            @Override
//            public List<MedicineAlarm> getMedicineByPillName(String pillName) {
//                return null;
//            }
//
//            @Override
//            public List<MedicineAlarm> getAllAlarms(String pillName) {
//                return null;
//            }
//
//            @Override
//            public Pills getPillsByName(String pillName) {
//                return null;
//            }
//
//            @Override
//            public long savePills(Pills pills) {
//                return 0;
//            }
//
//            @Override
//            public void saveToHistory(History history) {
//
//            }
//        };
//    }
//
//    @After
//    public void finish() {
//      //  mDataSource.close();
//    }
//
//    @Test
//    public void testPreConditions() {
//        assertNotNull(mDataSource);
//    }
//
//
//    @Test
//    public void testDeleteAll() {
////        mDataSource.getMedicineAlarmById(1, Callback());
////
////        // assertThat( mDataSource.deleteAlarm(1), is(0));
////        Log.println(Log.ASSERT,"Deletion Alaram","Passed");
//    }
//
//    @Test
//    public void testDeleteOnlyOne() {
//mDataSource.deleteAlarm(1);
//       // assertThat(mDataSource.deleteAlarm(1), is(0));
//    }
//
//    @Test
//    public void testAddAndDelete() {
//        mDataSource.getPillsByName("cetamol");
//        assertThat(mDataSource.getPillsByName("cetamol"), is(1));
//    }
//}