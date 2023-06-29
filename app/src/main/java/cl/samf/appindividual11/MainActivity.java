package cl.samf.appindividual11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cl.samf.appindividual11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonFlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Modo Avion Apagado", Toast.LENGTH_SHORT).show();
            }

        });

        binding.ButtonUpdating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Actualizando Perfil", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonMusicPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pausando Musica", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonLevel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Nivel 4 Completado", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonPictureSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fotografia Guardada en Galleria", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonUnlocked5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Nivel 5 Desbloqueado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}



