package top.stores.activitylifecycle.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import top.stores.activitylifecycle.R;
import top.stores.activitylifecycle.fragments.FragmentOne;
import top.stores.activitylifecycle.fragments.FragmentTwo;

public class SecondActivity extends AppCompatActivity {

    private FragmentOne fragmentOne = new FragmentOne();
    private FragmentTwo fragmentTwo = new FragmentTwo();
    private boolean phone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(phone){
            setContentView(R.layout.activity_second);
            moveFragements(fragmentOne);

        }else {
            setContentView(R.layout.tablet);
            moveTwoFragementsTablet(fragmentOne,fragmentTwo);
        }

    }



    private void moveFragements(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

    private void moveFragementsTablet(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.fragment_container_tablet, fragment).commit();
    }

    private void moveTwoFragementsTablet(Fragment fragment1, Fragment fragment2 ){
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.tablet_layout_1, fragment1).commit();
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.tablet_layout_2, fragment2).commit();
    }

}