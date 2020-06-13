package com.strawhatspirates.medicinetime;

import android.app.Activity;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.Stage;

import com.strawhatspirates.medicinetime.Credentials.SimpleLoginActivity;
import com.strawhatspirates.medicinetime.addmedicine.AddMedicineActivity;
import com.strawhatspirates.medicinetime.medicine.MedicineActivity;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Collection;


@RunWith(AndroidJUnit4.class)
class AddMedicineActivityTest {
    @Rule
    public ActivityTestRule<AddMedicineActivity> mActivityRule =
            new ActivityTestRule<>(AddMedicineActivity.class);

    @Test
    public void testHappyScenario() {
        Espresso.onView(ViewMatchers.withId(R.id.fab_edit_task_done)).perform(ViewActions.click());
       // Assert.assertEquals(, MedicineActivity.class);
    }


}

