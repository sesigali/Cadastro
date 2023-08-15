package br.edu.scl.ifsp.ads.cadastroEduardoLucas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nomeCompletoTv;
    private EditText telefoneTv;
    private EditText emailTv;
    private CheckBox listaEmailCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText cidadeTv;
    private Spinner estadoSp;
    private Button salvarBt;
    private Button limparBt;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCompletoTv = findViewById(R.id.nomeCompletoTv);
        telefoneTv = findViewById(R.id.telefoneTv);
        emailTv = findViewById(R.id.emailTv);
        listaEmailCb = findViewById(R.id.listaEmailCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);
        cidadeTv = findViewById(R.id.cidadeTv);
        estadoSp = findViewById(R.id.estadoSp);
        salvarBt = findViewById(R.id.salvarBt);
        limparBt = findViewById(R.id.limparBt);

        salvarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarFormulario();
            }
        });

        limparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparFormulario();
            }
        });
    }

    private void salvarFormulario() {
        String nome = nomeCompletoTv.getText().toString();
        String telefone = telefoneTv.getText().toString();
        String email = emailTv.getText().toString();
        boolean inscritoEmail = listaEmailCb.isChecked() ? true : false;
        String sexo = masculinoRb.isChecked() ? "Masculino" : "Feminino";
        String cidade = cidadeTv.getText().toString();
        String uf = estadoSp.getSelectedItem().toString();

        Formulario formulario = new Formulario(nome, telefone, email, inscritoEmail, sexo, cidade, uf);

        Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();
    }

    private void limparFormulario() {
        nomeCompletoTv.setText("");
        telefoneTv.setText("");
        emailTv.setText("");
        listaEmailCb.setChecked(false);
        masculinoRb.setChecked(false);
        femininoRb.setChecked(false);
        cidadeTv.setText("");
        estadoSp.setSelection(0);

        Toast.makeText(this, "Todos os campos foram limpos", Toast.LENGTH_SHORT).show();
    }

}