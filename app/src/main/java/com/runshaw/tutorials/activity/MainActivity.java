package com.runshaw.tutorials.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.runshaw.tutorials.R;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName;
    TextView tvResult;
    DatePicker datePicker;
    TimePicker timePicker;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate is called");
        Button btnSubmit = findViewById(R.id.btnSubmit);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        tvResult = findViewById(R.id.tvResult);
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Button Clicked!!", Toast.LENGTH_SHORT).show();
            }
        });

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Toggle Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void showName(View view) {
        String name = editTextTextPersonName.getText().toString();
        tvResult.setText(name);
    }

    public void radioButtonSelect(View view) {
        // Perform action on radio button click
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rbBurger:
                if (checked)
                    Toast.makeText(this, "I love Burger", Toast.LENGTH_LONG).show();
                break;
            case R.id.rbPizza:
                if (checked)
                    Toast.makeText(this, "I love Pizza", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void checkBoxSelect(View view) {
            Boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.cbDark:
                    if (checked){
                        Toast.makeText(this, "I like Dark", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "I dont like Dark", Toast.LENGTH_LONG).show();
                    }
                    break;
                case  R.id.cbGOT:
                    if (checked){
                        Toast.makeText(this, "I like GOT", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "I dont like GOT", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.cbMoneyHeist:
                    if (checked){
                        Toast.makeText(this, "I like Money Heist", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "I dont like Money Heist", Toast.LENGTH_LONG).show();
                    }
                    break;
            }
    }

    public void selectDate(View view) {
        String selectedDate = datePicker.getDayOfMonth() +"/" +datePicker.getMonth() + "/" + datePicker.getYear();
        Toast.makeText(this, selectedDate, Toast.LENGTH_LONG).show();

        Log.d(TAG, "selectedDate: " +selectedDate);
    }

    public void selectTime(View view) {
        String selectedTime = timePicker.getHour() + ":" + timePicker.getMinute();
        Toast.makeText(this, selectedTime, Toast.LENGTH_LONG).show();
        Log.d(TAG, "selectedTime: " +selectedTime);
    }


    /*public void buttonClicked(View view) {
        Toast.makeText(this, "Button Clicked!!", Toast.LENGTH_SHORT).show();
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop is called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart is called");
    }

    public void goToLinearLayout(View view) {
        Intent intent = new Intent(MainActivity.this, LinearLayoutExampleActivity.class);
        startActivity(intent);
    }

    public void goToRelativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayoutExampleActivity.class);
        startActivity(intent);
    }

    public void goToConstraintLayout(View view) {
        startActivity(new Intent(this, ConstraintLayoutExampleActivity.class));
    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void goToFrameLayout(View view) {
        startActivity(new Intent(this, FrameLayoutActivity.class));
    }

    public void goToCardView(View view) {
        startActivity(new Intent(this, CardViewActivity.class));
    }

    public void goToFragment(View view) {
        startActivity(new Intent(this, FragmentHostActivity.class));
    }

    public void goToTODO(View view) {
        startActivity(new Intent(this, TodoActivity.class));
    }

    //TODO Framelayout
    //TODO CardView
    // Fragments
    // TODO
}