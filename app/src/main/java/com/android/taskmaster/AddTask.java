package com.android.taskmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddTask extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

//        View totalTaskNumber = AddTask.this.findViewById(R.id.total_task_no);
        Button addTaskBtn = AddTask.this.findViewById(R.id.addTaskBtn);
        addTaskBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(AddTask.this,AllTask.class);
//                MainActivity.this.startActivity(intent);
//                EditText totalTaskNumber = AddTask.this.findViewById(R.id.total_task_no);
//                int countTask=Integer.parseInt(totalTaskNumber.getText().toString());
                EditText taskTitle = AddTask.this.findViewById(R.id.task_title_input);
                EditText taskDesc = AddTask.this.findViewById(R.id.task_desc);
                if (!taskTitle.getText().toString().equals("") && !taskDesc.getText().toString().equals("")) {
                    Toast.makeText(AddTask.this, "Submitted!!", Toast.LENGTH_SHORT).show();
//                    intent.putExtra("countTask", countTask);
//                    AddTask.this.startActivity(intent);

                }
                else {
                    Toast.makeText(AddTask.this, "Please fill the form", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}