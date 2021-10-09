package com.hpl.cyramza.Fragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;
import com.hpl.cyramza.R;


public class MoaCompressedFragment extends Fragment {


    public MoaCompressedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_moa_compressed, container, false);
        PDFView pdfView = view.findViewById(R.id.pdfViewer);
        pdfView.fromAsset("7. MOA_compressed.pdf").load();
        return view;
    }
}