package com.example.myhouseremote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 화면 전환 - 인텐트 날리기 (startActivity)
        //     1. 다음 넘어갈 화면을 준비한다 (layout xml, java)
        //    2. AndroidManifest.xml 에 Activity 를 등록한다
        //    3. Intent 객체를 만들어서 startActivity 한다

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
// 생성자의 첫번째 인자 : 액티비티 자기 자신 = this
// (액티비티 안의 이너/익명 클래스 속에서는 인텐트를 생성할 때 this 대신 MianActivity.this를 사용)

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener());{
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);
            }
            }
        }
    }
} // 버튼 2 > apge 2

    Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()){
@Override
public void onClick(View view) {
        Intent intent = new Intent(
        getApplicationContext(),
        Main43ctivity_room_1.class);
        startActivity(intent);
        )
        }
        }
    }
} // 버튼

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()){
@Override
public void onClick(View view) {
        Intent intent = new Intent(
        getApplicationContext(),
        Main4Activity_room_2.class);
        startActivity(intent);
        )
        }
        }
   }
}


<TextView
    android:id="@+id/textViewAutoSize"
            android:layout_width="match_parent"
            android:layout_height="80dp"
            android:layout_marginTop="4dp"
            android:background="@android:color/white"
            android:text="내 집 평면도"
            android:textSize="20sp"
            android:textColor="@android:color/black"
            app:autoSizeTextType="uniform"
            app:autoSizeMinTextSize="20sp"
            app:autoSizeMaxTextSize="50dp"/>
// 첫 페이지 "내 집 평면도" 글씨 설정

<Button
        android:"@+id/activity_main2

// 누르면 다른 액티비티로 전환