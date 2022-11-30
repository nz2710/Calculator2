package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnCong, btnTru, btnNhan, btnChia, btnBang, btnC, btnDot;
    TextView txtResult;
    Double var1, var2, ans;
    Boolean cong = false, tru = false, nhan = false, chia = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.zeroButton);
        btn1 = findViewById(R.id.oneButton);
        btn2 = findViewById(R.id.twoButton);
        btn3 = findViewById(R.id.threeButton);
        btn4 = findViewById(R.id.fourButton);
        btn5 = findViewById(R.id.fiveButton);
        btn6 = findViewById(R.id.sixButton);
        btn7 = findViewById(R.id.sevenButton);
        btn8 = findViewById(R.id.eightButton);
        btn9 = findViewById(R.id.nineButton);
        btnCong = findViewById(R.id.plusButton);
        btnTru = findViewById(R.id.minusButton);
        btnNhan = findViewById(R.id.multiplyButton);
        btnChia = findViewById(R.id.devideButton);
        btnC = findViewById(R.id.cButton);
        btnBang = findViewById(R.id.equalButton);
        btnDot = findViewById(R.id.pointBotton);
        txtResult = findViewById(R.id.display);
        txtResult.setText("0");

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + ".");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                    txtResult.setText(txtResult.getText() + "0");
                    btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                    txtResult.setText(txtResult.getText() + "1");
                    btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                    btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "2");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "3");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "4");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "5");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "6");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "7");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "8");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtResult.getText() == "0") {
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + "9");
                btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
                btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));

            }
        });

        btnCong.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            colorChange(btnCong);
            buttonFalse();
            cong = true;
            tru = false;
            nhan = false;
            chia = false;
        }
    });

        btnTru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            colorChange(btnTru);
            buttonFalse();
            cong = false;
            tru = true;
            nhan = false;
            chia = false;
        }
    });

        btnNhan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            colorChange(btnNhan);
            buttonFalse();
            cong = false;
            tru = false;
            nhan = true;
            chia = false;
        }
    });

        btnChia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setVar1();
            colorChange(btnChia);
            buttonFalse();
            cong = false;
            tru = false;
            nhan = false;
            chia = true;
        }
    });

        btnC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btnCong.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
            btnTru.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
            btnNhan.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
            btnChia.setBackgroundColor(getResources().getColor(R.color.btnKeyBoard));
            //enable các button toán tử
            btnBang.setEnabled(true);
            btnCong.setEnabled(true);
            btnTru.setEnabled(true);
            btnNhan.setEnabled(true);
            btnChia.setEnabled(true);
            //xóa màn hinh
            txtResult.setText("0");
        }
    });

        btnBang.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            var2 = Double.parseDouble(txtResult.getText().toString());
            if(cong){
                ans = var1 + var2;
            } else if (tru){
                ans = var1 - var2;
            } else if (nhan){
                ans = var1 * var2;
            } else if (chia){
                ans = var1 / var2;
            } else {
                ans = ans + 0;
            }
            btnBang.setEnabled(true);
            btnCong.setEnabled(true);
            btnTru.setEnabled(true);
            btnNhan.setEnabled(true);
            btnChia.setEnabled(true);
            txtResult.setText(ans.toString());

        }
    });
}

    public void setVar1(){
        var1 = Double.parseDouble(txtResult.getText().toString());
    }

    public void buttonFalse() {
        btnCong.setEnabled(false);
        btnTru.setEnabled(false);
        btnNhan.setEnabled(false);
        btnChia.setEnabled(false);
        txtResult.setText("");
    }

    public void colorChange(Button b) {
        b.setBackgroundColor(getResources().getColor(R.color.red));
    }

}






