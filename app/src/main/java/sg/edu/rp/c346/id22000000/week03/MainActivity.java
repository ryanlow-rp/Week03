package sg.edu.rp.c346.id22000000.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        rgGender.check(R.id.radioButtonGenderMale);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    stringResponse = "He says " + stringResponse;
                } else {
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                etInput.setEnabled(tbtn.isChecked());
            }
        });


    }
}