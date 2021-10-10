package com.hpl.cyramza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.hpl.cyramza.Fragment.AppDemoFragment;
import com.hpl.cyramza.Fragment.AppendixFragment;
import com.hpl.cyramza.Fragment.EfficacyFragment;
import com.hpl.cyramza.Fragment.Exon21;
import com.hpl.cyramza.Fragment.MoaFragment;
import com.hpl.cyramza.Fragment.QolFragment;
import com.hpl.cyramza.Fragment.RelayFragment;
import com.hpl.cyramza.Fragment.SafetyFragment;
import com.hpl.cyramza.Fragment.SummaryIndicationsFragment;
import com.hpl.cyramza.Fragment.TreatmentPlanningFragment;

public class RelayIvaActivity extends AppCompatActivity implements View.OnClickListener {

    Button Exon,Moa,Relay,Effecacy,Safety,Qol,TreatmentPlanning,Summary,Appendix,AppDemo;
    FrameLayout frameLayout;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relay_iva);
        Exon = findViewById(R.id.btn_Exon);
        Exon.setOnClickListener(this);

        Moa = findViewById(R.id.btn_moa);
        Moa.setOnClickListener(this);

        Relay = findViewById(R.id.btn_Relay);
        Relay.setOnClickListener(this);

        Effecacy = findViewById(R.id.btn_Effecacy);
        Effecacy.setOnClickListener(this);

        Safety = findViewById(R.id.btn_Safety);
        Safety.setOnClickListener(this);

        Qol = findViewById(R.id.btn_Qol);
        Qol.setOnClickListener(this);

        TreatmentPlanning = findViewById(R.id.btn_TreatmentPlanning);
        TreatmentPlanning.setOnClickListener(this);

        Summary = findViewById(R.id.btn_Summary);
        Summary.setOnClickListener(this);

        Appendix = findViewById(R.id.btn_Appendix);
        Appendix.setOnClickListener(this);

        AppDemo = findViewById(R.id.btn_AppDemo);
        AppDemo.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
        AppDemoFragment appDemoFragment = new AppDemoFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentID,appDemoFragment)
                .commit();
    }

    @Override
    public void onClick(View v) {

        Fragment fragment = null;
        switch (v.getId())
        {
            case R.id.btn_Exon:
                fragment = new Exon21();
                break;
            case R.id.btn_moa:
                fragment = new MoaFragment();
                break;
            case R.id.btn_Relay:
                fragment = new RelayFragment();
                break;
            case R.id.btn_Effecacy:
                fragment = new EfficacyFragment();
                break;
            case R.id.btn_Safety:
                fragment = new SafetyFragment();
                break;
            case R.id.btn_Qol:
                fragment = new QolFragment();
                break;
            case R.id.btn_TreatmentPlanning:
                fragment = new TreatmentPlanningFragment();
                break;
            case R.id.btn_Summary:
                fragment = new SummaryIndicationsFragment();
                break;
            case R.id.btn_Appendix:
                fragment = new AppendixFragment();
                break;
            case R.id.btn_AppDemo:
                fragment = new AppDemoFragment();
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