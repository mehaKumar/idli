package com.sambaar.idli;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class AddNewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);


        /*Calendar cal = Calendar.getInstance();
        DatePickerDialog datePicker = new DatePickerDialog(this, Calendar.get(cal.YEAR),
            cal.get(cal.MONTH),
            cal.get(cal.DAY_OF_MONTH);

        Button startDateButton = (Button) findViewById(R.id.startDate);
        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }

}
