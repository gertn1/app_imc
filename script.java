package com.example.meuimc;



import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcularButton = findViewById(R.id.Button_calcular);
        EditText pesoEditText = findViewById(R.id.editText_input_peso);
        EditText alturaEditText = findViewById(R.id.editText_input_altura);
        TextView imcTextView = findViewById(R.id.textView_imc);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
           package com.example.meuimc;



import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcularButton = findViewById(R.id.Button_calcular);
        EditText pesoEditText = findViewById(R.id.editText_input_peso);
        EditText alturaEditText = findViewById(R.id.editText_input_altura);
        TextView imcTextView = findViewById(R.id.textView_imc);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoStr = pesoEditText.getText().toString();
                String alturaStr = alturaEditText.getText().toString();

                if (!pesoStr.isEmpty() && !alturaStr.isEmpty()) {
                    double peso = Double.parseDouble(pesoStr);
                    double altura = Double.parseDouble(alturaStr);

                    double imc = calcularIMC(peso, altura);
                    imcTextView.setText("Seu IMC é: " + imc);
                } else {
                    imcTextView.setText("Preencha peso e altura");
                }
            }
        });
    }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
 public void onClick(View v) {
                String pesoStr = pesoEditText.getText().toString();
                String alturaStr = alturaEditText.getText().toString();

                if (!pesoStr.isEmpty() && !alturaStr.isEmpty()) {
                    double peso = Double.parseDouble(pesoStr);
                    double altura = Double.parseDouble(alturaStr);

                    double imc = calcularIMC(peso, altura);
                    imcTextView.setText("Seu IMC é: " + imc);
                } else {
                    imcTextView.setText("Preencha peso e altura");
                }
            }
        });
    }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
