package com.example.resses.thistym;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Captured extends AppCompatActivity {

    Button CaptureImage, BrowseInfo1;
    ImageView cameraImage;

    final int CAMERA_CAPTURE = 1;
    final int CROP_PIC = 2;
    private Uri picUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captured);

        CaptureImage = (Button)findViewById(R.id.capture);
        BrowseInfo1 = (Button)findViewById(R.id.browse1);
        cameraImage = (ImageView)findViewById(R.id.CimageView);

        CaptureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camImageIntent = new Intent();
                camImageIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camImageIntent,1);

            }
        });

        BrowseInfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && resultCode == RESULT_OK){
            Bitmap photo = (Bitmap)data.getExtras().get("data");
            cameraImage.setImageBitmap(photo);
        }
    }
}
