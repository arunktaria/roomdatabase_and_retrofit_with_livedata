package com.example.task04_08;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.task04_08.Login_signup.signUp;
import com.example.task04_08.Login_signup.userLogin;
import com.example.task04_08.RecyclerView.userList;

public class FragmentAdapter extends FragmentStateAdapter{


    public FragmentAdapter(@NonNull  FragmentManager fragmentManager, @NonNull  Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull

    @Override
    public Fragment createFragment(int position) {
      switch (position)
      {
          case 1: return  new signUp();
          case 2: return new userList();
      }

        return new userLogin();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}