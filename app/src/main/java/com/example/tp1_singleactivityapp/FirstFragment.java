package com.example.tp1_singleactivityapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tp1_singleactivityapp.databinding.FragmentFirstBinding;

import java.util.Calendar;
import java.util.Date;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        FragmentFirstBinding bindingview = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false);
        View view = bindingview.getRoot();
        binding.setViewModel(new ClientViewModel());
        setHasOptionsMenu(true);
        //return binding.getRoot();
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.telephone) {
            binding.editTextPhone.setVisibility(View.VISIBLE);
            return true;
        }
        if (id == R.id.remisezero) {
            Log.i("test","test");
            binding.getViewModel().setName("");
            binding.getViewModel().setPrenom("");
            binding.getViewModel().setVilleNaiss("");
            //binding.editTextTextPersonName.setText("Name");
            //binding.editTextTextPersonName3.setText("Ville de Naissance");
            //binding.editTextPhone.setText("");
            //Date currentTime = Calendar.getInstance().getTime();
            //binding.calendarView2.setDate(currentTime.getTime());
            return true;
        }
        if (id == R.id.rechercheville){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fr.wikipedia.org/wiki/"+binding.getViewModel().getVilleNaiss()));
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

/*
                EditText text = binding.editTextTextPersonName;
                String s = text.getText().toString();
                Toast.makeText(getActivity().getApplicationContext(),s, Toast.LENGTH_LONG).show();
*/

                //EditText text1= binding.editTextTextPersonName;
               // String s1 = text1.getText().toString();
                Toast.makeText(getActivity().getApplicationContext(),binding.getViewModel().getName(), Toast.LENGTH_LONG).show();

                EditText text2= binding.editTextTextPersonName2;
                String s2 = text2.getText().toString();
                Toast.makeText(getActivity().getApplicationContext(),s2, Toast.LENGTH_LONG).show();

                //EditText text3= binding.editTextTextPersonName2;
                //String s3 = text3.getText().toString();
                Toast.makeText(getActivity().getApplicationContext(),binding.getViewModel().getVilleNaiss(), Toast.LENGTH_LONG).show();

                //NavHostFragment.findNavController(FirstFragment.this)
                  //      .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
   public void onCreateOptionsMenu (Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.newmenu, menu);
        super.onCreateOptionsMenu(menu,inflater);
   }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}