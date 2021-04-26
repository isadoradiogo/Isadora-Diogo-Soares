package qi.com.androidmidia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button playBtn:
    private SeekBar posicao;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = findViewById(R.id.playBtn);
        mp = MediaPlayer.create(context:this,R.raw.musica)
        posicao = findViewById(R.id.posicao)
    }
    public void
    {
        if (!mp.isPlayng())
        {
            mp.start();
            playBtn.setBackgroundResource(R.drawable.play);
        }
}
