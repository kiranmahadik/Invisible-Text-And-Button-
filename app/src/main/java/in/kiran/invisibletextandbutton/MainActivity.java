package in.kiran.invisibletextandbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEtDisplay;
    Button mBtnSubmit,mBtnUpper,mBtnLower,mBtnReverse;
    TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtDisplay = findViewById(R.id.etDisplay);
        mBtnSubmit = findViewById(R.id.btnSubmit);
        mTvShow = findViewById(R.id.tvShow);
        mBtnUpper = findViewById(R.id.btnUpper);
        mBtnLower = findViewById(R.id.btnLower);
        mBtnReverse = findViewById(R.id.btnReverse);

        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mEtDisplay.getText().toString();

                if (str.isEmpty()) {
                    mEtDisplay.setError("Please enter String");
                    mEtDisplay.requestFocus();
                    return;
                }

                mTvShow.setText(str);

                mBtnUpper.setVisibility(View.VISIBLE);
                mBtnLower.setVisibility(View.VISIBLE);
                mBtnReverse.setVisibility(View.VISIBLE);
            }
        });

        mBtnUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvShow.getText().toString();
                str = str.toUpperCase();
                mTvShow.setText(str);
            }
        });

        mBtnLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvShow.getText().toString();
                str = str.toLowerCase();
                mTvShow.setText(str);
            }
        });

        mBtnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvShow.getText().toString();
                String ReverseString="";
                char[] temp = str.toCharArray();
                for(int i=str.length()-1; i>=0; i--){
                    ReverseString=ReverseString+temp[i];
                }
               // str = ReverseString;
                mTvShow.setText(ReverseString);
            }
        });

    }
}


