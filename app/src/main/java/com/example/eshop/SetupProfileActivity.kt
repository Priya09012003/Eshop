package com.example.eshop

import android.app.ProgressDialog
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage

class SetupProfileActivity:AppCompatActivity() {

    var auth: FirebaseAuth? =null
    var database : FirebaseDatabase? = null
    var storage : FirebaseStorage?=null
    var selectedImage: Uri?=null
    var dialog :ProgressDialog? = null
    //var firebaseFireStore:FirebaseFireStorage? =null

    override fun  onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup_profile)


    }
}