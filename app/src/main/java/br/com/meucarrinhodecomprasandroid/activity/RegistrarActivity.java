package br.com.meucarrinhodecomprasandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.FrameLayout;

import br.com.meucarrinhodecomprasandroid.R;
import br.com.meucarrinhodecomprasandroid.fragment.FragmentoCadastro;

public class RegistrarActivity extends AppCompatActivity {

    private FrameLayout frameLayout;
    public static boolean setFragmentoCadastro=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        frameLayout=findViewById(R.id.registrar_framelayout);


        if (setFragmentoCadastro) {
            setFragmentoCadastro = false;
            setFragmento(new FragmentoCadastro());
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode ==  KeyEvent.KEYCODE_BACK) {
            FragmentoCadastro.disabilitarBotaoFechar = false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void setFragmento(Fragment fragmento) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frameLayout.getId(), fragmento);
        fragmentTransaction.commit();
    }
}