package com.tadi.fragment;

import com.example.tadiproject.MainActivity;
import com.example.tadiproject.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginFragment extends Fragment {

	private EditText tEmail;
	private EditText tPassword;
	private Button bLogin;
	private ImageView bFacebook;
	
	public LoginFragment() {
		// TODO Auto-generated constructor stub
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_login, container, false);
		tEmail = (EditText) view.findViewById(R.id.editText1);
		tPassword = (EditText) view.findViewById(R.id.editText2);
		bLogin = (Button) view.findViewById(R.id.button1);
		bLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(tEmail.getText().toString().equals("dummy") && tPassword.getText().toString().equals("dummy"))
					login();
			}
		});
		bFacebook = (ImageView) view.findViewById(R.id.imageView2);
		return view;
	}
	
	public void login(){
		MainActivity.loggedIn = true;
		((MainActivity)getActivity()).getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new DonateListFragment()).commit();
	}

}
