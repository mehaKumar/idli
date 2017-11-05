package com.sambaar.idli;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;

public class AddNewTaskActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    boolean isStart = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);

        final DatePickerDialog datePickerStart = new DatePickerDialog(this, this, 2017, 1, 1);

        Button startDateButton = (Button) findViewById(R.id.startDate);
        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isStart = true;
                datePickerStart.show();

            }
        });

        final DatePickerDialog datePickerEnd = new DatePickerDialog(this, this, 2017, 1, 1);

        Button endDateButton = (Button) findViewById(R.id.endDate);
        endDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isStart = false;
                datePickerEnd.show();

            }
        });
    }

    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        int id = view.getId();
        int whichButton = (isStart ? R.id.startDate : R.id.endDate);
        Button start_button = (Button)findViewById(whichButton);
        start_button.setText("" + month + "/" + dayOfMonth);
    }

}
