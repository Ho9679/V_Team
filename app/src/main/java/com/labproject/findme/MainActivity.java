package com.labproject.findme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;
    private final int Fragment_3 = 3;
    private final int Fragment_4 = 4;
    private final int Fragment_5 = 5;
    private final int Fragment_6 = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.sub1_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_1);
            }
        });
        findViewById(R.id.sub1_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_2);
            }
        });
        findViewById(R.id.sub1_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_3);
            }
        });
        findViewById(R.id.sub1_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_4);
            }
        });
        findViewById(R.id.sub1_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_5);
            }
        });
        findViewById(R.id.sub1_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_6);
            }
        });
        FragmentView(Fragment_1);
    }

    private void FragmentView(int fragment){

        //FragmentTransactiom를 이용해 프래그먼트사용
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                // 첫번 째 프래그먼트 호출
                Sub1_Menu1Activity fragment1 = new Sub1_Menu1Activity();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                // 두번 째 프래그먼트 호출
                Sub1_Menu2Activity fragment2 = new Sub1_Menu2Activity();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;

            case 3:
                // 두번 째 프래그먼트 호출
                Sub1_Menu3Activity fragment3 = new Sub1_Menu3Activity();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.commit();
                break;

            case 4:
                // 두번 째 프래그먼트 호출
                Sub1_Menu4Activity fragment4 = new Sub1_Menu4Activity();
                transaction.replace(R.id.fragment_container, fragment4);
                transaction.commit();
                break;

            case 5:
                // 두번 째 프래그먼트 호출
                Sub1_Menu5Activity fragment5 = new Sub1_Menu5Activity();
                transaction.replace(R.id.fragment_container, fragment5);
                transaction.commit();
                break;

            case 6:
                // 두번 째 프래그먼트 호출
                Sub1_Menu6Activity fragment6 = new Sub1_Menu6Activity();
                transaction.replace(R.id.fragment_container, fragment6);
                transaction.commit();
                break;
        }

    }
}