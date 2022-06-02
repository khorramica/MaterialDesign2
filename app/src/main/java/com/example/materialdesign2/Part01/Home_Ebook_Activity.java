package com.example.materialdesign2.Part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.materialdesign2.Part01.adapter.NewBookAdapter;
import com.example.materialdesign2.Part01.adapter.PopularBookAdapter;
import com.example.materialdesign2.Part01.adapter.VoceBookAdapter;
import com.example.materialdesign2.Part01.model.Book;
import com.example.materialdesign2.R;

import java.util.ArrayList;
import java.util.List;

public class Home_Ebook_Activity extends AppCompatActivity {


    //New Books
    RecyclerView recyclerViewNew;
    NewBookAdapter newBookAdapter;
    List<Book> newData = new ArrayList<>();


    //Popular Books
    RecyclerView recyclerViewPopular;
    PopularBookAdapter popularBookAdapter;
    List<Book> popularData = new ArrayList<>();


    //Sound Books
    RecyclerView recyclerViewVoice;
    VoceBookAdapter voiceBookAdapter;
    List<Book> voiceData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ebook);

        //Voices
        recyclerViewVoice = findViewById(R.id.recycleViewer_Voice);
        recyclerViewVoice.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewVoice.setHasFixedSize(true);

        voiceData.add(new Book("https://newcdn.fidibo.com/images/books/114901_36919_normal.jpg"));
        voiceData.add(new Book("https://newcdn.fidibo.com/images/books/114901_36919_normal.jpg"));
        voiceData.add(new Book("https://newcdn.fidibo.com/images/books/114901_36919_normal.jpg"));
        voiceData.add(new Book("https://newcdn.fidibo.com/images/books/114901_36919_normal.jpg"));
        voiceData.add(new Book("https://newcdn.fidibo.com/images/books/114901_36919_normal.jpg"));

        voiceBookAdapter = new VoceBookAdapter(this, voiceData);
        recyclerViewVoice.setAdapter(voiceBookAdapter);


        //popular
        recyclerViewPopular = findViewById(R.id.recycleViewer_Popular);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewPopular.setHasFixedSize(true);
        popularData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        popularData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        popularData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        popularData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        popularData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        popularBookAdapter = new PopularBookAdapter(this, popularData);
        recyclerViewPopular.setAdapter(popularBookAdapter);


        //new
        recyclerViewNew = findViewById(R.id.recycleViewer_New);
        recyclerViewNew.setLayoutManager(new GridLayoutManager(this,3));
        recyclerViewNew.setHasFixedSize(true);

        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newData.add(new Book("کتاب آسان ترین روش ترک سیگار", "آلن کار", "https://newcdn.fidibo.com/images/books/3415_97206_normal.jpg"));
        newBookAdapter = new NewBookAdapter(this, newData);
        recyclerViewNew.setAdapter(newBookAdapter);

    }
}