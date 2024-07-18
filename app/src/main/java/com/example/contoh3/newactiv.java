package com.example.contoh3;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.Firebase;

public class newactiv extends AppCompatActivity {

    String id="", judul, deskripsi, image;
    private static final int PICK_IMAGE_REQUEST = 1;

    private EditText title, desc;
    private ImageView imageView;
    private Button saveNews, ChoseImage;
    private Uri imageUri;

    private FirebaseFirestore dbNews;
    private FirebaseStorage storage;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newactiv);

        dbNews = FirebaseFirestore.getInstance();


        });
    }
}