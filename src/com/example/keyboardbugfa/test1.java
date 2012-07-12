package com.example.keyboardbugfa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class test1 extends Fragment
{
	   public View onCreateView(LayoutInflater inflater, ViewGroup container,
               Bundle savedInstanceState) {
       	
       	View view = inflater.inflate(R.layout.test1, container, false);
       	
        final Button button = (Button) view.findViewById(R.id.button1);
     		button.setOnClickListener(new View.OnClickListener()
     		{
     			public void onClick(View v)
     			{
     				
     				 test2 fragment = new  test2();
     			
     		
     				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
     				FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
     				 Fragment fragment1 = getActivity().getSupportFragmentManager().findFragmentByTag("simple");
     				fragmentTransaction.detach(fragment1);
     				fragmentTransaction.add(R.id.realtabcontent, fragment);
     				// fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);

     				fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
     				fragmentTransaction.addToBackStack(null);
     				fragmentTransaction.commit();
     				    			
     				
     			}
     		});
       	return view;
	   }
}
