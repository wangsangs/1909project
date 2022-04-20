package com.example.a1909aproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a1909aproject.databinding.ActivityMainBinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ObservableField<String> textTXT = new ObservableField<>();
//    ObservableInt observableInt = new ObservableInt();
    @RequiresApi(api= Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setOwn(this);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//
//        Class<? extends ArrayList> aClass = list.getClass();
//        Method[] methods = aClass.getDeclaredMethods();
//        for (Method method:methods){
//            if (method.getName().equals("add")){
//                try {
//                    method.invoke(list,20);
//                    method.invoke(list,100.0f);
//                    method.invoke(list,1000L);
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//        observableInt.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(Observable sender, int propertyId) {
//
//            }
//        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFous){
        super.onWindowFocusChanged(hasFous);
        textTXT.set("我是土狗他爹");
    }

    public void onclick(View view){
//        Toast.makeText(this, "111", Toast.LENGTH_SHORT).show();
        String s = textTXT.get();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
