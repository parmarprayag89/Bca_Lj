package com.example.bca_lj;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class CommonMethod {
    CommonMethod(Context context, String mess){
        Toast.makeText(context,mess,Toast.LENGTH_LONG).show();

    }
    CommonMethod(View view , String mess){
        Snackbar.make(view,mess,Snackbar.LENGTH_LONG).show();
    }
    CommonMethod(Context context,  Class<?> nextclass){
        Intent intent = new Intent(context,nextclass);
        context.startActivity(intent);
    }
}
