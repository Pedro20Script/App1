package oliveira.barcelos.antonio.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BrandNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_new);
        Intent intent = getIntent();
        String texto = intent.getStringExtra("texto");
        TextView tvExibir = findViewById(R.id.tvExibir);
        tvExibir.setText(texto);
    }
}