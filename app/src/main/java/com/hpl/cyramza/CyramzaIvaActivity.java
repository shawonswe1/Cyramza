package com.hpl.cyramza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;

import com.hpl.cyramza.Fragment.Exon21;
import com.hpl.cyramza.Fragment2.DosingCompressedFragment;
import com.hpl.cyramza.Fragment2.EfficacyCompressedFragment;
import com.hpl.cyramza.Fragment2.HomeCompressedFragment;
import com.hpl.cyramza.Fragment2.MoaCompressedFragment;
import com.hpl.cyramza.Fragment2.ProfileCompressedFragment;
import com.hpl.cyramza.Fragment2.QolCompressedFragment;
import com.hpl.cyramza.Fragment2.SafetyCompressFragment;
import com.hpl.cyramza.Fragment2.SequenceCompressedFragment;

public class CyramzaIvaActivity extends AppCompatActivity implements View.OnClickListener {

    Button Home_compressed,Profile_compressed,Sequence,Efficacy,QoL,Safety,Moa,Dosing;
    FrameLayout frameLayout;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyramza_iva);

        Home_compressed = findViewById(R.id.btn_Home_compressed);
        Home_compressed.setOnClickListener(this);

        Profile_compressed = findViewById(R.id.btn_Profile);
        Profile_compressed.setOnClickListener(this);

        Sequence = findViewById(R.id.btn_Sequence);
        Sequence.setOnClickListener(this);

        Efficacy = findViewById(R.id.btn_Efficacys);
        Efficacy.setOnClickListener(this);

        QoL = findViewById(R.id.btn_Qols);
        QoL.setOnClickListener(this);

        Safety = findViewById(R.id.btn_Safety2);
        Safety.setOnClickListener(this);

        Moa = findViewById(R.id.btn_Moas);
        Moa.setOnClickListener(this);

        Dosing = findViewById(R.id.btn_Dosing);
        Dosing.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
        HomeCompressedFragment homeCompressedFragment = new HomeCompressedFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentID,homeCompressedFragment)
                .commit();

    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch(v.getId())
        {
            case R.id.btn_Home_compressed:
                fragment = new HomeCompressedFragment();
                break;
            case R.id.btn_Profile:
                fragment = new ProfileCompressedFragment();
                break;
            case R.id.btn_Sequence:
                fragment = new SequenceCompressedFragment();
                break;
            case R.id.btn_Efficacys:
                fragment = new EfficacyCompressedFragment();
                break;
            case R.id.btn_Qols:
                fragment = new QolCompressedFragment();
                break;
            case R.id.btn_Safety2:
                fragment = new SafetyCompressFragment();
                break;
            case R.id.btn_Moas:
                fragment = new MoaCompressedFragment();
                break;

            case R.id.btn_Dosing:
                fragment = new DosingCompressedFragment();
                break;
        }
        if (fragment != null)
        {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentID,fragment)
                    .commit();
        }
        else
        {
            Log.e("Error ","Error");
        }
    }
}