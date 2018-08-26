package com.sewon.android.helloandroid3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * Hello Android 프로젝트
 */
public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //현재 액티비티에서 activity_main 파일을 화면으로 사용하겠다.
        setContentView(R.layout.activity_main);

        //화면과 소스코드 연결하기 - findViewById()
        tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);

        //버튼 클릭처리 - 앞으로 실행할 리스너를 생성
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tv.setText("Hello Android!");
            }
        };
        // 위에서 작성한 리스너를 등록
        bt.setOnClickListener(listener);


    }
}
